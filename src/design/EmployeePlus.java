package design;

import databases.ConnectToSqlDB;

public abstract class EmployeePlus implements Employee{

    final private static String companyName="Best Buy";
    static private int totalEmployees;

    private String firstName;
    private String lastName;
    private String department;
    private String startDate;

    int employeeID;
    int hourlyRate;

    //Constructors
    public EmployeePlus(int id){

    }


    //setters
    public void setFirstName(){

    }
    public void setLastName(){

    }
    public void setEmployeeID(){

    }
    public void setHourlyRate(){

    }
    public void setStartDate(){

    }
    public void setDepartment(){

    }
    public void setTotalEmployees(){

    }

    //getters

    public String getFirstName(){
        return firstName;

    }
    public String getLastName(){
        return lastName;
    }
    public String getDepartment(){
        return department;
    }
    public int getTotalEmployees(){
        return totalEmployees;
    }



    //employeeId() will return employee id.
    public int employeeId(){
        return employeeID;

    }

    //employeeName() will return employee name
    public String employeeName() {
        return (firstName+" "+lastName);
    }

    //assignDepartment() will assign employee to departments
    public abstract void assignDepartment();

    //calculate employee salary
    public abstract int calculateSalary();

    //employee benefit
    public abstract void benefitLayout();
}
