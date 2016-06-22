package conversores;

/**
 * Created by rodrigo on 22/06/16.
 */
public class TipoEquivalente {

    public static String tipoEquivalente(String tipoCsharp){

        if(tipoCsharp == null) {
            return "";
        }

        if (tipoCsharp.equals("int")
                || tipoCsharp.equals("decimal")
                || tipoCsharp.equals("double")
                || tipoCsharp.equals("float")) {
            return "number";
        }

        if (tipoCsharp.equals("String")) {
            return "string";
        }

        if (tipoCsharp.equals("bool")) {
            return "boolean";
        }

        if(tipoCsharp.contains("<")){
            String tipo = tipoCsharp.substring(0, tipoCsharp.indexOf("<"));
            String tipoObj = tipoCsharp.substring(tipoCsharp.indexOf("<") + 1, tipoCsharp.indexOf(">"));

            if(tipo.equals("List")
                    || tipo.equals("IList")){
                return "Array<" + TipoEquivalente.tipoEquivalente(tipoObj) + ">";
            }
        }

        return tipoCsharp;
    }

}
