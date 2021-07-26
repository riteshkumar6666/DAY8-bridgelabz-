
import java.util.Scanner;

public class Uc1 {

    public void LengthofLine() {
        //Take the values from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X1 :-");
        int X1 = sc.nextInt();
        System.out.print("Enter the value of Y1 :-");
        int Y1 = sc.nextInt();
        System.out.print("Enter the value of X2 :-");
        int X2 = sc.nextInt();
        System.out.print("Enter the value of Y2 :-");
        int Y2 = sc.nextInt();
        //Computation
        double lenghtOfLine = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));   //Calculate the distance between two points
        System.out.println("Distance between " + "(" + X1 + "," + Y1 + ")," + "(" + X2 + "," + Y2 + ") is  " + String.format("%.2f", lenghtOfLine));

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparision Program...");
        Uc1 obj1 = new Uc1();  //Creating object
        obj1.LengthofLine();

    }
}

