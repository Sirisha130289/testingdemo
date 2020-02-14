package be.intecbrussel.testingdemo;

public class School {

    private int noOfStudents;

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public boolean isBigSchool() {
        return noOfStudents>1000;
    }
}
