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
/*
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
*/







//Use Case 3 (Adding Part Time Employee and Wage)
/*
public class EmpWageComputation 
{
    public static void main(String[] args)
    {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empRatePerHr = 20;
        
        int empHrs = 0;
        int empWage;
        
        int empCheck=(int)(Math.floor(Math.random()*10)%3);

        if(IS_FULL_TIME==empCheck)
        {
            empHrs = 8;
        }
        else if (IS_PART_TIME==empCheck)
        {
            empHrs = 4;
        }
        
        empWage = empRatePerHr * empHrs;
        
        System.out.println("Employee's Daily Wage: " + empWage);
    }
}
*/







//Use Case 4 (Solving Using Switch Case)
/*
public class EmpWageComputation
{
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;

    public static void main(String[] args)
    {
        int empHrs = 0;
        int empWage;

        int empCheck=(int)(Math.floor(Math.random()*10)%3);

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

        empWage = EMP_RATE_PER_HR * empHrs;

        System.out.println("Employee's Daily Wage: " + empWage);
    }
}
*/








//Use Case 5 (Calculating Wages for a Month)
/*
public class EmpWageComputation
{
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUMBER_OF_WORKING_DAYS=20;

    public static void main(String[] args)
    {
        int empHrs = 0;
        int EmpDailyWage;
        int EmpTotalWage = 0;
        int totalWorkingDays=0;

        while(totalWorkingDays < NUMBER_OF_WORKING_DAYS)
        {
            totalWorkingDays = totalWorkingDays + 1;

            int empCheck=(int)(Math.floor(Math.random()*10)%3);

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

            EmpDailyWage = EMP_RATE_PER_HR * empHrs;
            EmpTotalWage = EmpTotalWage + EmpDailyWage;

            System.out.println("Employee's Daily Wage for Day " + totalWorkingDays + ": " + EmpDailyWage);
        }
        System.out.println("Employee's Total Daily Wage for Month: " + EmpTotalWage);
    }
}
*/







// Use Case 6 (Calcualating Wages till Total Working Hours or Days is reached for a month)
/*
public class EmpWageComputation
{
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HRS = 100;

    public static void main(String[] args)
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
    }
}
*/










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
