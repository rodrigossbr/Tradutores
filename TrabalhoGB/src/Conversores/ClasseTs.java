package Conversores;

import java.util.ArrayList;

/**
 * Created by rodrigo on 09/06/16.
 */
public class ClasseTs {

    private String tipoClasse;
    private String nome;
    private ArrayList<String> classesExtensao;
    private ArrayList<Propriedade> propriedades;
    private ArrayList<Metodo> metodos;

    public ClasseTs(String nome, String tipoClasse){
        this.nome = nome;
        this.tipoClasse = tipoClasse;
        this.classesExtensao = new ArrayList<String>();
        this.propriedades = new ArrayList<Propriedade>();
        this.metodos = new ArrayList<Metodo>();
    }

    public void addClasseExtensao(String nomeClasse){
        this.classesExtensao.add(nomeClasse);
    }

    public void addMetodo(Metodo metodo){
        this.metodos.add(metodo);
    }

    public String getNomeArquivo(){
        return this.nome + ".ts";
    }

    public String render(){
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.tipoClasse);
        buffer.append(" Class ");
        buffer.append(this.nome);

        if(!this.classesExtensao.isEmpty()){
            buffer.append(" : ");
            boolean incluirVirgula = false;
            for (String nomeClasse: this.classesExtensao) {
                if(incluirVirgula)
                    buffer.append(", ");
                buffer.append(nomeClasse);
                incluirVirgula = true;
            }
        }
        buffer.append(" {\n");

        if(!this.propriedades.isEmpty()){
            for (Propriedade propriedade: this.propriedades) {
                buffer.append(propriedade.getAtributeRender());
            }

            for (Propriedade propriedade: this.propriedades) {
                buffer.append(propriedade.render());
            }
        }

        if(!this.metodos.isEmpty()){
            for (Metodo metodo: this.metodos) {
                buffer.append(metodo.render());
            }
        }

        buffer.append("\n\t}\n");
        return buffer.toString();
    }
}
