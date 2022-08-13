package rooms;

import com.sun.tools.javac.Main;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Room {

    public static int currNumb=0;
    public static HashMap<Integer,Integer> containPapers=new HashMap<>();
    protected int itsNumber;
    protected int roomNumber;
    protected int numberOfVisits;
    protected Room leftNeighbour;
    protected Room rightNeighbour;
    protected String situation1;
    protected String situation2;
    protected String situation3;
    protected String situation4;
    protected static int numberOfTeleportation=0;
    public static final Scanner scan= new Scanner(System.in);



    public abstract void enterRoom();

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

    Room getLeftNeighbour(){
        return leftNeighbour;
    }
    Room getRightNeighbour(){
        return rightNeighbour;
    }

    public void setNeighbours(Room leftNeighbour,Room rightNeighbour){
        this.leftNeighbour=leftNeighbour;
        this.rightNeighbour=rightNeighbour;
    }

    public void setLeftNeighbour(Room leftNeighbour) {
        this.leftNeighbour = leftNeighbour;
    }

    public void setRightNeighbour(Room rightNeighbour) {
        this.rightNeighbour = rightNeighbour;
    }

    public void setSituation1(String situation1) {
        this.situation1 = situation1;
    }

    public void setSituation2(String situation2) {
        this.situation2 = situation2;
    }

    public void setSituation3(String situation3) {
        this.situation3 = situation3;
    }

    public void setSituation4(String situation4) {
        this.situation4 = situation4;
    }
}
