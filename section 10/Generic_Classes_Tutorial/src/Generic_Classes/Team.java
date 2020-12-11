package Generic_Classes;

import java.util.ArrayList;

public class Team {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();

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

    public boolean addPlayer(Player newPlayer){
        if(members.contains(newPlayer)){
            System.out.println(newPlayer.getName() + " is already part of the team");
            return false;
        } else {
            members.add(newPlayer);
            System.out.println(newPlayer.getName() + " has been added to the team " + this.name);
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
