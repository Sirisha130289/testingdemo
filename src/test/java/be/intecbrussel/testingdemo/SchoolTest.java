package be.intecbrussel.testingdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    public void testSetNoOfStudents() {
        School school = new School();
        school.setNoOfStudents(10);
        Assertions.assertEquals(10, school.getNoOfStudents());
    }

    @Test
    public void testIsSchoolBig() {
        School school = new School();
        school.setNoOfStudents(1001);
        Assertions.assertTrue(school.isBigSchool());
    }
}