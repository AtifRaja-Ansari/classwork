package class_work;

public class to_check_its_even_as_well_negative {
	public static void main(String args[])
	{
		
		int num=-8;
		if(num%2==0) {
			if(num<0) {
				System.out.println("The number is negative and even");
			}else {
				System.out.println("The number is even but not negative");
			}
		}else {
			System.out.println("the number is neither negative nor even");
		}
		
	}

}
