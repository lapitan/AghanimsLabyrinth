package rooms;

public class DoorBookRoom extends Room {

    public DoorBookRoom(int roomNumber){
        this.roomNumber=roomNumber;
        itsNumber=-1;
        numberOfVisits=0;
        situation3="В Книге написано, что на т-образном перекрестке будет секретная дверь. Вам было бы неплохо туда зайти";
        situation1="Пустая комната";
        situation2="Вы входите в комнату и видите какие-то надписи мелом";
        situation4="Книга летает, надо ее поймать";
    }

    @Override
    public void enterRoom() {

        System.out.println(roomNumber);

        if(numberOfVisits==0){
            System.out.println(situation3);
        }
        if(numberOfVisits>0&&numberOfVisits%2==0){
            System.out.println(situation4);
        }
        if(itsNumber==-1){
            System.out.println(situation1);
        }
        if(itsNumber>-1){

            Integer pageNumb=containPapers.get(itsNumber);
            System.out.println(situation2);
            System.out.println("БУмажка под номером "+pageNumb);
        }

        numberOfVisits++;

    }

}
