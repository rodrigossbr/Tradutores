

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class ExecutaSonda {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        SondaLexer lexer = new SondaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SondaParser parser = new SondaParser(tokens);
        ParseTree tree = parser.prog(); // parse; start at prog <label id="code.tour.main.6"/>
        //System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>

        SondaEvalVisitor sondaEvalVisitor = new SondaEvalVisitor();
        sondaEvalVisitor.visit(tree);
        sondaEvalVisitor.PrintTotalDistance();
    }
}

