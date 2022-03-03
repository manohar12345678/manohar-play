import java.util.Scanner;
public class helloworld {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);// Create a Scanner object
        int x=0;
        int[] y= {1,2,3,4,5,6,7};
        for(int i: y) {
            //System.out.println("Enter number = ");
            //int number = myObj.nextInt();
             x=x+i;
             int z=2;
        }
        System.out.print("Sum of all integers="+x);



        //Scanner myObj2 = new Scanner(System.in);
        //System.out.println("Enter username2 = ");
        //String userName2 = myObj2.nextLine();// Read user input



        //System.out.println("Username1 is: " + userName1+userName2);  // Output user input

    }

}
