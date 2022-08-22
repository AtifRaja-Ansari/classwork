package class_work;

public class divisibleby5and3 {
	public static void main(String[] args) 
	{ 
		int num = 15;
	    
	    if (num % 3 == 0 && num % 5 == 0) {
	        System.out.println("Divisible by 3 and 5");
	    }else if (num % 3 == 0) {
	        System.out.println("Divisible by 3 but not by 5");
	    }else if (num % 5 == 0) {
	        System.out.println("Divisible by 5 but not by 3");
	    }else {
	        System.out.println("Neither divisible by 3 nor by 5");
	    }

	}
}
