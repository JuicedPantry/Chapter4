package Chapter4;

public class Hat
{
    // instance variables - replace the example below with your own
    private int age;
    private boolean wearing;
    
    /**
     * Constructor for objects of class Hat
     */
    public Hat(int ag, boolean wrg)
    {
        // initialise instance variables
        this.age=ag;
        this.wearing=wrg;
    }
    public int getAge(){
        return this.age;
    }
    public void setWearing(boolean wrg){
        this.wearing=wrg;
    }
    public String toString(){
        return "The hat is " + this.age + " years old.";
    }
    


}
