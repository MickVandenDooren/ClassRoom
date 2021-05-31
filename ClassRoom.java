package be.intecbrussel;

import java.util.*;

public class ClassRoom {

    private Student[] students = new Student[14];
    private String nameOfClass;

    public ClassRoom(String){

    }

    public Student[] getStudents{
            return students;
    }

    public void setStudents(Student[]){
        this.students=students;
    }

    public void addStudent(Student student){

        for (int i=0;i < students.length;i++){
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
    }

    public String getNameOfClass(){
        return nameOfClass;
    }

    public void setNameOfClass(){
        this.nameOfClass=nameOfClass;
    }

    public void PrintlistofStudentnames(){
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public double getClassAverageGrade(){
        double classAverage=0;
        for (Student student : students) {
            classAverage+= getAverageGrade(student);
        }
        return classAverage;
    }

}
