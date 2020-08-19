//Use Case 7 (Refactoring the code to write a class method to compute Employee Wage) (Day21)

public class EmpWageComputation_Day21
{
	public static final int IS_FULL_TIME = 1;
    	public static final int IS_PART_TIME = 2;
    	public static final int EMP_RATE_PER_HR = 20;
    	public static final int NUMBER_OF_WORKING_DAYS = 20;
    	public static final int MAX_WORKING_HRS = 100;

    	public static int empComputeWage()
    	{
        	int empDailyHrs = 0;
        	int empTotalHrs = 0;

        	int EmpDailyWage;
        	int EmpTotalWage = 0;

        	int totalWorkingDays=0;

        	while(empTotalHrs < MAX_WORKING_HRS && totalWorkingDays < NUMBER_OF_WORKING_DAYS)
        	{
            		totalWorkingDays = totalWorkingDays + 1;

		        int empCheck=(int)(Math.floor(Math.random()*10)%3);

            		switch(empCheck)
            		{
                		case IS_FULL_TIME:
                		{
                    			empDailyHrs=8;
                    			break;
                		}
                		case IS_PART_TIME:
                		{
                    			empDailyHrs=4;
                    			break;
                		}
            		}

            		empTotalHrs = empTotalHrs + empDailyHrs;

            		EmpDailyWage = EMP_RATE_PER_HR * empDailyHrs;
            		EmpTotalWage = EmpTotalWage + EmpDailyWage;

            		System.out.println("Emlpoyee's Daily Hours for Day " + totalWorkingDays + ": " + empDailyHrs);
            		System.out.println("Employee's Daily Wage for Day " + totalWorkingDays + ": " + EmpDailyWage);

            		System.out.println();
		}

		System.out.println();
        	System.out.println();
        	System.out.println("Emlpoyee's Total Hours: " + empTotalHrs);
        	System.out.println("Employee's Total Daily Wage: " + EmpTotalWage);
		
		return 0;
	}

	public static void main(String[] args)
	{
		empComputeWage();
	}
}
