package leetCode.Proxy;

public class CashPerf implements Payment {

    Payment cash = new Cash();

    @Override
    public void pay(int amount) {
        if(amount > 100)
            System.out.println(amount +" 신용카드");
        else
            cash.pay(amount);
    }
}
