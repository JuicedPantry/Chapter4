package Chapter4;

// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Grades
{
    //declare instance data
    private String name;
    private int test1;
    private int test2;
    private double average;
    //constructor
    Scanner scan = new Scanner(System.in);
    public Grades(String studentName)
    {
        this.name=studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter score for test 1");
        test1=scan.nextInt();
        System.out.println("Enter score for test 2");
        test2=scan.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    public void getAverage(){
        double average=(test1+test2)/2;
        System.out.println("Average: " + average);
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    public void getName()
    {
        //add body of getName
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    {
        //add body of printName
    }
}