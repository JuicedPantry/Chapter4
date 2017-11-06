package Chapter4;


/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    private String name;
    private int age;
    
    public Author(int ag, String nm){
        this.age=ag;
        this.name=nm;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "The Author is " + this.age + " years old and their name is " + this.name;
    }
}
