package conversores;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import tradutorCsharp.CsharpEvalVisitor;
import tradutorCsharp.CsharpLexer;
import tradutorCsharp.CsharpParser;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by rodrigo on 09/06/16.
 */
public class ConversorTs {

    private String pastaOrigem;
    private String pastaDestino;
    private ArrayList<ClasseTs> classesTs;

    public ConversorTs(String pastaOrigem, String pastaDestino){
        this.pastaOrigem = pastaOrigem;
        this.pastaDestino = pastaDestino;
        this.classesTs = new ArrayList<ClasseTs>();
    }

    public void addClasse(ClasseTs classe){
        if(classe != null)
            this.classesTs.add(classe);
    }

    public String modoDebug(){
        this.carregaPastaOrigem(this.pastaOrigem);

        StringBuffer buffer = new StringBuffer();
        for (ClasseTs classe: this.classesTs) {
            buffer.append(classe.render());
        }
        return buffer.toString();
    }

    public void converteParaArquivos(){
        this.carregaPastaOrigem(this.pastaOrigem);
        this.salvaArquivos(this.pastaDestino);
    }

    private void carregaPastaOrigem(String pathFolder){
        File folder = new File(pathFolder);
        for (File arquivo: folder.listFiles()) {
            this.CarregaArquivo(arquivo.getAbsolutePath());
        }
    }

    private void CarregaArquivo(String pathArquivo){
        String inputFile = pathArquivo;
        try {
            InputStream is = new FileInputStream(inputFile);
            ANTLRInputStream input = new ANTLRInputStream(is);
            CsharpLexer lexer = new CsharpLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CsharpParser parser = new CsharpParser(tokens);
            ParseTree tree = parser.prog();
            System.out.println(tree.toStringTree(parser));
            CsharpEvalVisitor csharpEvalVisitor = new CsharpEvalVisitor();
            csharpEvalVisitor.visit(tree);
            this.addClasse(csharpEvalVisitor.getClasse());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void salvaArquivos(String pathFolder){
        try {
            for (ClasseTs classe: this.classesTs) {
                PrintWriter pw = new PrintWriter(pathFolder + "/" + classe.getNomeArquivo());
                pw.print(classe.render());
                pw.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
