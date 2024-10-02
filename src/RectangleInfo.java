import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.print("What is the length of your rectangle: ");
            if(in.hasNextDouble()){
                length = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("\nYou said the length is: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);
        done = false;
        do{
            System.out.print("What is the width of your rectangle: ");
            if(in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("\nYou said the width is: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);

        double area = length * width;
        double perimeter = length + length + width + width;
        double diagonal = (length * length) + (width * width);

        System.out.println("The area of your rectangle is: " + area);
        System.out.println("The perimeter of your rectangle is: " + perimeter);
        System.out.println("The length of the diagonal of your rectangle is: " + Math.sqrt(diagonal));
    }
}
