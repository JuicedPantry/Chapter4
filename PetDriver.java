package Chapter4;


public class PetDriver
{

    public static void main(String[] args) {
        Pet fluffy = new Pet("Fluffy", true);
        System.out.println(fluffy);
        fluffy.setAlive(false);
        
        Pet.example();
        System.out.println("Number of pets: " + Pet.numPets);
        
        Pet sam = new Pet("Sam", true);
        System.out.println("Number of pets: " + Pet.numPets);
    }
}
