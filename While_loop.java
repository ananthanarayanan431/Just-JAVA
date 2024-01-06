package udemy.com;

public class While_loop {
    public static void main(String[] args){

        int num=4;


        int i=0;

        while (i<=num){

            System.out.println("Hi " + i);
            int j=0;
            while(j<3){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Working Successfully");
    }
}


