package basics;

public class Main {
    void get1()
    {
        System.out.println("Welcome to first function");
    }
    void get2()
    {
        System.out.println("Welcome to second function");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to main class");
        Main m1 = new Main();
        m1.get1();
        m1.get2();
    }
}
