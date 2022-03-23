package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int total=sc.nextInt();
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        for(int i=0;i<total;i++){
            int size=sc.nextInt();
            ArrayList<Integer> list = new ArrayList();
            for(int j=0;j<size;j++)
            {
                int item=sc.nextInt();
                list.add(item);
            }
            mainlist.add(list);
        }
        int totalprint=sc.nextInt();
        for(int k=0;k<totalprint;k++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            try{
                System.out.println(mainlist.get(r-1).get(c-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
