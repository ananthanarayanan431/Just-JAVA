package udemy.com;

public class Assignement {
    public static void main(String[] args){

        int num1 = 4;
        int num2 = 5;

        int result = num1 + num2;
        System.out.println(result);

        num1+=2;
        num1++;
        System.out.println(num1);
        num2--;
        System.out.println(num2);
        System.out.println("Increment and Decrement operator");
        int answer = --num1;
        System.out.println(answer);
        answer = num1--;
        System.out.println(answer);
        System.out.println("Working Successfully");
    }
}


