//write a java program to remove the characters at even indexes 
//and then print the new string without using any method for removingpackage class_work;

package class_work;
import java.util.Scanner;
public class Remove_Char_at_even_index {

		public static void main(String args[]) {
			Scanner c=new Scanner(System.in);
			System.out.print("Enter a String:");
			String str=c.nextLine();
			String new_str="";
			for(int i=0;i<str.length()-1;i++) {
				if(i%2==0) {
					new_str+=str.charAt(i);
				}
			}
			System.out.println(new_str);
			}
}
