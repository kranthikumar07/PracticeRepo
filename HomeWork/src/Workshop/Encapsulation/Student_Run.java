package Workshop.Encapsulation;

public class Student_Run {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setStudentId(10);
        obj.setStudentName("john");
        obj.setGroupName("CSE");
        obj.setStudentRank(1);

        System.out.println(obj.getStudentId());
        System.out.println(obj.getStudentName());
        System.out.println(obj.getGroupName());
        System.out.println(obj.getStudentRank());
    }
}
