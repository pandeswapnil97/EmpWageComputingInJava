// Use Case 8 (Computing Employee Wage for multiple companies) (Day 22)

public class EmpWageComputation_Day22
{
        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        

        public static int empComputeWage(String companyName, int empRatePerHr, int numberOfWorkingDays, int maxWorkingHrs)
        {
                int empDailyHrs = 0;
                int empTotalHrs = 0;

                int EmpDailyWage;
                int EmpTotalWage = 0;

                int totalWorkingDays=0;

                while(empTotalHrs < maxWorkingHrs && totalWorkingDays < numberOfWorkingDays)
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

                        EmpDailyWage = empRatePerHr * empDailyHrs;
                        EmpTotalWage = EmpTotalWage + EmpDailyWage;

                        System.out.println("Emlpoyee's Daily Hours for Day " + totalWorkingDays + " in " + companyName + ": " + empDailyHrs);
                        System.out.println("Employee's Daily Wage for Day " + totalWorkingDays + " in " + companyName + ": " + EmpDailyWage);

                        System.out.println();
                }

                System.out.println();
                System.out.println();
                System.out.println("Emlpoyee's Total Hours in " + companyName + ": "  + empTotalHrs);
                System.out.println("Employee's Total Wage in " + companyName + ": "  + EmpTotalWage);
		System.out.println();
                System.out.println();
		System.out.println();



                return 0;
        }

        public static void main(String[] args)
        {
                empComputeWage("DMart", 20, 24, 100);
		empComputeWage("BigBasket", 25, 28, 98);
        }
}
