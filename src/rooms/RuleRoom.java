package rooms;

public class RuleRoom extends Room {

    public RuleRoom(int roomNumber){
        this.roomNumber=roomNumber;
        itsNumber=-1;
        numberOfVisits=0;
        situation1="Пустая комната";
        situation2="Вы входите в комнату и видите какие-то надписи мелом";
        situation3="Аганим Приветствует Героев и говорит, что единственное правило- не быть в комнате дольше 2х минут (не считая боя), иначе им не поздоровится";
        situation4="В Комнате летает книга. Надо ее поймать";
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
