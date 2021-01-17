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

        Team<SoccerPlayer> Arsenal = new Team<>("Arsenal");
//        Arsenal.addPlayer(Pat);
//        Arsenal.addPlayer(Joe);    Don't work as Arsenal is assigned as a soccer team so can only add soccer players because of the <T>
        Arsenal.addPlayer(Beckham);

        Team<BaseballPlayer> NewYorkYankees = new Team<>("New York Yankees");
        NewYorkYankees.addPlayer(Pat);

        //So type parameter T can bring through any type apart from primitive types such as ints.

    //    Team<String> brokenTeam = new Team<>("This won't work"); //when we add T extends Player in Team class, it should produce error or red line under string
    //    brokenTeam.addPlayer("no-one");
        //problem here is the cast in the addPlayer method. When we want to run this, we get an exception to the thread error
        //We need ability to restrict the type that can be provided for this T argument
        //Good thing though is that Java also provides the mechanism for restricting the types that can be used as type arguments and I call this bounded type parameters
        //By using those you can provide them with an upper bound

        Team<FootballPlayer> NFL = new Team<>("NFL");
        NFL.addPlayer(Joe);


        System.out.println(PitsburgSteelers.numberOfPlayers());
        // Problem is these are different types of players added to the same team. We need to try and add football players to football teams etc
        // One way of doing is creating 3 different team classes but that is duplicating code and is inefficient
        // Another way is extend team type to have private classes in Team, but if you do that you need to implement functionality that's unique to each team type
        // fortunately Java has generics and enables us to specify a type

        Team<SoccerPlayer> Liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> Tottenham = new Team<>("Tottenham");

        Arsenal.matchResult(Liverpool, 5,3);
        Arsenal.matchResult(Tottenham, 5,5);
     //   Arsenal.matchResult(NFL, 3, 2); - this works which is wrong as NFL is a different type. what you need to do is specify the team tyoe in the method with <T>.



    }




}
