package Chapter4;


/**
 * Write a description of class Factory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factory
{
    private double sqFootage;
    private Car[] inventory;
    public Factory(double sqF, int number)
    {
        sqFootage=sqF;
        inventory= new Car[number];
    }
    public String toString(){
        String output="This factory has \n";
        for(Car c : inventory){
            output+=c + "\n";
        }
        
        return output;
    }
    public void setCar(Car c, int index){
        inventory[index] = c;
    }   
}   
    