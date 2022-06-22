import antlr4.GrammarInitBaseVisitor;
import antlr4.GrammarInitParser;

import java.util.Objects;

public class MyVisitor extends GrammarInitBaseVisitor<String> {
    int numberOfIndentations = 0;
    @Override
    public String visitStartowy(GrammarInitParser.StartowyContext ctx) {
        StringBuilder result = new StringBuilder();
        int number = 0;
        for (var c:ctx.children
        ) {
            var child = c.getText();
            if (child.startsWith("private") || child.startsWith("public") ||child.startsWith("protected") ||child.startsWith("internal"))
            {
                result.append(visitClassDeclaration(ctx.classDeclaration()));
                number++;
            }
            result.append("\n");
        }
        return result.toString();
    }

    @Override
    public String visitCondition(GrammarInitParser.ConditionContext ctx) {
        StringBuilder result = new StringBuilder();

        int t = 0;
        int c = 0;
        int l = 0;
        for (var x:ctx.children
             ) {
            var child = x.getText();
            if(child.isEmpty())
                return "";
            if (Character.isLetter(child.charAt(0))){
                result.append(ctx.Nazwa(l).getText());
                l++;
            }else
            if(child.startsWith("==")){
                result.append(ctx.EQUALS().getText());
                t++;
            }
            if(child.startsWith("!=")){
                result.append(ctx.NOT_EQUALS().getText());
                t++;
            }else
            if(child.startsWith("<=")){
                result.append(ctx.SMALLER_OR_EQUAL().getText());
                t++;
            }else
            if(child.startsWith(">=")){
                result.append(ctx.BIGGER_OR_EQUAL().getText());
                t++;
            }else
            if(child.startsWith("<")){
                result.append(ctx.SMALLER().getText());
                t++;
            }else
            if(child.startsWith(">")){
                result.append(ctx.BIGGER().getText());
                t++;
            }else if(child.contains(".") && Character.isDigit(child.charAt(0))){
                result.append(ctx.Liczba_zmiennoprzecin(t));
                t++;
            }
            else if(Character.isDigit(child.charAt(0))) {
                result.append(ctx.Liczba_calk(c));
                c++;
            }

        }
        return result.toString();
    }

    @Override
    public String visitAssignment(GrammarInitParser.AssignmentContext ctx) {
        StringBuilder result = new StringBuilder();
        if(ctx.variable() != null){
            result.append(visitVariable(ctx.variable()));
        }else {
            result.append(ctx.Nazwa(0));
        }
        result.append(ctx.ASSIGN());
        if(ctx.function_call()!=null){
            result.append(visitFunction_call(ctx.function_call()));
            result.append(";");
        }else if(ctx.Liczba_calk()!= null){
            result.append(ctx.Liczba_calk());
        }else if(ctx.Liczba_zmiennoprzecin() != null){
            result.append(ctx.Liczba_zmiennoprzecin());
        }else if(ctx.Nazwa(1)!=null){
            result.append(ctx.Nazwa(1));
        }else {
            result.append(ctx.Nazwa(0));
        }
        result.append(";\n");
        return result.toString();
    }

    @Override
    public String visitIf_stat(GrammarInitParser.If_statContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(ctx.IF_INIT().getText()+ ctx.LEFT_BRACKET().getText());
        result.append(visitCondition(ctx.condition()));
        result.append(ctx.RIGHT_BRACKET().getText());
        result.append(ctx.LEFT_CURVY_BRACKET());
        result.append(visitInstruction(ctx.instruction()));
        result.append("\n");
        result.append(ctx.RIGHT_CURVY_BRACKET());


        int l = 0;
        for (var x:ctx.children
             ) {
            var child = x.getText();
            if(child.startsWith("else")){
                result.append(visitElse_stat(ctx.else_stat(l)));
                l++;
            }
        }


        return result.toString();
    }

    @Override
    public String visitElse_stat(GrammarInitParser.Else_statContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(ctx.ELSE_INIT());
        result.append(ctx.LEFT_CURVY_BRACKET());
        result.append(visitInstruction(ctx.instruction()));
        result.append("\n");
        result.append(ctx.RIGHT_CURVY_BRACKET());
        result.append("\n");
        return result.toString();
    }

    @Override
    public String visitWhile_loop(GrammarInitParser.While_loopContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(ctx.WHILE_INIT());
        result.append(ctx.LEFT_BRACKET());
        result.append(visitCondition(ctx.condition()));
        result.append(ctx.RIGHT_BRACKET());
        result.append(ctx.LEFT_CURVY_BRACKET());
        result.append(visitInstruction(ctx.instruction()));
        result.append(ctx.RIGHT_CURVY_BRACKET());
        result.append("\n");
        result.append("\n");
        return result.toString();
    }

