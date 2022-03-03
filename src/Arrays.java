import java.util.Scanner;
import java.util.ArrayList;
public class Arrays {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        for(int i=0; i<5;i++) {
            Scanner myObj = new Scanner(System.in);
            System.out.println(" enter the carName=");
            String carName = myObj.nextLine();
            cars.add(carName);
        }
        System.out.println(cars);
    }

}
