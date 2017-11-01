package Chapter4;
public class Pet
{
    private String name;
    private boolean alive;
    public static int numPets;
    public Pet(String nm, boolean al)
    {
        this.name = nm;
        this.alive = al;
    }
    
    public String getName(){
        return this.name;
    }
    public static void example(){
        System.out.println("this is static");
    }
    public void setAlive(boolean al) {
        this.alive=al;
    }
    
    public String toString(){
        return "This pet is named: " + this.name;
    }
}
