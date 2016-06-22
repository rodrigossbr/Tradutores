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

        List<TerminalNode> extendsClass = ctx.ID();
        boolean created = false;
        for (TerminalNode t : extendsClass) {
            if(!created){
                this.classe = new ClasseTs(t.getText(), "public");
                created = true;
            }else{
                this.classe.addClasseExtensao(t.getText());
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitConstrutor(CsharpParser.ConstrutorContext ctx) {

        TerminalNode tn = ctx.ID(0);
        if(tn != null){
            Metodo m = new Metodo(tn.getText());
            m.setTipoMetodo("public");
            m.setTipoRetorno("");

            List<CsharpParser.ParametersTypeContext> tiposParametros = ctx.parametersType();
            int cont = 1;
            for (CsharpParser.ParametersTypeContext p : tiposParametros) {
                String tipoParametro = p.children.get(0).getText();
                String momeParametro = ctx.ID(cont++).getText();
                Parametro param = new Parametro(momeParametro, tipoParametro);
                m.AddParametro(param);
            }
            this.classe.addMetodo(m);
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitVariableAndMethodsGetSet(CsharpParser.VariableAndMethodsGetSetContext ctx) {

        List<TerminalNode> ns = ctx.ID();
        if(ns.size() > 1){
            TerminalNode tn = ctx.ID(2);
            if (tn != null) {
                Propriedade propriedade = new Propriedade(tn.getText(), true, true);
                propriedade.setTipoPropriedade("public");

                TerminalNode tipoObjeto = ctx.ID(0);
                TerminalNode nomeObjeto = ctx.ID(1);
                String retorno = tipoObjeto.getText() + "<" + nomeObjeto.getText() + ">";
                propriedade.setTipoRetorno(retorno);

                this.classe.addPropriedade(propriedade);
            }
        }else {
            TerminalNode tn = ctx.ID(0);
            if (tn != null) {
                Propriedade propriedade = new Propriedade(tn.getText(), true, true);
                propriedade.setTipoPropriedade("public");

                CsharpParser.ParametersTypeContext paramContext = ctx.parametersType();
                if (paramContext != null) {
                    String retornoPropriedade = paramContext.children.get(0).getText();
                    propriedade.setTipoRetorno(retornoPropriedade);
                }
                this.classe.addPropriedade(propriedade);
            }
        }
        return visitChildren(ctx);
    }
}
