package employeeWage;

public class EmployeeWage {

	public static void main(String[] args) {
		//CONSTANTS
        int IS_PRESENT = 1;
        int EMP_HRS = 8;
        int WAGE_PER_HR = 20;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is present");
            int empWage = EMP_HRS * WAGE_PER_HR;
            System.out.println("Employee wage: "+empWage);
        } else {
            System.out.println("Employee is absent");

        }
	}
}
