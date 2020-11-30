package house;

public class Main {

     public static void main(String[] args) {
         wall wall1 = new wall("west");
         wall wall2 = new wall("east");
         wall wall3 = new wall("North");
         wall wall4 = new wall("South");

         ceiling Ceiling = new ceiling(12, "blue");

         bed bed = new bed(3, 4, 5);

         desk desk = new desk(50, 110);

         singleRoom myRoom = new singleRoom(bed, desk, wall1, wall2, wall3, wall4, Ceiling);
         myRoom.deskType(true);
    }



}
