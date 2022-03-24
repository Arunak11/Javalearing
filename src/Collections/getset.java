package Collections;
import java.util.*;

public class getset {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Grapes");
        al.add("Dates");
        al.add("Mango");
        System.out.println("Returning element "+al.get(1));
        al.set(1,"Dates");
        for(String fruit:al){
            System.out.println(fruit);
        }
    }
}
