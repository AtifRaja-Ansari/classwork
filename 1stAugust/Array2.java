//WAP to input an array having 3 rows and 3 columns of type String.



import java.util.Scanner;

public class Array2
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String arr[][] = new String[3][3];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i <3; i++) {	
			for(int j = 0; j <3; j++){
				arr[i][j]=sc.next();
			}
		}
		System.out.println("Array elements are: ");
		for(int i = 0; i <3; i++) {
			for(int j = 0; j <3; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}