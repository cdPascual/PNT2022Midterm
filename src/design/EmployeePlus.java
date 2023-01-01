package design;

import databases.ConnectToSqlDB;

public abstract class EmployeePlus implements Employee{

    final private static String companyName="Best Buy";
    static private int totalEmployees;

    private String firstName;
    private String lastName;
    private String department;
    private String startDate;
    private int employeeID;
    private double hourlyRate;

    //Constructors
    public EmployeePlus(int id){

    }


    //setters
    public void setFirstName(){
        //return employeeID;
    }
    public void setLastName(){

    }
    public void setEmployeeID(){

    }
    public void setHourlyRate(){

    }
    public void setStartDate){

    }
    public void setDepartment(){

    }

    //getters

    public String getFirstName(){

    }
    public String getLastName(){

    }
    public String getDepartment(){

    }
    public int getEmployeeID(){

    }
    public int getTotalEmployees(){

    }



    //employeeId() will return employee id.
    public int employeeId(){

    }

    //employeeName() will return employee name
    public String employeeName(String s) {

    }

    //assignDepartment() will assign employee to departments
    public void assignDepartment(){


    }

    //calculate employee salary
    public int calculateSalary(){

    }

    //employee benefit
    public void benefitLayout(){

    }

}
