package File210930;

import java.util.Scanner;

public class PopSort {
    public static void main(String args[]){
        //int num[] = new int[]{234,4235,3425,43,45,2,53,4};
        int num[] = new int[8];
        System.out.println("input 8 int num");
        for (int i = 0; i < 8; i++) {
            Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()){
                int num1 = sc.nextInt();
                num[i] = num1;
            }
        }
        for (int i = 1; i < 8; i++) {
            for (int i1 = 0; i1 < 8 - i; i1++) {
                if(num[i1]>num[i1+1]){
                    int temp = num[i1];
                    num[i1]=num[i1+1];
                    num[i1+1]=temp;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(num[i]);
        }
    }
}
