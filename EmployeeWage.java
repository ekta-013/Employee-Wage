package employeeWage;

public class EmployeeWage {

	public static void main(String[] args) {
		//CONSTANTS
        int IS_FULLTIME = 1;
        int IS_PARTTIME = 2;
        int WAGE_PER_HR = 20;
        int EMP_HRS;
        int empWage;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULLTIME) {
            EMP_HRS = 8;
            System.out.println("Employee is full time");
        }
        else if(empCheck == IS_PARTTIME) {
        	EMP_HRS = 4;
        	System.out.println("Employee is part time");
        }
        else {
        	EMP_HRS =0;
        	System.out.println("Employee is Absent");
        }
            empWage = EMP_HRS * WAGE_PER_HR;
            System.out.println("Employee wage: "+empWage);
	}
}
