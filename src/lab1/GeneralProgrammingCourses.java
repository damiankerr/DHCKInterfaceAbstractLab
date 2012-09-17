/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Damian
 */
public abstract class GeneralProgrammingCourses {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public GeneralProgrammingCourses() {
    
    }
    
    public GeneralProgrammingCourses(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
    
    
    public abstract void information();
    

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        //Add Validation
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        //Add Validation
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        //Add Validation
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        //Add Validation
        this.prerequisites = prerequisites;
    }
    
    
    
  
    
    
}
