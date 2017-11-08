package Chapter4;


/**
 * Write a description of class TeamDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeamDriver
{
    public static void main() {
        Team soccer = new Team("Acalanes Soccer", 22);
        Athlete joe = new Athlete ("Joe", 16);
        soccer.addAthlete(joe,0);
        System.out.println(soccer);
    }
}
