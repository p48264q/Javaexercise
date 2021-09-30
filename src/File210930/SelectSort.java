package File210930;

import java.util.Scanner;

public class SelectSort {
    public static void main(String args[]){
        int num[] = new int[8];
        System.out.println("输入八个int类型的数字");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
            if(sc.hasNextInt()){
                num[i] = sc.nextInt();
            }else{

                String s = sc.nextLine();
                System.out.println("这不是int类");//为什么会出现两次
                i--;
            }
        }

        for(int i = 0;i < num.length-1; i ++){
            for(int j = i+1;j < num.length;j ++){
                if(num[i]>num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(num[i]);
        }
    }
}
