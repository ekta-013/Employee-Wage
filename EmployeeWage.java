package employeeWage;

public class EmployeeWage {

	public static void main(String[] args) {
		//CONSTANTS
		final int IS_FULLTIME = 1;
        final int IS_PARTTIME = 2;
        final int WAGE_PER_HR = 20;
        final int NUM_OF_WORKING_DAYS = 20;
        
        int EMP_HRS=0;
        int empWage=0;
        int totalEmpWage=0;

        for (int day=0; day<NUM_OF_WORKING_DAYS; day++);{
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch(empCheck) {
            case IS_FULLTIME:
                EMP_HRS = 8;
                System.out.println("Employee is full time");
            break;
            
            case IS_PARTTIME:
                EMP_HRS = 4;
                System.out.println("Employee is part time");
            break;
            default:
                EMP_HRS = 0;
                System.out.println("Employee is absent");
        }
        empWage = EMP_HRS * WAGE_PER_HR;
        totalEmpWage +=empWage;
        System.out.println("Employee Wage is: "+empWage);
	}
        System.out.println("total employee wage: "+totalEmpWage);
	}
}
