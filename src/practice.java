import java.util.ArrayList;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number = ");
        int number = myObj.nextInt();
        ArrayList<Integer> manu = new ArrayList<Integer>();
        for (int i = 2; i < number; i++) {
            manu.add(i);
        }
        //System.out.println(manu);
        int m=2;
        for (int i :manu){
            if(number%i==0)
                m=3;
                break;
        }
        if(m==2){
            System.out.print("the given number is prime");
        }
        else{
            System.out.print("the given number is not prime");

        }
    }
}





