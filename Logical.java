package udemy.com;

public class Logical {
    public static void main(String[] args){

        int x=6;
        int y=8;

        int a=89;
        int b=43;

        boolean result = x>y && a>b;
        System.out.println(result);

        boolean result1 = (x > y) || (a > b);
        System.out.println(result1);

        System.out.println(!result);
        System.out.println("Working Successfully");
    }
}


