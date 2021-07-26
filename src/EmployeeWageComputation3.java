

public class EmployeeWageComputation3 {

    public int empWage() {
        public int addingParttime() {
            //Variables
            int isFullTime=1;
            int empCheck=(int) (Math.random()*2);   //Using random check whether Employee is Present or Absent
            int empRatePerHr=8;
            int isPartTime=2;
            int empCheck=(int) (Math.random()*3);   //Using random check whether Employee is Present or Absent
            int empFulltimeRatePerHr=8;
            int empPartTimeRatePerHr=4;
            int empHrs=20;
            //Computation
            //Computation
            if (empCheck==isFullTime) {
                int empDailyWage = empRatePerHr * empHrs;   //Employee Daily Salary
                System.out.println("Employee is Present and Employee Fullday Wage is "+ empDailyWage);
                int empDailyWage = empFulltimeRatePerHr * empHrs;      // Employee Fullday Salary
                System.out.println("Employee Fullday Wage is "+ empDailyWage);
            }
            else if (empCheck==isPartTime) {
                int empDailyWage = empPartTimeRatePerHr * empHrs;
                System.out.println("Employee Halfday Wage is "+ empDailyWage);    //Employee Halfday Salary
            }
            else {
                System.out.println("Employee is Absent");
            }
            return 0;
        }

        public static void main(String [] args) {

            EmployeeWageComputation obj1 = new EmployeeWageComputation();		//Creating Objects

            obj1.empWage();
            obj1.addingParttime();
            System.out.println("");

