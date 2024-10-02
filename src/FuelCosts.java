import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double tankVolume = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.print("How many gallons can your gas tank hold: ");
            if(in.hasNextDouble()){
                tankVolume = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your tank volume was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);
        done = false;
        do{
            System.out.print("How many miles can your car go with one gallon of fuel: ");
            if(in.hasNextDouble()){
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your fuel efficiency was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);
        done = false;
        do{
            System.out.print("What is the price of gas: $");
            if(in.hasNextDouble()){
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the price of gas is: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);

        double costToDrive = (100/fuelEfficiency) * gasPrice;
        double fullDistance = fuelEfficiency * tankVolume;

        System.out.println("It costs $" + costToDrive + " to drive 100 miles");
        System.out.println("You can drive " + fullDistance + " miles with a full tank of gas");
    }
}
