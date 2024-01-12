package udemy.com;

import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int val = num-1;
        int value=1;
        int ans=1;

        for (int i=0; i<num; ++i){
            value=1;
            for (int j=0; j<val; ++j){
                System.out.print('-');
            }
            for (int j=0; j<ans; ++j){
                if (j<(ans/2)){
                    System.out.print(value);
                    value+=2;
                } else {
                    System.out.print(value);
                    value-=2;
                }
            }
            val--;
            ans+=2;
            System.out.println();
        }
    }
}
