package class_work;

public class Frequency_andPosition_of_Occurrence {
	public static void main(String args[]) {

		String s1="indian";
		
		boolean flag=false;
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='i') {
				flag=true;
				count=count+1;
			}
		
		
		}
		
		if(flag==true) {
			System.out.println("Character is found");
		}else {
			System.out.println("Character is not found");
		}
		
		System.out.println(count);	
		
	}

}
