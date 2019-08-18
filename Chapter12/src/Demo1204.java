import javafx.scene.media.MediaException;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-18 20:17
 * </pre>
 */
public class Demo1204 {

    public static void main(String[] args) {
        try{
            f();
        }catch (MyException1204 e){
           e.printStackTrace();
            System.out.println("======================");
            e.show();
        }
    }

    public static  void  f() throws MyException1204{
        throw new MyException1204("f-sfxxxx-->");

    }
}

class MyException1204 extends Exception{

    private String msg;
    public MyException1204() {
    }

    public MyException1204(String message) {
        super(message);
        msg = message;
    }
    public void show(){
        System.out.println("MyException1204----show->"+msg);
    }
}