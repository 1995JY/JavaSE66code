package homework;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请选择支付方式：1.支付平台支付  2.银行卡支付   3.信用卡支付");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        Payment payment=null;
        switch(choice){
            case 1:
                payment=new PlatformPaymentImpl();
                break;
            case 2:
                payment=new BankCardPaymentImpl();
                break;
            case 3:
                payment=new CreditCardPaymentImpl();
                break;
            default:
                System.out.println("输入有误");
                System.exit(1);

        }
        System.out.println("请输入支付的金额：");
        double money=sc.nextDouble();
        payment.pay(money);

    }
}
interface Payment{
    public abstract void pay(double money);
}
class PlatformPaymentImpl implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("使用支付平台支付了"+money+"元");
    }
}
class BankCardPaymentImpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("使用银行卡支付了"+money+"元");
    }
}
class CreditCardPaymentImpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("使用信用卡支付了"+money+"元");
    }
}
