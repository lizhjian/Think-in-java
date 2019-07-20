import java.util.ArrayList;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-20 12:34
 * </pre>
 */

class Gerbil1101{
    int gerbiNumber;

    public Gerbil1101(int gerbiNumber) {
        this.gerbiNumber = gerbiNumber;
    }

    void hop(){
        System.out.println("hop...."+gerbiNumber);
    }
}

public class Demo1101 {
    public static void main(String[] args) {
        ArrayList<Gerbil1101> gerbil1101s = new ArrayList<>();
        gerbil1101s.add(new Gerbil1101(11));
        gerbil1101s.add(new Gerbil1101(22));
        gerbil1101s.add(new Gerbil1101(33));
        gerbil1101s.add(new Gerbil1101(44));

        for(int i=0;i<gerbil1101s.size();i++){
            gerbil1101s.get(i).hop();
        }
    }
}


