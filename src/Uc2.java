import java.util.Scanner;

public class Uc2 {
    Scanner sc = new Scanner(System.in);
    public double LengthofLine() {
        //Take the values from the user
        System.out.print("Enter the value of X1 :-");
        int X1 =sc.nextInt();
        System.out.print("Enter the value of Y1 :-");
        int Y1 =sc.nextInt();
        System.out.print("Enter the value of X2 :-");
        int X2 =sc.nextInt();
        System.out.print("Enter the value of Y2 :-");
        int Y2 =sc.nextInt();
        //Computation
        double lenghtOfLine= Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1) *(Y2-Y1)) ;   //Calculate the distance between two points
        System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is  "+String.format("%.2f",lenghtOfLine));
        return lenghtOfLine;

    }

    public double LengthofLine2() {

        System.out.print("Enter the value of X3 :-");
        int X1 =sc.nextInt();
        System.out.print("Enter the value of Y3 :-");
        int Y1 =sc.nextInt();
        System.out.print("Enter the value of X4 :-");
        int X2 =sc.nextInt();
        System.out.print("Enter the value of Y4 :-");
        int Y2 =sc.nextInt();
        //Computation
        double lenghtOfLine2= Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1) *(Y2-Y1)) ;		//Calculate the distance between two points
        System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is  "+String.format("%.2f",lenghtOfLine2));
        return lenghtOfLine2;
    }

    public void comparision(double lenghtOfLine, double lenghtOfLine2) {			// Compare the distance between of the two Straight lines
        // Comparing two lines
        if ( lenghtOfLine == lenghtOfLine2 ) {
            System.out.println("The lengths of these two straight lines are Preferable");
        }
        else  {
            System.out.println("The lengths of these two straight lines aren't Preferable");
        }
    }

    public static void main(String[] args) {

        Uc2 obj1 =new Uc2();  //Creating object
        double line1 =obj1.LengthofLine();
        double line2 =obj1.LengthofLine2();
        obj1.comparision(line1,line2);

    }

}
