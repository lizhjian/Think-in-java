/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-14 07:15
 * </pre>
 */

interface GameTest{
    void next();
        }
interface GameFactory{
    GameTest getGameTest();
}
class ChessTest implements GameTest{
    @Override
    public void next() {
        System.out.println("ChessTest.....next");
    }
}

class Checks implements GameTest{
    @Override
    public void next() {
        System.out.println("Checks.....next");

    }
}

class ChessFactrory implements GameFactory{
    @Override
    public GameTest getGameTest() {
        return new Checks();
    }
}

class CheckFactrory implements GameFactory{
    @Override
    public GameTest getGameTest() {
        return new Checks();
    }
}


public class Games {

    public static void factory(GameFactory factory){
        factory.getGameTest().next();

    }

    public static void main(String[] args) {
        Games.factory(new ChessFactrory());
    }

}
