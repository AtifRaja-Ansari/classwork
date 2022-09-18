package class_work;

public class Delete_repeted_wod_in_the_String {
	public static void main(String args[])
	{
	String s=" jhonny jhonny yes papa";
	String words[];
	String result="";
	words=s.split(" ");
	for(int i=0;i<words.length;i++) {
		for(int j=i+1;j<words.length;j++) {
			if(words[i].equals(words[j])) {
				words[j]="delete";
			}
		}
	}
	
	for(String w:words) {
		if(w!="delete") {
			result=result+w+" ";
		}
	}
	
	System.out.println(result);
		
	}

}
