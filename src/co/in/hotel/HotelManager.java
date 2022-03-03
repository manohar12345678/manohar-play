package co.in.hotel;

public class HotelManager {
    public static void main(String[] args) {
        final CashierTask cashierTask = new CashierTask();
       // final Individual chef = new Individual(PersonType.CHEF, task);
        final Individual cashier = new Individual(PersonType.CASHIER, cashierTask);

        System.out.println(cashier.getPersonType());
        System.out.println("mahesh-c");
        CashierTask cashierTask1 = (CashierTask) cashier.getTask();
        cashierTask1.collectCash();


    }
}
