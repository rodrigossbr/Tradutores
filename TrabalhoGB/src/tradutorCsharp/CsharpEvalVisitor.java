package tradutorCsharp;

import conversores.ClasseTs;
import conversores.Metodo;
import conversores.Parametro;
import conversores.Propriedade;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * Created by rodrigo on 04/06/16.
 */
public class CsharpEvalVisitor extends CsharpBaseVisitor<Integer> {

    private ClasseTs classe;

    public ClasseTs getClasse(){
        return this.classe;
    }

    // cria a classe
    @Override
    public Integer visitClassIdentifier(CsharpParser.ClassIdentifierContext ctx) {
        this.classe = new ClasseTs(ctx.ID().getText(), ctx.modifierType().getText());
        List<CsharpParser.ObjectTypeContext> extendsClass = ctx.objectType();
        for (CsharpParser.ObjectTypeContext t : extendsClass) {
            this.classe.addClasseExtensao(t.getText());
            this.classe.addImport(t.getText());
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitConstrutor(CsharpParser.ConstrutorContext ctx) {
        Metodo m = new Metodo(ctx.ID().getText());
        m.setTipoMetodo(ctx.modifierType().getText());
        m.setTipoRetorno(""); // construtor eh um metodo sem retorno
        CsharpParser.MultipleParametersContext parametros = ctx.multipleParameters();
        if(parametros != null){
            int cont = 0;
            for (TerminalNode p : parametros.ID()) {
                String tipoParametro = parametros.csharpType(cont++).getText();
                String momeParametro = p.getText();
                Parametro param = new Parametro(momeParametro, tipoParametro);
                m.AddParametro(param);
                this.classe.addImport(tipoParametro);
            }
        }
        this.classe.addMetodo(m);
        return visitChildren(ctx);
    }

    @Override
    public Integer visitVariableAndMethodsGetSet(CsharpParser.VariableAndMethodsGetSetContext ctx) {

        Propriedade propriedade = new Propriedade(ctx.ID().getText(), true, true);
        propriedade.setTipoPropriedade(ctx.modifierType().getText());
        propriedade.setTipoRetorno(ctx.csharpType().getText());
        this.classe.addImport(ctx.csharpType().getText());
        this.classe.addPropriedade(propriedade);

        return visitChildren(ctx);
    }
}
