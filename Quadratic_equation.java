package class_work;

public class Quadratic_equation {
	public static void main(String args[])
	{
		double a=1,b=5,c=1;
		double d=b*b-4*a*c;
		if(d>0)
		{
			System.out.println( d+" Both roots are real and different");
		}
		else if(d==0)
		{
			System.out.println(d+" Both roots are real and the same");
		}
		else if(d<0)
		{
			System.out.println(d+" Both roots are imaginary");
		}
		else
		{
			System.out.println(d+" Roots are not real");
		}
	}
}