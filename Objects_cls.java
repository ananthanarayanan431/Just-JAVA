package udemy.com;

public class Objects_cls {
    public static void main(String[] args){

        int num1=5;
        int num2=9;
        System.out.println("Java is statically typed language");

        System.out.println("Here calc-> Reference variable");

        Calculator calc = new Calculator(); // Object creation

        int result = calc.add(num1,num2);
        System.out.println(result);
        System.out.println("Working Successfully");
    }
}
class Calculator{

    int a;
    public int add(int x,int y) {
        System.out.println("Hello World form Calculator class");
        return x+y;
    }
}