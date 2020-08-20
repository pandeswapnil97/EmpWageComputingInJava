//Use Case 3 (Adding Part Time Employee and Wage)

public class EmpWageComputation 
{
    public static void main(String[] args)
    {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empRatePerHr = 20;
        
        int empHrs = 0;
        int empWage;
        
        int empCheck = (int)(Math.floor(Math.random()*10)%3);
        
	if(IS_FULL_TIME == empCheck)
        {
            empHrs = 8;
        }
        else if (IS_PART_TIME == empCheck)
        {
            empHrs = 4;
        }
        
        empWage = empRatePerHr * empHrs;
        
        System.out.println("Employee's Daily Wage: " + empWage);
    }
}
