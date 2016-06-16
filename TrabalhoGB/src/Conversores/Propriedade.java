package Conversores;

/**
 * Created by rodrigo on 09/06/16.
 */
public class Propriedade {

    private String nome;
    private String tipoPropriedade;
    private String tipoRetorno;
    private boolean get;
    private boolean set;

    public Propriedade(String nome, boolean get, boolean set){
        this.nome = nome;
        this.get = get;
        this.set = set;
    }

    public void setTipoPropriedade(String tipoPropriedade) {
        this.tipoPropriedade = tipoPropriedade;
    }

    public void setTipoRetorno(String tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public String getAtributeRender(){
        return "private _" + this.nome.toLowerCase() + ": " + this.tipoRetorno + ";";
    }

    public String render(){
        StringBuffer buffer = new StringBuffer();
        if(this.get) {
            buffer.append("get ");
            buffer.append(this.nome);
            buffer.append("(): ");
            buffer.append(this.tipoRetorno);
            buffer.append(" {\n");
            buffer.append("\treturn this._" + this.nome.toLowerCase() + ";");
            buffer.append("\n}\n");
        }

        if(this.set) {
            buffer.append("\nset ");
            buffer.append(this.nome);
            buffer.append("(value: " + this.tipoRetorno + ")");
            buffer.append(" {\n");
            buffer.append("\tthis._" + this.nome.toLowerCase() + " = value;");
            buffer.append("\n}\n");
        }
        return buffer.toString();
    }
}
