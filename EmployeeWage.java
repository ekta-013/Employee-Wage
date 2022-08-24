package employeeWage;

public class EmployeeWage {
		//CONSTANTS
		final int IS_FULLTIME = 1;
        final int IS_PARTTIME = 2;
        final int WAGE_PER_HR = 20;
        final int NUM_OF_WORKING_DAYS = 20;
        final int MAX_WORKING_HRS = 100;
        
    public void computeEmployeeWage() {
       int empWage;
       int workingHrs = 0; 
        int totalWorkingHrs = 0; 
        int totalWorkingDays = 0;
        while (totalWorkingHrs <= MAX_WORKING_HRS && totalWorkingDays <= NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch(empCheck) {
            case IS_FULLTIME:
            	workingHrs = 8;
                System.out.println("Employee is full time");
            break;
            
            case IS_PARTTIME:
            	workingHrs = 4;
                System.out.println("Employee is part time");
            break;
            default:
            	workingHrs = 0;
                System.out.println("Employee is absent");
        }
        totalWorkingHrs += workingHrs;
        System.out.println("Day " + totalWorkingDays + " Employee working hours= " + workingHrs);
        
        empWage = workingHrs * WAGE_PER_HR;
        System.out.println("Employee working hours: " + empWage);
    }
    int totalEmpWage = totalWorkingHrs * WAGE_PER_HR;
    System.out.println("Total Emp Wage: " + totalEmpWage);
}
    public static void main(String[] args) {
    	EmployeeWage obj = new EmployeeWage();
    	obj.computeEmployeeWage();
    }
}
