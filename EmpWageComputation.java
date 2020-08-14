//Use Case 1

public class EmpWageComputation
{
	public static void main(String[] args)
	{
		//System.out.println("Welcome to Employee Wage Computation Problem in Java");
		int IS_PRESENT=1;
        
        	int empCheck=(int)(Math.floor(Math.random()*10)%2);
          
        	if(IS_PRESENT==empCheck)
        	{
            		System.out.println("Employee is Present");
       		}
        	else
        	{
            		System.out.println("Employee is Absent");
        	}	
	}
}
