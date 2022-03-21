package Collections;
import java.util.*;

public class hashset {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<String>();
        set.add("Arun");
        set.add("Calwin");
        set.add("Ruban");
        set.add("Sakthi");
        System.out.println("Initially: "+set);
        set.remove("Sakthi");
        System.out.println("After removing: "+set);
        HashSet<String> s1 = new HashSet<String>();
        s1.add("Moses");
        s1.add("Viswa");
        set.addAll(s1);
        System.out.println("Updated list "+set);
        set.removeAll(s1);
        System.out.println("After invoking "+set);
        set.removeIf(str->str.contains("Ajay"));
        System.out.println("After invoking again "+set);
        set.clear();
        System.out.println("At the end "+set);

    }
}
