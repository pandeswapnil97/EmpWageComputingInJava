//Use Case 5 (Calculating Wages for a Month)

public class EmpWageComputation
{
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    
    public static void main(String[] args)
    {
        int empHrs = 0;
        int empDailyWage;
        int empTotalWage = 0;
        int totalWorkingDays = 0;
        
	while(totalWorkingDays < NUMBER_OF_WORKING_DAYS)
        {
            totalWorkingDays = totalWorkingDays + 1;
            int empCheck = (int)(Math.floor(Math.random()*10)%3);
            
	    switch(empCheck)
            {
                case IS_FULL_TIME:
                {
                    empHrs=8;
                    break;
                }
                case IS_PART_TIME:
                {
                    empHrs=4;
                    break;
                }
            }
            
	    empDailyWage = EMP_RATE_PER_HR * empHrs;
            empTotalWage = empTotalWage + empDailyWage;

            System.out.println("Employee's Daily Wage for Day " + totalWorkingDays + ": " + empDailyWage);
        }
        System.out.println("Employee's Total Daily Wage for Month: " + empTotalWage);
    }
}
