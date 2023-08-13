package Q2;
import java.util.Scanner;
/********************************************************************************************
 Nadeen Shilbayeh
 Prompts user for the grades and weights of three assignments to calculate their course grade
 ********************************************************************************************/
public class CourseGradeCalculation {
    public static void main(String[] args){//main method

        //defines a scanner object called input
        Scanner input = new Scanner(System.in);

        //prompts user to enter their first grade
        System.out.print("Input the first grade: ");
        double grade1 = input.nextDouble(); //reads a double value from the standard input

        //prompts user to the weight of their first grade
        System.out.print("Enter the first-grade weight as a percentage: ");
        double grade1Weight = input.nextDouble();//reads a double value from the standard input

        //prompts user to enter their second  grade
        System.out.print("Input the second grade: ");
        double grade2 = input.nextDouble();//reads a double value from the standard input

        //prompts user to the weight of their second grade
        System.out.print("Enter the second-grade weight as a percentage: ");
        double grade2Weight = input.nextDouble();//reads a double value from the standard input

        //prompts user to enter their third grade
        System.out.print("Input the third grade: ");
        double grade3 = input.nextDouble();

        //prompts user to the weight of their third grade
        System.out.print("Enter the third-grade weight as a percentage: ");
        double grade3Weight = input.nextDouble();

        //calculates the weighted final grade of the user and stores it as a double variable
        double finalGrade = (grade1*grade1Weight + grade2*grade2Weight + grade3*grade3Weight)/100.0;

        //outputs the calculated final grade of the user
        System.out.printf("The course grade is %.2f",finalGrade);
    }
}
