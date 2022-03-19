package uk.axone.devintest.encapsulation;

public class EmployeeTest {

    public static void main(String[] args) {

        /*
        scenario 1 - create new Employee
         */
        Employee newEmp = new Employee();
       /* newEmp.empID = "$*£**%"; //from the frontend
        newEmp.empName = "1234";
        newEmp.empAge = 549084509;
        newEmp.numHolidays = -489548;
        newEmp.salary = -54895489;*/

        newEmp.setEmpID("1234");
        newEmp.setEmpName("Ram");
        newEmp.setSalary(989034);
        newEmp.setNumHolidays(25);
        newEmp.save();

        /*
        scenario 2 - get Employee Details
         */
        Employee exisEmp = new Employee("3456");//from the front end
        System.out.println(exisEmp.getEmpName());
        System.out.println(exisEmp.getEmpAge());
        System.out.println(exisEmp.getSalary());
    }

}
