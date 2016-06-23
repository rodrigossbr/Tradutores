package conversores;

/**
 * Created by rodrigo on 22/06/16.
 */
public class ImportTs {

    private String nome;

    public ImportTs(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String render(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n");
        buffer.append("import ");
        buffer.append("{ ");
        buffer.append(this.nome);
        buffer.append(" }");
        buffer.append(" from");
        buffer.append(" \"./");
        buffer.append(this.nome);
        buffer.append("\";");
        return buffer.toString();
    }
}
