//Use Case 1 (Check whether employee is present or not)

/*
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
*/




//Use Case 2 (Calculate Daily Employee Wage)

public class EmpWageComputation
{
    public static void main(String[] args)
    {
        int IS_PRESENT = 1;
        int empRatePerHr = 20;

        int empHrs = 0;
        int empWage;

        int empCheck=(int)(Math.floor(Math.random()*10)%2);

        if(IS_PRESENT==empCheck)
        {
            empHrs = 8;
        }

        empWage = empRatePerHr * empHrs;
        System.out.println("Employee's Daily Wage: " + empWage);
    }
}
