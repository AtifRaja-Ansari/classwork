
import java.util.Scanner;
public class Array1   

	{  
		public static void main(String[] args)   
		{  
		
			Scanner sc=new Scanner(System.in);  
			int[] array = new int[5];  
			System.out.println("Enter the 5 elements of the array: ");  
			for(int i=0; i<5; i++)  
			{  
		   
			array[i]=sc.nextInt();  
			}  
			System.out.println("Array elements are: ");  
		
			for (int i=0; i<5; i++)   
			{  
			System.out.println(array[i]);  
		}  
	}  
	

}
