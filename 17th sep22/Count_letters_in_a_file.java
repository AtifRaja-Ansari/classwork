//WAP to count the number of letters in a file
package class_work;
import java.io.FileInputStream;
import java.io.IOException;

public class Count_letters_in_a_file {
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			FileInputStream fin=new FileInputStream("Test3.txt");
			int i,count=0;
			
			while((i=fin.read())!=-1) {
			if(i!=' ')
				count++;		
			}
			System.out.print(count);
		
		}
}
