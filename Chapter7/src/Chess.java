/**
 * <pre>
 * desc ：不指明的情况下,子类调用父类不带参数的构造器，如果父类没有不带参数的构造器,子类报错
 * author ：lizj
 * date ：2019-07-07 17:53
 * </pre>
 */
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        // print("BoardGame constructor"); // call to super must be first
        // statement in constructor
        super(i); // else: "cannot find symbol: constructor Game()
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}