    @Override
    public String visitFor_loop(GrammarInitParser.For_loopContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(ctx.FOR_INIT());
        result.append(ctx.LEFT_BRACKET());
        result.append(visitFor_inside(ctx.for_inside()));
        result.append(ctx.RIGHT_BRACKET());
        result.append(ctx.LEFT_CURVY_BRACKET());
        result.append("\n");
        result.append(visitInstruction(ctx.instruction()));
        result.append(ctx.RIGHT_CURVY_BRACKET());
        result.append("\n");
        result.append("\n");
        return result.toString();
    }

    @Override
    public String visitFor_inside(GrammarInitParser.For_insideContext ctx) {
        StringBuilder result = new StringBuilder();

        for (var x:ctx.children) {
            var child = x.getText();

            if(child.isEmpty())
                return "";
            if (Character.isLetter(child.charAt(0))){
                result.append(ctx.Nazwa().getText());
            }
            else {
                result.append("int i = ");
                result.append(ctx.Liczba_calk(0));
                result.append(";");
                result.append("i <= ");
                result.append(ctx.Liczba_calk(1));
                result.append(";");
                result.append("i++");

            }
            break;
        }

        return result.toString();

    }

    @Override
    public String visitDo_while_loop(GrammarInitParser.Do_while_loopContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(ctx.DO_INIT());
        result.append(ctx.LEFT_CURVY_BRACKET());
        result.append(visitInstruction(ctx.instruction()));
        result.append(ctx.RIGHT_CURVY_BRACKET());
        result.append(ctx.WHILE_INIT());
        result.append(ctx.LEFT_BRACKET());
        result.append(visitCondition(ctx.condition()));
        result.append(ctx.RIGHT_BRACKET());
        result.append(";\n");
        return result.toString();
    }

    @Override
    public String visitFunction_body(GrammarInitParser.Function_bodyContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("\n");
        result.append(visitInstruction(ctx.instruction()));
        result.append("}");
        return result.toString();
    }

    @Override
    public String visitFunction(GrammarInitParser.FunctionContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("public static ");
        if(ctx.type()!=null){
            result.append(visitType(ctx.type()));
        }else
            result.append("void ");

        result.append(ctx.Nazwa().getText());
        result.append(ctx.LEFT_BRACKET());

        if(Objects.equals(ctx.Nazwa().getText(), "main")){
            result.append("String[] args");
        }else
        if(ctx.fun_arg()!=null)
            result.append(visitFun_arg(ctx.fun_arg()));
        result.append(ctx.RIGHT_BRACKET());
        result.append(visitFunction_body(ctx.function_body()));
        result.append("\n");
        return result.toString();
    }

    @Override
    public String visitTry_catch_stat(GrammarInitParser.Try_catch_statContext ctx) {
        return super.visitTry_catch_stat(ctx);
    }

    @Override
    public String visitReturn_stat(GrammarInitParser.Return_statContext ctx) {
        StringBuilder result = new StringBuilder();

        result.append("\n");
        result.append(ctx.RETURN_INIT());
        result.append(" ");

        if(ctx.Liczba_zmiennoprzecin()!=null){
            result.append(ctx.Liczba_zmiennoprzecin().getText());
        }else if(ctx.Nazwa()!=null){
            result.append(ctx.Nazwa().getText());
        }else if(ctx.Liczba_calk()!=null){
            result.append(ctx.Liczba_calk());
        }

        result.append(";");
        return result.toString();
    }

    @Override
    public String visitKomentarz_poj(GrammarInitParser.Komentarz_pojContext ctx) {
        return super.visitKomentarz_poj(ctx);
    }

    @Override
    public String visitKomentarz_wiel(GrammarInitParser.Komentarz_wielContext ctx) {
        return super.visitKomentarz_wiel(ctx);
    }

    @Override
    public String visitInstruction(GrammarInitParser.InstructionContext ctx) {
        StringBuilder result = new StringBuilder();
        if(ctx.children == null){
            return " ";
        }
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;

        for (var x:ctx.children
             ) {
            var child = x.getText();
            if(child.isEmpty())
                return "";
            else
            if(child.startsWith("return")){
                result.append(visitReturn_stat(ctx.return_stat(a)));
                a++;
            }else
            if (child.startsWith("for"))
            {
                result.append(visitFor_loop(ctx.for_loop(b)));
                b++;
            }else
            if(child.startsWith("if")) {
                result.append(visitIf_stat(ctx.if_stat(c)));
                c++;
            }else
            if (child.startsWith("while")){
                result.append(visitWhile_loop(ctx.while_loop(d)));
                d++;
            }else
            if (child.startsWith("var")|child.startsWith("val") && child.contains("=")){
                result.append(visitAssignment(ctx.assignment(e)));
                e++;
            }else
            if (child.startsWith("var")|child.startsWith("val")){
                result.append(visitVariable(ctx.variable(f)));
                f++;
            }else
            if (child.startsWith("do")){
                result.append(visitDo_while_loop(ctx.do_while_loop(g)));
                g++;
            }else
            if (child.startsWith("println")){
                result.append(visitPrintln(ctx.println(h)) + ";");
                result.append("\n");
                h++;
            }else
                if (child.startsWith("++")){
                result.append(ctx.INCREMENT(i).getText());
                i++;
            }else
            if(child.contains(")")){
                result.append(visitFunction_call(ctx.function_call(j)));
                result.append(";");
                j++;
            }else
            if(child.startsWith("else")){
                result.append(" ");
            } else if (child.contains("--")) {
                result.append(visitDecrement(ctx.decrement(l)));
                l++;

            } else if(!child.contains(")") && Character.isLetter(child.charAt(0)) && !child.startsWith("else") && !child.startsWith("var")){
                result.append(ctx.Nazwa(k).getText());
                k++;
            }


        }

        return result.toString();
    }

