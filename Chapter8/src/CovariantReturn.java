/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-09 21:49
 * </pre>
 */
public class CovariantReturn {

    public static void main(String[] args) {
        Mill m = new Mill();
        Grain grain = m.process();
        System.out.println(grain);

        m = new WheatMill();
        grain = m.process();
        System.out.println(grain);
    }

}
class Grain{
    @Override
    public String toString() {
        return "Grain{}";
    }
}
class Wheat extends Grain{
    @Override
    public String toString() {
        return "Wheat{}";
    }
}
class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    Wheat process(){
        return new Wheat();
    }
}