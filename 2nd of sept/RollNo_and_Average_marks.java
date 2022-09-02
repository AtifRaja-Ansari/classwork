//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100).
package class_work;
import java.util.Scanner;

public class RollNo_and_Average_marks {

	public static void main(String[] args) {
        String roll;
        float a,b,c;
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=8; i++){
                System.out.print("Enter Your Roll Number: ");
                roll = sc.next();

                System.out.print("Enter the marks in English: ");
                a= sc.nextFloat();
                System.out.print("Enter the marks in Science: ");
                b = sc.nextFloat();
                System.out.print("Enter the marks in Maths: ");
                c = sc.nextFloat();

                float avg = (a + b + c) / 3;

                if(a<=100 && b<=100 && c<=100){
                    System.out.printf("Average Mark of Roll Number %s is:  %.1f", roll, avg);
                }
                else{
                    System.out.println("Please Enter Your Marks: ");
                }
            }
    }

}
