package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
    public static void main(String args[]){
        LinkedHashMap<Integer,String> sub = new LinkedHashMap<>();
        sub.put(101,"maths");
        sub.put(102,"english");
        sub.put(107,"physics");
        sub.put(111,"chemistry");

        for(Map.Entry mp:sub.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
        System.out.println("Keys "+sub.keySet());
        System.out.println("Values "+sub.values());
        System.out.println("Key-value pair"+sub.entrySet());

        System.out.println("get or default "+sub.getOrDefault(1,"Key is missing"));
    }
}
