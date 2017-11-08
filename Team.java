package Chapter4;


/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    private String teamName;
    private Athlete [] players;
    public Team(String tmNm, int size){
        this.teamName=tmNm;
        this.players= new Athlete[size];
    }
    public void addAthlete(Athlete a, int index) {
        players[index] = a; 
    }
    public String toString(){
        String output = "The team members for " + this.teamName + "\n";
        for(Athlete a : players){
            output += a + "\n";
        }
        return output;
    }
}
