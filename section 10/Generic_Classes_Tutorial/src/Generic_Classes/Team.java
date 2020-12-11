package Generic_Classes;

import java.util.ArrayList;

public class Team<T> { //We put a Diamond with a T in the middle
    // We're modifying class declaration to include a type parameter by adding the <>
    // How it works is when we share a class,
    // The T will be automatically replaced by Java with class we're using with real type when instantiating class
    // This is why Array List and method using ArrayList changed types to T

    // Since T isn't known until we instantiate a class, in other words run time,
    // there's no way for Java to know of object of type T really does have a get Name method

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();
    //By modifying class declaration we modify ArrayList type with T so it works with any form of player
    //T was previously Player

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public boolean addPlayer(Player newPlayer){
//        for(int i = 0; i<members.size(); i++){
//            Player foundPLayer = members.get(i);
//            if(newPlayer != foundPLayer){
//                members.add(newPlayer);
//                return true;
//            }
//        }
//        System.out.println(newPlayer.getName() + " is already part of the team");
//        return false;
//
//    }

    public boolean addPlayer(T newPlayer){ //Adding typed parameter again for addPlayer Method
        Player castPlayer = (Player) newPlayer;
        //Casting T New player to a Player type so that you can get the name
        if(members.contains(newPlayer)){
            System.out.println(castPlayer.getName() + " is already part of the team");
            return false;
        } else {
            members.add(newPlayer);
            System.out.println(castPlayer.getName() + " has been added to the team " + this.name);
            return true;
        }
    }

    public int numberOfPlayers(){
        return this.members.size();
    }

    //result of team
    public void matchResult(Team opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        } else if( ourScore == theirScore) {
            tied++;
        } else{
            lost++;
        }
        played++; //Increase the number of games played
        if(opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
            // we're passing null this time so that we can update opponents score and by passing null this code doesn't get executed again
        }
    }

    public int ranking(){
        return (won*2) + tied;
    }

}
