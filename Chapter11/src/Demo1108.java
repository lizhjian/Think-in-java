import java.util.ArrayList;
import java.util.Iterator;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-21 07:48
 * </pre>
 */
class Gerbil1108{
    int gerbiNumber;

    public Gerbil1108(int gerbiNumber) {
        this.gerbiNumber = gerbiNumber;
    }

    void hop(){
        System.out.println("hop...."+gerbiNumber);
    }
}

public class Demo1108 {
    public static void main(String[] args) {
        ArrayList<Gerbil1101> gerbil1101s = new ArrayList<>();
        gerbil1101s.add(new Gerbil1101(11));
        gerbil1101s.add(new Gerbil1101(22));
        gerbil1101s.add(new Gerbil1101(33));
        gerbil1101s.add(new Gerbil1101(44));

//        for(int i=0;i<gerbil1101s.size();i++){
//            gerbil1101s.get(i).hop();
//        }
        Iterator i = gerbil1101s.listIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}

