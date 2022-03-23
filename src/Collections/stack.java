package Collections;
import java.util.*;

public class stack {
    public static void main(String args[]){
        Stack<String> st = new Stack<String>();
        st.push("Aakash");
        st.push("Amir");
        st.push("Ashish");
        st.push("Arjun");
        st.push("Guru");
        st.pop();
        Iterator<String> itr = st.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
