package class_work;

public class studentsgrdes {
	public static void main(String args[])
    {
        int marks=90;
       
        System.out.print("The student Grade is: ");
        if(marks>=90)
        {
            System.out.print("A+");
        }
        else if(marks>=80 && marks<90)
        {
           System.out.print("A");
        } 

        else if(marks>=70 && marks<80)
        {
            System.out.print("B+");
        }
        else if(marks>=60 && marks<70)
        {
            System.out.print("B");
        }
        else if(marks>=50 && marks<60)
        {
            System.out.print("C");
        }
        else if(marks>=40 && marks<50)
        {
            System.out.print("D");
        }
        else if(marks>=30 && marks<40)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("F");
        }

    }
}
