package be.intecbrussel;

public class ReportCard {

    private int[] grades = new int[10];
    private int numberofGrades;

    public int[] getGrades(){
        return grades;
    }

    public void addGrade(int x){
        numberofGrades+=1;
        for (int i=0;i < grades.length;i++){
            if (grades[i] == 0){
                grades[i] = x;
                break;
            }
        }

    }

    public double getAverageGrade(){
        double average=0;
        for (int grade : grades) {
            average += grade;
        }
        average/=numberofGrades;
        return average;
    }



}
