package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String args[]){
        ArrayList<String> list= new ArrayList<String>();
        list.add("Arun");
        list.add("Calwin");
        list.add("Ruban");
        list.add("Sakthi");

        Iterator itr =list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
