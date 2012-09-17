/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Damian
 */
public class StartUp {
    public static void main(String[] args) {
        
        //AdvancedJavaCourse advancedJavaCourse = new AdvancedJavaCourse();
        
        GeneralProgrammingCourses[] generalProgrammingCourses = {
            new AdvancedJavaCourse("Advanced Java", "0001", 4.0, "Intro to Programming")
        };
        
        for(GeneralProgrammingCourses a : generalProgrammingCourses) {
            a.information();
        
        }
        
        
        
        
        /* advancedJavaCourse.setCourseName("Advanced Java");
        advancedJavaCourse.setCourseNumber("0001");
        advancedJavaCourse.setCredits(4.0);
        advancedJavaCourse.setPrerequisites("Intro To Programming");
        
        System.out.println("The course's name is: " + advancedJavaCourse.getCourseName());
        System.out.println("The course's number is: " + advancedJavaCourse.getCourseNumber());
        System.out.println("The course's credits is: " + advancedJavaCourse.getCredits());
        System.out.println("The course's prerequisite is: " + advancedJavaCourse.getPrerequisites()); */
    }
    
}
