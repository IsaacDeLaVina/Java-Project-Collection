public class DankCompanyEmp {
    public static void main(String[] args) {
        String name = "George Weeds";
        int empID = 123456;
        String postion = "CEO";

        Employee dankEmployeeName = new Employee();
        Employee dankEmployeeID = new Employee();
        Employee dankEmpPosition = new Employee();

        dankEmployeeName.setEmployeName(name);
        System.out.println("Name: " + dankEmployeeName.getEmployeeName());

        dankEmployeeID.setEmployeeID(empID);
        System.out.println("ID number: " + dankEmployeeID.getEmployeeID());

        dankEmpPosition.setPosition(postion);
        System.out.println("Position: " + postion);


    }
}
