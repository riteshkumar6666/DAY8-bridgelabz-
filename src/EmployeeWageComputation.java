public class EmployeeWageComputation {

    public int check() {
        //Variables
        int empCheck = (int) (Math.random()*2);			//Using random check whether Employee is Present or Absent
        int isPresent=1;
        int isAbsent=0;
        //Computation
        if (empCheck==isPresent) {
            System.out.println("Employee is Present");
        }

        else if (empCheck==isAbsent) {
            System.out.println("Employee is Absent");
        }
        return 0;
    }


    public static void main(String [] args) {

        System.out.println("Welcome to Employee Wage Computation Program...");

    }
    EmployeeWageComputation obj1 = new EmployeeWageComputation();		//Creating Objects

	obj1.Check();
	System.out.println("");

}
}
