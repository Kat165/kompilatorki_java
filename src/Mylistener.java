import antlr4.GrammarInitBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

public class Mylistener extends GrammarInitBaseListener {
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        //System.out.println("rule entered: " + ctx.getText());      //code that executes per rule
    }
}
