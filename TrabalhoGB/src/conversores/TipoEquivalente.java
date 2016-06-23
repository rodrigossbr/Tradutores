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

        if (tipoCsharp.equals("String") || tipoCsharp.equals("string")) {
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

    public static String tipoImport(String tipoCsharp){

        if(tipoCsharp.contains("<")){
            String tipoObj = tipoCsharp.substring(tipoCsharp.indexOf("<") + 1, tipoCsharp.indexOf(">"));
            return tipoObj;
        }

        String equivalente = tipoEquivalente(tipoCsharp);
        return equivalente.equals(tipoCsharp)
                && !equivalente.equals("number")
                && !equivalente.equals("string")
                && !equivalente.equals("boolean") ? tipoCsharp : "";
    }
}
