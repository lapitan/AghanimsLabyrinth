package rooms;

public class GoldChest extends Room {

    public GoldChest(int roomNumber){
        this.roomNumber=roomNumber;
        itsNumber=-1;
        numberOfVisits=0;
        situation1="Пустая комната";
        situation2="Вы входите в комнату и видите какие-то надписи мелом";
        situation3="Сундук с золотом d%/2";
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
        numberOfVisits++;
    }
}
