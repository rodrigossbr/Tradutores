import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class ExecutaCiclomatica {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        CiclomaticaLexer lexer = new CiclomaticaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CiclomaticaParser parser = new CiclomaticaParser(tokens);
        ParseTree tree = parser.prog(); // parse; start at prog <label id="code.tour.main.6"/>
        //System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>

        CiclomaticaEvalVisitor ciclomaticaEvalVisitor = new CiclomaticaEvalVisitor();
        ciclomaticaEvalVisitor.visit(tree);
        ciclomaticaEvalVisitor.PrintTotalComplexity();
    }
}
