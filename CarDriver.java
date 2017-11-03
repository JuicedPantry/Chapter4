package Chapter4;


/**
 * Write a description of class CarDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDriver
{
    
    public static void main()
    {
        Car myCar = new Car(2016, "Dodge");
        System.out.println(myCar);
        
        Car yourCar = new Car(2016, "Dodge");
        
        System.out.println(myCar.equals(yourCar));
    }

    
}
