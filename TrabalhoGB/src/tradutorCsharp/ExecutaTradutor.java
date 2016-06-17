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

        ConversorTs conversorTs = new ConversorTs(pastaOrigem, pastaDestino);
        conversorTs.modoDebug();
        //conversorTs.converteParaArquivos();
    }
}