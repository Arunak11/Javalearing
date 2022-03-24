package maps;

import java.util.Map;
import java.util.TreeMap;

public class tree
{
    TreeMap<Integer,String>list1=new TreeMap<>();
    void get1()
    {
        list1.put(1001,"azar");
        list1.put(1002, "mohan");
        list1.put(1003, "raja");

        for(Map.Entry m1:list1.entrySet())
        {
            System.out.println(""+m1.getKey()+""+m1.getValue());
        }

        System.out.println("Your data is::"+list1);
        System.out.println("Your size is::"+list1.size());
        System.out.println("Searching::"+list1.containsKey(1001));
        System.out.println("Remove your data ::"+list1.remove(1001));
        System.out.println("After Removing ::"+list1.containsKey(1001));
    }
}


