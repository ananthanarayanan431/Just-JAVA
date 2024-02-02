package udemy.com;


import java.util.Scanner;

public class Overloading {
    public static void main(String[] args){
        Computer obj = new Computer();
        System.out.println("Works for Function name and Function parameter");
        Scanner obj1 = new Scanner(System.in);
        int a = obj1.nextInt();
        int b = obj1.nextInt();
        int c = obj1.nextInt();
        System.out.println(obj.add(a,b));
        System.out.println(obj.add(a,b,c));
        System.out.println("Working Successfully");
    }
}

class Computer {
    public static int add(int n1,int n2) {
        return n1+n2;
    }

    public static int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public static double add(double n1,int n2){
        return n1+n2;
    }
}
