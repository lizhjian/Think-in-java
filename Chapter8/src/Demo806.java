/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-09 22:45
 * </pre>
 */
public class Demo806 {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[]{new Instrument(),new Wind(),new Brass()};
        for (Instrument instrument:instruments){
            System.out.println(instrument);
        }
    }
}


class Instrument{
    @Override
    public String toString() {
        return "Instrument{}";
    }
}

class Wind extends Instrument{
    @Override
    public String toString() {
        return "Wind{}";
    }
}

class Brass extends Instrument{
    @Override
    public String toString() {
        return "Brass{}";
    }
}