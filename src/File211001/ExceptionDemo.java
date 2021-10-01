package File211001;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String args[]){
        withdrawal();
    }
    private static void withdrawal(){
        int money = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的取款金额");
        int num = sc.nextInt();
        if(num <= money){
            money -= num;
            System.out.println("yes，success");
        }else{
            throw new NoMoneyException("余额不足,试用卡只有10000额度，抛出自定义异常");
        }
    }
    public  static class NoMoneyException extends RuntimeException{
        public NoMoneyException(){
            super();
        }
        public NoMoneyException(String a){
            super(a);
        }
    }
}
