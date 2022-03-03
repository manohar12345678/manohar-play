package co.in.hotel;

public class CashierTask implements Task{
    public void collectCash(){
        System.out.println("collecting ... cash");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("collected");
    }
}
