package Generic_Classes;
//Generic types are useful to ensure we don't produce a program that compiles fine but produces an error or run time


public class Main {

    public static void main(String[] args) {
        FootballPlayer Joe = new FootballPlayer("Joe");
        BaseballPlayer Pat = new BaseballPlayer("Pat");
        SoccerPlayer Beckham = new SoccerPlayer("Beckham");

        Team PitsburgSteelers = new Team("Pittsburg Steelers");

        PitsburgSteelers.addPlayer(Joe);
        PitsburgSteelers.addPlayer(Pat);
        PitsburgSteelers.addPlayer(Beckham);

        System.out.println(PitsburgSteelers.numberOfPlayers());
        // Problem is these are different types of players added to the same team. We need to try and add football players to football teams etc
        // One way of doing is creating 3 different team classes but that is duplicating code and is inefficient
        // Another way is extend team type to have private classes in Team, but if you do that you need to implement functionality that's unique to each team type
        // fortunately Java has generics and enables us to specify a type

    }




}
