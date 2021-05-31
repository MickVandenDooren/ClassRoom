package be.intecbrussel;

public class Student {

    private int studentID;
    private String name;
    private ReportCard reportCard;
    private static int numberOfStudents;

    public Student (String name){
        studentID=numberOfStudents+1;
        numberOfStudents+=1;
        this.name = name;
        this.reportCard = new ReportCard();

    }

    public int getStudentID(){
        return studentID;
    }

    public String getName(){
        return name;
    }

    public ReportCard getReportCard() {
        return reportCard;
    }

g
}
