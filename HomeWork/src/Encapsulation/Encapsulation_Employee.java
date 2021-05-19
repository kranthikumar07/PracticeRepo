package Encapsulation;

public class Encapsulation_Employee {
    private int employeeID;
    private String name;
    private int age;

    public int getEmployeeID(){
        return employeeID;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setEmployeeID(int employID){
        this.employeeID = employID;
    }

    public void setName(String employname){
        this.name = employname;
    }
    public void setAge(int employage){
        this.age = employage;
    }

    public static void main(String[] args) {
        Encapsulation_Employee e =new Encapsulation_Employee();
        e.setEmployeeID(1);
        e.setName("Kranthi");
        e.setAge(35);

        System.out.println(e.getEmployeeID());
        System.out.println(e.getName());
        System.out.println(e.getAge());
    }



}
