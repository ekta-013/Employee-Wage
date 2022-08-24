package employeeWage;

public class EmployeeWage {

	public static void main(String[] args) {
		//CONSTANTS
		final int IS_FULLTIME = 1;
        final int IS_PARTTIME = 2;
        final int WAGE_PER_HR = 20;
        int EMP_HRS=0;
        int empWage;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch(empCheck) {
            case IS_FULLTIME:
                System.out.println("Employee is present");
                EMP_HRS = 8;
            break;
            case IS_PARTTIME:
                System.out.println("Employee is PartTime");
                EMP_HRS = 4;
            break;
            default:
                System.out.println("Employee is absent");
        }
        empWage = EMP_HRS * WAGE_PER_HR;
        System.out.println("Employee Wage is: "+empWage);
	}
}
