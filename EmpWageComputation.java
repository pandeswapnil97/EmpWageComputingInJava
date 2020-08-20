// Use Case 6 (Calcualating Wages till Total Working Hours or Days is reached for a month)

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

        int empDailyWage;
        int empTotalWage = 0;

        int totalWorkingDays=0;

        while(empTotalHrs < MAX_WORKING_HRS && totalWorkingDays < NUMBER_OF_WORKING_DAYS)
        {
            totalWorkingDays = totalWorkingDays + 1;

            int empCheck = (int)(Math.floor(Math.random()*10)%3);

            switch(empCheck)
            {
                case IS_FULL_TIME:
                {
                    empDailyHrs = 8;
                    break;
                }
                case IS_PART_TIME:
                {
                    empDailyHrs = 4;
                    break;
                }
            }

            empTotalHrs = empTotalHrs + empDailyHrs;

            empDailyWage = EMP_RATE_PER_HR * empDailyHrs;
            empTotalWage = empTotalWage + empDailyWage;

            System.out.println("Employee's Daily Hours for Day " + totalWorkingDays + ": " + empDailyHrs);
            System.out.println("Employee's Daily Wage for Day " + totalWorkingDays + ": " + empDailyWage);
            
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Employee's Total Hours: " + empTotalHrs);
        System.out.println("Employee's Total Daily Wage: " + empTotalWage);
    }
}
