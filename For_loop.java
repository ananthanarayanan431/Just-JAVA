package udemy.com;

public class For_loop {
    public static void main(String[] args){

        int num=5;

        for (int i=0; i<num; ++i) {

            System.out.println("Day : " + (i+1));
            for (int j=1; j<=9; ++j) {
                System.out.println(" " + (j+8) + " -- " + (j+9));
            }
        }
        System.out.println("Working Successfully");
    }
}


