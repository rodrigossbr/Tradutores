package questao2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrigo on 5/1/16.
 */
public class Method {

    public enum TypesVisit {
        IF,
        ELSEIF,
        CASE,
        FOR,
        DO,
        WHILE,
        CATCH,
        TERNARY
    }

    private Map<TypesVisit, Integer> memory = new HashMap<>();
    public String Name;
    public int LevelAlignment = 1;
    public int FanOut = 0;

    public Method(String name){
        this.Name = name;
    }

    public void AddVisit(TypesVisit type){
        if (memory.containsKey(type)) {
            memory.merge(type, 1, Integer::sum);
        } else {
            memory.put(type, 1);
        }
    }

    public void AddLevelAlignment(){
        this.LevelAlignment++;
    }

    public void AddFanOut(){
        this.FanOut++;
    }

    public void PrintResults(){
        System.out.println(" >>>>>> Metodo: " + this.Name);
        int total = 0;

        for (Map.Entry<TypesVisit, Integer> entry : memory.entrySet())
        {
            total += entry.getValue();
            System.out.println(" Total para: " + entry.getKey() + " eh " + entry.getValue());
        }

        System.out.println(" => Complexidade ciclomatica: " + total);
        System.out.println(" => Nivel de aninhamento: " + this.LevelAlignment);
        System.out.println(" => Fan Out: " + this.FanOut);

        System.out.println(" >>>>>> " );
    }
}
