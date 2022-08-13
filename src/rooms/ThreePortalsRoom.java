package rooms;

import java.util.Scanner;

public class ThreePortalsRoom extends Room {

    Room middlePortal;
    boolean threePortal=true;

    public ThreePortalsRoom(int roomNumber, Room thirdRoom){
        middlePortal=thirdRoom;
        this.roomNumber=roomNumber;
        itsNumber=-1;
        numberOfVisits=0;
        situation1="Пустая комната";
        situation2="Вы входите в комнату и видите какие-то надписи мелом";
        situation3="В комнате 3 портала";
    }

    @Override
    public void enterRoom() {
        System.out.println(roomNumber);
        if(numberOfVisits%2==0){
            System.out.println(situation3);
        }
        if(itsNumber==-1){
            System.out.println(situation1);
        }
        if(itsNumber>-1){
            Integer pageNumb=containPapers.get(itsNumber);

            containPapers.remove(itsNumber);
            System.out.println(situation2);
            System.out.println("БУмажка под номером "+pageNumb);
        }
        threePortal=(numberOfVisits%2==0);
        numberOfVisits++;
    }

    @Override
    public Room enterPortal() {

        numberOfTeleportation++;
        String portal;

        if(itsNumber==-1) {
            String paper;
            while (true) {

                System.out.print("Бумажку Дали? Y/N");
                paper = scan.next();
                if (paper.equals("N")) {
                    break;
                }
                if (paper.equals("Y")) {
                    containPapers.put(currNumb, containPapers.size() + 1);
                    itsNumber = currNumb;
                    currNumb++;
                    break;
                }
                System.out.println("N или Y введи дурачок!");
            }
        }

        if(threePortal) {
            while (true) {

                System.out.print("Какой портал? R/M/L");
                portal = scan.next();
                if (portal.equals("R")) {
                    return getRightNeighbour();
                }
                if (portal.equals("L")) {
                    return getLeftNeighbour();
                }
                if (portal.equals("M")) {
                    return middlePortal;
                }
                System.out.println("L/R/M введи дурачок!");
            }
        }else {
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
        }
    }
}
