package rooms;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HealChest extends Room {

    public HealChest(int roomNumber){
        this.roomNumber=roomNumber;
        itsNumber=-1;
        numberOfVisits=0;
        situation1="Пустая комната";
        situation2="Вы входите в комнату и видите какие-то надписи мелом";
        situation3="Сундук с зельями исцеления малых ранений d4/2 (мин1)";
        situation4="Сундук со святой водой d6/2 (мин1)";
    }

    @Override
    public void enterRoom() {
        System.out.println(roomNumber);
        if(numberOfVisits%2==0){
            System.out.println(situation3);
        }
        if(numberOfVisits%2==1){
            System.out.println(situation4);
        }
        if(itsNumber==-1){
            System.out.println(situation1);
        }
        if(itsNumber>-1){
            Integer pageNumb=containPapers.get(itsNumber);

//            Iterator<Entry<Integer, Integer>> it=containPapers.entrySet().iterator();
//
//            while (it.hasNext()){
//                var me = (Entry) it.next();
//                if((Integer) me.getValue()>pageNumb){
//                    it.remove();
//                    containPapers.put((Integer) me.getKey(),(Integer) me.getValue());
//                }
//            }

//            containPapers.remove(itsNumber);
            System.out.println(situation2);
            System.out.println("БУмажка под номером "+pageNumb);
        }
        numberOfVisits++;
    }
}
