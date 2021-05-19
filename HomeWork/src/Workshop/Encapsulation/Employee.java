package Workshop.Encapsulation;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeDepartment;
    private int employeeSal;

    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public String getEmployeeDepartment(){
        return employeeDepartment;
    }
    public int getEmployeeSal(){
        return employeeSal;
    }

    public void setEmployeeId(int id){
        this.employeeId = id;

    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void setEmployeeDepartment(String department) {
        this.employeeDepartment = department;
    }

    public void setEmployeeSal(int sal) {
        this.employeeSal = sal;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(10);
        e.setEmployeeName("John");
        e.setEmployeeDepartment("Banking");
        e.setEmployeeSal(35000);

        System.out.println(e.getEmployeeId());
        System.out.println(e.getEmployeeName());
        System.out.println(e.getEmployeeDepartment());
        System.out.println(e.employeeSal);
    }
}
