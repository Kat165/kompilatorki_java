grammar GrammarInit;
/** A rule called init that matches comma-separated values between {...}. */
PLUS:'+';
MINUS:'-';
MULTIPLY:'*';
DIVIDE:'/';
PROCENT:'%';
INCREMENT:'++';
DECREMENT:'--';
AND:'&&';
OR:'||';
NOT:'!';
ASSIGN:'=';
ASSIGN_ADD:'+=';
ASSIGN_MINUS:'-=';
ASSIGN_MULTIPLY:'*=';
ASSIGN_DIVIDE:'/=';
ASSIGN_PERCENT:'%=';
EQUALS:'==';
NOT_EQUALS:'!=';
SMALLER:'<';
BIGGER:'>';
SMALLER_OR_EQUAL:'⇐';
BIGGER_OR_EQUAL:'>=';
LEFT_INDEX:'[';
RIGHT_INDEX:']';
LEFT_BRACKET:'(';
RIGHT_BRACKET:')';
LEFT_CURVY_BRACKET:'{';
RIGHT_CURVY_BRACKET:'}';
DELI:',';
DOT:'.';
NL: '\n' ->skip;
NL2: '\r'->skip;
NL3: '\t'->skip;
PACKAGE:'package';
IMPORT:'import';
CLASS:'class';
FUN:'fun';
OBJECT:'object';
VAL_INIT:'val';
VAR_INIT:'var';
CONSTRUCTOR:'constructor';
BY:'by';
THIS:'this';
WHERE:'where';
IF_INIT:'if';
ELSE_INIT:'else';
WHEN:'when';
TRY_INIT:'try';
CATCH_INIT:'catch';
FOR_INIT:'for';
DO_INIT:'do';
WHILE_INIT:'while';
THROW_INIT:'throw';
RETURN_INIT:'return';
CONT_INIT:'continue';
BREAK_INIT:'break';
AS:'as';
IS:'is';
IN:'in';
NOT_IS:'!is';
NOT_IN:'!in';
OUT:'out';
DYNAMIC:'dynamic';
PUBLIC:'public';
PRIVATE:'private';
PROTECTED:'protected';
INTERNAL:'internal';
ENUM:'enum';
OVERRIDE:'override';
OPEN:'open';
LATEINIT:'lateinit';
IT:'it';
NULL:'null';
BooleanLiteral: 'true'| 'false';
SPACE: ' ' ->skip;
COMM: '„';
COM: '`';
DOWNTO: 'downTo';
STEP: 'step';
DOTDOT: '..';
STRING: 'String';
INT: 'Int';
COLON: ':';
PRINTLN: 'println';
EscapedIdentifier: '\\' ('t' | 'b' | 'r' | 'n' | '\'' | '”' | '\\' | '$');
Liczba_calk: Cyfra_niezer Cyfry | Cyfra;
Nazwa: Litera (Litera | Cyfra)*;

Char: COM (Litera | Cyfra | EscapedIdentifier) COM ;
String: COMM (Litery | Cyfry | SPACE) COMM ;
Liczba_zmiennoprzecin: Cyfry DOT Cyfry | Cyfry;

fragment Cyfra: [0-9];
fragment Litera: [a-zA-Z];
fragment Litery: Litera ;
fragment Cyfra_niezer: [1-9];
fragment Cyfry: Cyfra+;
fragment Initial: VAR_INIT | VAL_INIT;

startowy: classDeclaration EOF;

condition: (Nazwa | Liczba_calk | Liczba_zmiennoprzecin) (EQUALS | NOT_EQUALS | SMALLER | BIGGER | SMALLER_OR_EQUAL | BIGGER_OR_EQUAL) (Nazwa | Liczba_calk | Liczba_zmiennoprzecin); //zmienone

assignment: (variable | Nazwa)  ASSIGN  (Nazwa | Liczba_zmiennoprzecin | Liczba_calk | function_call); //zmienone

if_stat: IF_INIT LEFT_BRACKET condition RIGHT_BRACKET LEFT_CURVY_BRACKET instruction RIGHT_CURVY_BRACKET else_stat*;

else_stat: ELSE_INIT LEFT_CURVY_BRACKET instruction RIGHT_CURVY_BRACKET;

while_loop: WHILE_INIT LEFT_BRACKET condition RIGHT_BRACKET LEFT_CURVY_BRACKET instruction RIGHT_CURVY_BRACKET;

for_loop: FOR_INIT LEFT_BRACKET Nazwa IN
    for_inside
    RIGHT_BRACKET LEFT_CURVY_BRACKET instruction RIGHT_CURVY_BRACKET;

for_inside: (Liczba_calk DOTDOT Liczba_calk)|
    Nazwa;

do_while_loop: DO_INIT LEFT_CURVY_BRACKET instruction RIGHT_CURVY_BRACKET WHILE_INIT LEFT_BRACKET condition RIGHT_BRACKET;

function_body:  LEFT_CURVY_BRACKET instruction RIGHT_CURVY_BRACKET;

function: FUN Nazwa LEFT_BRACKET fun_arg? RIGHT_BRACKET (COLON type)? function_body?;

try_catch_stat: TRY_INIT LEFT_CURVY_BRACKET  instruction  RIGHT_CURVY_BRACKET CATCH_INIT LEFT_CURVY_BRACKET instruction RIGHT_CURVY_BRACKET;

return_stat: RETURN_INIT (Nazwa | Liczba_zmiennoprzecin | Liczba_calk); //zmienone

komentarz_poj: DIVIDE DIVIDE String EscapedIdentifier;

komentarz_wiel: DIVIDE MULTIPLY String MULTIPLY DIVIDE;

instruction: (for_loop | if_stat | while_loop | Nazwa | variable | assignment | do_while_loop | function | try_catch_stat | komentarz_poj | komentarz_wiel|return_stat|NL |Nazwa INCREMENT | function_call| println|decrement)*;

classDeclaration: (PRIVATE | PUBLIC | PROTECTED | INTERNAL) CLASS Nazwa LEFT_BRACKET RIGHT_BRACKET LEFT_CURVY_BRACKET (class_body)? RIGHT_CURVY_BRACKET;

variable: VAR_INIT Nazwa (COLON type)?;

class_body: (assignment | function | variable)*;

function_call: Nazwa LEFT_BRACKET argument_list* RIGHT_BRACKET;

argument_list: Nazwa | Liczba_calk | Liczba_zmiennoprzecin (DELI (Nazwa | Liczba_calk | Liczba_zmiennoprzecin))*; //poprawić //wykopać Liczba_zmiennopoz

fun_arg: Nazwa COLON type (DELI Nazwa COLON type)*;

type: STRING|INT;

println: PRINTLN LEFT_BRACKET (Nazwa | STRING | function_call) RIGHT_BRACKET;

decrement: (Liczba_calk|Nazwa) DECREMENT;
