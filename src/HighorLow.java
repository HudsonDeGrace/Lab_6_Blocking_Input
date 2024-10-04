import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        int correctNum = gen.nextInt(10) + 1;
        int userGuess = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.print("Guess a number 1-10: ");

            if(in.hasNextInt()){
                userGuess = in.nextInt();

                if(userGuess < correctNum && userGuess > 0){
                    System.out.println("The correct number is higher");
                    done = true;
                } else if(userGuess > correctNum && userGuess < 11){
                    System.out.println("The correct number is lower");
                    done = true;
                }else if(userGuess == correctNum){
                    System.out.println("You got it! Nice job!");
                    done = true;
                } else{
                    System.out.println("You said you number is: " + userGuess);
                    System.out.println("You have to enter a valid amount!");
                }
            }else{
                trash = in.nextLine();
                System.out.println("You said your number is: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);
    }
}
