package Encapsulation;

public class Encapsulation_Student_Run {
    public static void main(String[] args) {
        Encapsulation_Student s = new Encapsulation_Student();
        s.setStudentId(1);
        s.setStudentName("Kranthi");
        s.setStudentGroup("CSE");
        s.setStudentRank(1);


        System.out.println(s.getStudentId());
        System.out.println(s.getStudentName());
        System.out.println(s.getStudentGroup());
        System.out.println(s.getStudentRank());
    }
}