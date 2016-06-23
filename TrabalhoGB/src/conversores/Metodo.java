package conversores;

import java.util.ArrayList;

/**
 * Created by rodrigo on 09/06/16.
 */
public class Metodo {

    private String nome;
    private String tipoMetodo;
    private String tipoRetorno;
    private ArrayList<Parametro> parametros;

    public Metodo(String nome){
        this.nome = nome;
        this.parametros = new ArrayList<Parametro>();
    }

    public void setTipoMetodo(String tipoMetodo) {
        this.tipoMetodo = tipoMetodo;
    }

    public void setTipoRetorno(String tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public void AddParametro(Parametro parametro){
        this.parametros.add(parametro);
    }

    public String render(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n\t");

        boolean ehConstrutor = this.tipoRetorno.isEmpty();

        if(ehConstrutor){
            buffer.append("constructor");
        }else{
            buffer.append(this.tipoMetodo);
            buffer.append(" ");
            buffer.append(this.nome);
        }

        buffer.append("(");

        boolean incluirVirgula = false;
        for (Parametro parametro: this.parametros) {
            if(incluirVirgula)
                buffer.append(", ");
            buffer.append(parametro.render());
            incluirVirgula = true;
        }
        buffer.append(")");

        if(!ehConstrutor){
            buffer.append(": ");
            buffer.append(this.tipoRetorno);
        }

        buffer.append(" { ");

        if(ehConstrutor){
            if(!this.parametros.isEmpty()){
                buffer.append("\n");
                for (Parametro parametro: this.parametros) {
                    buffer.append("\t\tthis._" + parametro.getNome());
                    buffer.append(" = " + parametro.getNome());
                    buffer.append(";\n");
                }
                buffer.append("\t");
            }
        }
        buffer.append("}\n");
        return buffer.toString();
    }
}
