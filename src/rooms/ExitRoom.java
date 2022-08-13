package rooms;

public class ExitRoom extends Room {

    public ExitRoom(int roomNumber){
        this.roomNumber=roomNumber;
        itsNumber=-1;
        numberOfVisits=0;
        situation1="Ты вышел!!! это заняло у тебя ";
    }

    @Override
    public void enterRoom() {
        System.out.println(situation1+numberOfTeleportation+" телепортаций!!!");
    }
}
