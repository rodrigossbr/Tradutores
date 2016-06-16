package tradutorCsharp;

import Conversores.ClasseTs;

/**
 * Created by rodrigo on 04/06/16.
 */
public class CsharpEvalVisitor extends CsharpBaseVisitor<Integer> {

    private ClasseTs classe;

    public ClasseTs getClasse(){
        return this.classe;
    }

}
