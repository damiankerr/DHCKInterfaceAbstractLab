package lab1;

import java.util.Set;
import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Damian Kerr
 * @version     1.00
 */
public class AdvancedJavaCourse extends GeneralProgrammingCourses {
   private String courseName = "Advanced Java";
   private String courseNumber = "0001";
   private double credits = 4.0;
   private String prerequisites = "Intro To Programming";
    
   public AdvancedJavaCourse() {
   
   }
   
   public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
       //this.setCourseName(courseName);
       //this.setCourseNumber(courseNumber);
       //this.setCredits(credits);      
       //this.setPrerequisites(prerequisites);
   }
       
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    
    
}
