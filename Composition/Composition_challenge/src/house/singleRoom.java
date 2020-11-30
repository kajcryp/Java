package house;

public class singleRoom {
    private bed myBed;
    private desk myDesk;
    private wall wall1, wall2, wall3, wall4;
    private ceiling ceiling1;

    public singleRoom(bed myBed, desk myDesk, wall wall1, wall wall2, wall wall3, wall wall4, ceiling ceiling1) {
        this.myBed = myBed;
        this.myDesk = myDesk;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling1 = ceiling1;
    }

    public void deskType(boolean deskType) {
        boolean deskTypeElectric = true;
        if (deskType) {
            System.out.println("This desk is a standing desk");
        } else {
            System.out.println("This is an ordinary desk");
        }

    }

}