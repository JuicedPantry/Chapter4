package Chapter4;

public class Car
{
    private int year;
    private String model;
    public Car(int yr, String mdl)
    {
        this.year=yr;
        this.model=mdl;
    }
    public String getModel(){
        return this.model;
    }
    public String toString(){
        return "This is a " + model + " made in " + year;
    }
    public boolean equals(Car otherCar){
        if(this.model.equals(otherCar.model) && this.year==otherCar.year){
            return true;
        }
        else{
            return false;
        }
    }
}
