package rooms;

public class WashRoom extends Room {

    public WashRoom(int roomNumber){
        this.roomNumber=roomNumber;
        itsNumber=-1;
        numberOfVisits=0;
        situation1="Пустая комната";
    }

    @Override
    public void enterRoom() {
        System.out.println(roomNumber);
        System.out.println(situation1);
        numberOfVisits++;
    }

    @Override
    public Room enterPortal(){

        numberOfTeleportation++;

        String portal;
        if(itsNumber==-1) {
            String paper;
            while (true) {

                System.out.print("Бумажку Дали? Y/N");
                paper = scan.next();
                if (paper.equals("N")) {
                    System.out.println("Не важно, это смывная комната");
                    break;
                }
                if (paper.equals("Y")) {
                    System.out.println("Не важно, это смывная комната");
                    break;
                }
                System.out.println("N или Y введи дурачок!");
            }
        }

        while (true) {

            System.out.print("Какой портал? L/R");
            portal = scan.next();
            if(portal.equals("R")){
                return getRightNeighbour();
            }
            if(portal.equals("L")){
                return getLeftNeighbour();
            }
            System.out.println("L или R введи дурачок!");
        }
    };
}
