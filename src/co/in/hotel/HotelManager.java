package co.in.hotel;

public class HotelManager {
    public static void main(String[] args) {
        final CashierTask cashierTask = new CashierTask();
       // final Individual chef = new Individual(PersonType.CHEF, task);
        final Individual cashier = new Individual(PersonType.CASHIER, cashierTask);
        //final Individual customer = new Individual(PersonType.CUSTOMER, task);
        //final Individual server = new Individual(PersonType.SERVER, task);

        System.out.println(cashier.getPersonType());
        CashierTask cashierTask1 = (CashierTask) cashier.getTask();
        cashierTask1.collectCash();


    }
}
