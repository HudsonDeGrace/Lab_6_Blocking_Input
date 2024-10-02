import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double temp = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.print("What is your temperature in celsius: ");

            if(in.hasNextDouble()){
                temp = in.nextDouble();
                in.nextLine();
                double stepOne = temp * 1.8;
                double stepTwo = stepOne + 32;
                System.out.println("Your temperature in fahrenheit is: " + stepTwo);
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your temperature was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);
    }
}