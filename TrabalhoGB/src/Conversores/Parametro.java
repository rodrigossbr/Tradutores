package Conversores;

/**
 * Created by rodrigo on 09/06/16.
 */
public class Parametro {
    private String nome;
    private String tipoParametro;

    public Parametro(String nome, String tipoParametro){
        this.nome = nome;
        this.tipoParametro = tipoParametro;
    }

    public String render(){
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.nome);
        buffer.append(": ");
        buffer.append(this.tipoParametro);
        return buffer.toString();
    }
}
