
import antlr4.GrammarInitBaseVisitor;
import antlr4.GrammarInitLexer;
import antlr4.GrammarInitParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main extends GrammarInitBaseVisitor<String> {
    public static void main(String[] args) throws ParseCancellationException, IOException {
        String file = "src/test3.txt";

        CharStream chars = fromFileName(file);

        try {
            parse(chars);
        }catch (Exception e){
            throw new EOFException(e.toString());
        }
    }

    public static String parse(CharStream text) throws IOException {
        var KotlinLexer = new GrammarInitLexer(text);
        KotlinLexer.removeErrorListeners();
        KotlinLexer.addErrorListener(new BaseErrorListener() {

            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                                    int charPositionInLine, String msg, RecognitionException e) {
                throw new RuntimeException("Nieznany token w linii "+ line + " na pozycji " + charPositionInLine);
            }

        });
        var commonTokenStream = new CommonTokenStream(KotlinLexer);
        var KotlinParser = new GrammarInitParser(commonTokenStream);
        KotlinParser.removeErrorListeners();
        KotlinParser.addErrorListener(new BaseErrorListener() {

            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                                    int charPositionInLine, String msg, RecognitionException e) {
                throw new RuntimeException("Zla instrukcja w linii " + line + " na pozycji " + charPositionInLine);
            }

        });

        var KotlinContext = KotlinParser.startowy();
        var visitor = new MyVisitor();


        var result = visitor.visit(KotlinContext);

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/javaTestOutput.java"));
        writer.write(result);

        writer.close();

        System.out.println(result);

        return result;
    }

}

