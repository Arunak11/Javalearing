package maps;
import java.util.*;
public class Demo {
    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(101,"Arun");
        hm.put(102,"Calwin");
        hm.put(103,"Ruban");
        System.out.println("Initially:");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list:");
        hm.replace(102,"Nandha");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list:");
        hm.replaceAll((k,v) -> "Ajay");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
