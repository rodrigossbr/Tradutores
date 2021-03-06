package tradutorCsharp;

import conversores.ConversorTs;

/**
 * Created by rodrigo on 04/06/16.
 */
public class ExecutaTradutor {
    public static void main(String[] args) throws Exception {

        if ( args.length < 2){
            System.out.println("\n\nErro!!! Usar: java ExecutaTradutor <<caminho pasta de origem>> <<caminho pasta de destino>>\n\n");
            return;
        }
        String pastaOrigem = args[0];
        String pastaDestino = args[1];

        String op = "";
        if ( args.length > 2){
            op = args[2];
        }

        ConversorTs conversorTs = new ConversorTs(pastaOrigem, pastaDestino);
        if(op.equals("-d")){
            conversorTs.modoDebug();
        }else{
            conversorTs.converteParaArquivos();
        }
    }
}