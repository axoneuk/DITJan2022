package uk.axone.devintest.encapsulation;

public class Employee {

    private String empID;
    private String empName;
    private int empAge;
    private int salary;
    private int numHolidays;

    Employee(){

    }

    Employee(String empID){
        this.empID = empID;
        load();
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        //validations
        //if(empID contains special chars){
        //}
        //throw exceptions
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        //validations
        //throw exceptions
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNumHolidays() {
        return numHolidays;
    }

    public void setNumHolidays(int numHolidays) {
        this.numHolidays = numHolidays;
    }

    boolean save(){
        //validate all fields and return false
        //insert a new record in the DB
        //insert into EMPLOYEE, values (empID, empNAme, empAge, salary, numHolidays)
        return true;
    }

    private boolean load(){
        //query the DB - EMPLOYEE Table
        //select * from EMPLOYEE where EMP_ID = empID;
        //empName = queryResult.EMP_NAME
        //empAge = queryResult.EMP_AGE
        return true;
    }
}