    @Override
    public String visitClassDeclaration(GrammarInitParser.ClassDeclarationContext ctx) {
        numberOfIndentations++;
        var type ="";
        if(ctx.PUBLIC()!= null)
            type = ctx.PUBLIC().getText() + " class ";
        if(ctx.PRIVATE()!=null)
            type = ctx.PRIVATE().getText()+ " class ";
        if(ctx.PROTECTED()!= null)
            type = ctx.PROTECTED().getText()+ " class ";
        if(ctx.INTERNAL()!=null)
            type = ctx.INTERNAL().getText()+ " class ";

        var x = ctx.class_body() != null? visitClass_body(ctx.class_body()):" ";
        //return $"def {context.IDENTIFIER().GetText()}({parameters}):\n{VisitBlock(context.block())}";
        //return {ctx.Nazwa().getText()}({x})
        return type + ctx.Nazwa().getText() +x;
    }

    @Override
    public String visitVariable(GrammarInitParser.VariableContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(visitType(ctx.type()));
        result.append(ctx.Nazwa().getText());
        return result.toString();
    }

    @Override
    public String visitClass_body(GrammarInitParser.Class_bodyContext ctx) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        int f = 0;
        int v = 0;
        for (var c:ctx.children
        ) {
            var child = c.getText();
            if(child.isEmpty() || child == null)
                return "";
            if(child.startsWith("fun") && ctx.function()!=null){
                result.append(visitFunction(ctx.function(f)));
                f++;
            }else if (child.contains("=")){
                result.append(visitAssignment(ctx.assignment(n)));
                n++;
            }else if(!child.contains("=") && !child.startsWith("fun") && Character.isLetter(child.charAt(0))){
                result.append((visitVariable(ctx.variable(v))));
                v++;
            }

        }
        return "{\n" + result.toString() + "}";
    }

    @Override
    public String visitFunction_call(GrammarInitParser.Function_callContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(ctx.Nazwa().getText());
        result.append(ctx.LEFT_BRACKET());
        int a = 0;
        for (var x:ctx.children){
            if(ctx.argument_list(a)!=null){
                result.append(visitArgument_list(ctx.argument_list(a)));
                a++;
            }
        }
        result.append(ctx.RIGHT_BRACKET());
        return result.toString();
    }

    @Override
    public String visitArgument_list(GrammarInitParser.Argument_listContext ctx) {
        StringBuilder result = new StringBuilder();
        int l = 0;
        for (var x:ctx.children){
            var child = x.getText();
            if(child.contains(".")){
                result.append(ctx.Liczba_zmiennoprzecin());

            }else if(Character.isLetter(child.charAt(0))){
                result.append(ctx.Nazwa());
            }else {
                result.append(ctx.Liczba_calk());
            }
        }
        return result.toString();
    }

    @Override
    public String visitFun_arg(GrammarInitParser.Fun_argContext ctx) {
        StringBuilder result = new StringBuilder();
        int t = 0;

        for (var x:ctx.children){
            var child = x.getText();
            if(ctx.type(t)!=null){
                result.append(visitType(ctx.type(t)));
            }
            if(ctx.Nazwa(t)!=null){
                result.append(ctx.Nazwa(t));
            }
            if(ctx.DELI(t)!=null){
                result.append(ctx.DELI());
                result.append(" ");
            }
            t++;
        }

        return result.toString();
    }

    @Override
    public String visitType(GrammarInitParser.TypeContext ctx) {
        StringBuilder result = new StringBuilder();
        if(ctx.STRING()!= null)
            result.append(ctx.STRING().getText());
        else
            result.append("int");
        result.append(" ");
        return result.toString();
    }

    @Override
    public String visitPrintln(GrammarInitParser.PrintlnContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("\n");
        result.append("System.out.println(");
        if(ctx.Nazwa()!=null){
            result.append(ctx.Nazwa().getText());
        }else if(ctx.STRING()!=null){
            result.append(ctx.STRING().getText());
        }else if(ctx.function_call()!=null){
            result.append(visitFunction_call(ctx.function_call()));
        }
        result.append(")");
        return result.toString();
    }

    @Override
    public String visitDecrement(GrammarInitParser.DecrementContext ctx) {
        StringBuilder result = new StringBuilder();
        if(ctx.Nazwa()!=null)
            result.append(ctx.Nazwa().getText());
        else result.append(ctx.Liczba_calk());

        result.append(ctx.DECREMENT().getText());
        result.append(";\n");

        return result.toString();
    }
}
