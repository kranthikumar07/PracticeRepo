package Workshop.Encapsulation;

public class Student {
    private int rollNo;
    private String name;
    private String group;
    private int rank;

    public int getStudentId(){
        return rollNo;
    }
    public String getStudentName(){
        return name;
    }
    public String getGroupName(){
        return group;
    }
    public int getStudentRank(){
        return rank;
    }
    public void setStudentId(int id){
        this.rollNo = id;
    }
    public void setStudentName(String sname){
        this.name = sname;
    }
    public void setGroupName(String gname){
        this.group = gname;
    }
    public void setStudentRank(int srank){
        this.rank = srank;
    }



}
