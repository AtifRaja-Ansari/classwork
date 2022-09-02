//Write a java program to input 5 elements of an array and search for a number whether it is present in an array or not.
package class_work;

import java.util.Scanner;

public class check_element_present {
	public static void main(String[] args)   
	{  
	
		Scanner sc=new Scanner(System.in);  
		int[] array = new int[5];  
		System.out.println("Enter the 5 elements of the array: ");  
		for(int i=0; i<5; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
   System.out.println("Enter value to find: ");  
  int  search = sc.nextInt();  
   
    for (int i = 0; i < 5; i++)  
    {  
      if (array[i] == search)    
      {
         System.out.println(search + " is present at Position " + (i + 1) );  
         break;
      }  
     if (search!=array[i]) 
      System.out.println(search + " isn't present in array.");  
}
}

}
