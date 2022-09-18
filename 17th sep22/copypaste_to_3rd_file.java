////WAP to read the data from two files and write it into another file
package class_work;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class copypaste_to_3rd_file {
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("Test2.txt");
		FileInputStream fin1=new FileInputStream("test1.txt");
		FileOutputStream fout=new FileOutputStream("test3.txt");
		SequenceInputStream inst=new SequenceInputStream(fin,fin1);
		int i;
		while((i=inst.read())!=-1) {
		fout.write(i);
		}
		inst.close();
		fin1.close();
		fin.close();
		fout.close();
		
	}
}
