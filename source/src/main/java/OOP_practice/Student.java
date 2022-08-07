package OOP_practice;

public class Student {
    private int studentID;
    private String studentName;
    private String collegeName;
    private String address;

    public Student(){}

    public Student(int id, String name, String college, String address){
        this.studentID = id;
        this.studentName = name;
        this.collegeName = college;
        this.address = address;
    }

    public int getStudentID(){
        return this.studentID;
    }
    public String getStudentName(){
        return this.studentName;
    }
    public String getStudentCollegeName(){
        return this.collegeName;
    }
    public String getStudentAddress(){
        return this.address;
    }
    public int setStudentID(int newval){
        return this.studentID = newval;
    }
    public String setStudentName(String name){
        return this.studentName = name;
    }
    public String setStudentCollegeName(String newval){
        return this.collegeName = newval;
    }
    public String setStudentAddress(String address){
        return this.address = address;
    }
}
