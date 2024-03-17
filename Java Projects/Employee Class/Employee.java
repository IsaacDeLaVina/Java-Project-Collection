public class Employee{
    // Employee data as fields/variables
    private String employeeName;
    private int employeeIdNum;
    private String department;
    private String position;
    
   // Constructors
   // This constructor provides values to the variables
    public Employee(String name, int ID_number, String workDepartment, String empPosition){
        employeeName = name;
        employeeIdNum = ID_number;
        department = workDepartment;
        position = empPosition;
    }

    public Employee(String name, int ID_number){
        department = "";
        position = "";
    }

    // No-Arg constructor
    public Employee(){
        // default constructors 
        employeeName = "";
        department = "";
        position = "";
        employeeIdNum = 0;

    }

    // Accessor/Getters and Setters/Mutator
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeName(String name){
        employeeName = name;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String workDepartment){
        department = workDepartment;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String empPosition){
        position = empPosition;
    }
    
    public int getEmployeeID(){
        return employeeIdNum;
    }

    public void setEmployeeID(int empID){
       employeeIdNum = empID;
    }

    

}