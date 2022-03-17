package com.company;
import java.util.Scanner;

public class Main {
    int a[] = new int[5];
    int i,n;
    Scanner sc = new Scanner(System.in);
    void get1()
    {
        System.out.println("Enter the value:");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.println("Enter the elements:");
            a[i] = sc.nextInt();
        }
        for(i=0;i<=n;i++)
        {
            System.out.println("Your value is::"+a[i]);
        }
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.get1();

    }
}
