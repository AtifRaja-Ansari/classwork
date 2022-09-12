/*2.)Write a program to accept a password from the user and throw 'Authentication
Failure' exception if the password is incorrect.*/
package class_work;

import java.util.Scanner;

public class IncorrectPassword {
	  public static void main(String args[]) throws IncorrectPasswordException{
	    {
	        String   a, b;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a new Password: ");
	        a = s.nextLine();
	        
	        System.out.print("Enter your password: ");
	        b = s.nextLine();
	        try {
	        		if(a.equals(b))
	        		{
	        			System.out.println("Authentication Successful");
	        		}
	        		else
	        		{
	        			throw new IncorrectPasswordException("Authentication Failure");
	        		}
	        } catch(IncorrectPasswordException e) {
	        	System.out.println(e.getMessage());
	        }
	        }
	    }
}

