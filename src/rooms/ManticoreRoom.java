package rooms;

public class ManticoreRoom extends Room {

    public ManticoreRoom(int roomNumber){
        this.roomNumber=roomNumber;
        itsNumber=-1;
        numberOfVisits=0;
        situation1="Пустая комната";
        situation2="Вы входите в комнату и видите какие-то надписи мелом";
        situation3="Аганим резко влетает: ОЙОЙОЙОЙООЙОЙЙЙ!!! Все допускают ошибки, вам слишком рано для этого!!! Извините. (Испепеляет мантикору за долю секунды так, что от нее ничего не отсается, вообще, и призывает на ее место серую жижу)";
        situation4="Вы видите Серую жижу";
    }

    @Override
    public void enterRoom() {
        System.out.println(roomNumber);
        if(numberOfVisits==0){
            System.out.println(situation3);
        }
        if(numberOfVisits>0&&numberOfVisits%3==0){
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
