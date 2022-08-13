package rooms;

import java.util.Scanner;

public class MirrorRoom extends Room {

    boolean mirrored;

    public MirrorRoom(int roomNumber){
        this.roomNumber=roomNumber;
        mirrored=true;
        itsNumber=-1;
        numberOfVisits=0;
        situation1="Пустая комната";
        situation2="Вы входите в комнату и видите какие-то надписи мелом";
    }

    @Override
    public void enterRoom() {
        System.out.println(roomNumber);
        if(itsNumber==-1){
            System.out.println(situation1);
        }
        if(itsNumber>-1){
            Integer pageNumb=containPapers.get(itsNumber);

            System.out.println(situation2);
            System.out.println("БУмажка под номером "+pageNumb);
        }
        numberOfVisits++;
        mirrored=(numberOfVisits%2==0);
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

        while (true) {

            System.out.print("Какой портал? R/L");
            portal = scan.next();
            if(portal.equals("R")){
                if(mirrored) return getLeftNeighbour();
                return getRightNeighbour();
            }
            if(portal.equals("L")){
                if(mirrored) return getRightNeighbour();
                return getLeftNeighbour();
            }
            System.out.println("L или R введи дурачок!");
        }

    }
}
