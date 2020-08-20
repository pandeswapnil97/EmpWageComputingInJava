//Use Case 4 (Solving Using Switch Case)

public class EmpWageComputation
{
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    
    public static void main(String[] args)
    {
        int empHrs = 0;
        int empWage;
        int empCheck = (int)(Math.floor(Math.random()*10)%3);
        
	switch(empCheck)
        {
            case IS_FULL_TIME:
            {
                empHrs = 8;
                break;
            }
            case IS_PART_TIME:
            {
                empHrs = 4;
                break;
            }
        }

        empWage = EMP_RATE_PER_HR * empHrs;
        System.out.println("Employee's Daily Wage: " + empWage);
    }
}
