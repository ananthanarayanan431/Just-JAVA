package udemy.com;

public class Ternary {
    public static void main(String[] args){

        int num = 10;
        int result = 0;

        result = num%2==0? 10:20;
        System.out.println(result);

        int result1=0;

        int x=9;
        int y=8;
        int z=7;

        result1=x>y&&x>z?x:y>z?y:z;
        System.out.println(result1);
        System.out.println("Working Successfully");
    }
}


