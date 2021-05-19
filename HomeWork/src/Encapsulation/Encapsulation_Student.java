package Encapsulation;

public class Encapsulation_Student {
    private int id;
    private String name;
    private String group;
    private int rank;

    public int getStudentId(){
        return id;
    }
    public String getStudentName(){
        return name;
    }
    public String getStudentGroup(){
        return group;
    }
    public int getStudentRank(){
        return rank;
    }

    public void setStudentId(int rollno){
        this.id = rollno;
    }
    public void setStudentName(String sname){
        this.name = sname;
    }
    public void setStudentGroup(String sgroup){
        this.group = sgroup;
    }
    public void setStudentRank(int srank){
        this.rank = srank;
    }

}
