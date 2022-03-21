package Collections;
import java.util.*;
public class linkedlist {
    public static void main(String args[]){
        LinkedList<String> ab = new LinkedList<>();
        ab.add("Arun");
        ab.add("Ruban");
        ab.add("Calwin");
        Iterator<String> itr = ab.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
