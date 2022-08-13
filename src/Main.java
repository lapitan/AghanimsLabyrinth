import rooms.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Room room1=new RuleRoom(1);
        Room room2=new OgreRoom(2);
        Room room3=new GhoulRoom(3);
        Room room4=new ManticoreRoom(4);
        Room room5=new FireTrapRoom(5);
        Room room6=new FireElementalRoom(6);
        Room room7=new MirrorRoom(7);
        Room room8=new MirrorRoom(8);
        Room room9=new SwordRoom(9);
        Room room10=new HealChest(10);
        Room room11=new FireTrapRoom(11);
        Room room12=new WashRoom(12);
        Room room13=new GoldChest(13);
        Room room14=new DoorBookRoom(14);
        Room room15=new EmptyRoom(15);
        Room room16=new FlyingBookRoom(16);
        Room room17=new ThreePortalsRoom(17,room9);
        Room exit=new ExitRoom(18);

        room1.setNeighbours(room13,room12);
        room2.setNeighbours(room17,room4);
        room3.setNeighbours(room2,room4);
        room4.setNeighbours(room16,room11);
        room5.setNeighbours(room7,room1);
        room6.setNeighbours(room11,room1);
        room7.setNeighbours(room15,exit);
        room8.setNeighbours(room5,room10);
        room9.setNeighbours(room14,room10);
        room10.setNeighbours(room5,room6);
        room11.setNeighbours(room13,room15);
        room12.setNeighbours(room16,room10);
        room13.setNeighbours(room4,room3);
        room14.setNeighbours(room11,room8);
        room15.setNeighbours(room12,room8);
        room16.setNeighbours(room9,room10);
        room17.setNeighbours(room4,room6);
        exit.setNeighbours(room1,room1);

        Room currRoom=room1;

        while (true){
            currRoom.enterRoom();
            currRoom= currRoom.enterPortal();
        }


    }

    //YLYRYLYLYMYRYLYLYLYRYR

}
