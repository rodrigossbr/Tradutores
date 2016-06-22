package conversores;

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
        return "\tprivate _" + this.nome.toLowerCase() + ": " + TipoEquivalente.tipoEquivalente(this.tipoRetorno) + ";\n";
    }

    public String render(){
        StringBuffer buffer = new StringBuffer();
        if(this.get) {
            buffer.append("\n\t");
            buffer.append("get ");
            buffer.append(this.nome.toLowerCase());
            buffer.append("(): ");
            buffer.append(TipoEquivalente.tipoEquivalente(this.tipoRetorno));
            buffer.append(" {\n");
            buffer.append("\t\treturn this._" + this.nome.toLowerCase() + ";");
            buffer.append("\n\t}");
        }

        if(this.set) {
            buffer.append("\n\t");
            buffer.append("set ");
            buffer.append(this.nome.toLowerCase());
            buffer.append("(value: " + TipoEquivalente.tipoEquivalente(this.tipoRetorno) + ")");
            buffer.append(" {\n");
            buffer.append("\t\tthis._" + this.nome.toLowerCase() + " = value;");
            buffer.append("\n\t}");
        }
        return buffer.toString();
    }
}
