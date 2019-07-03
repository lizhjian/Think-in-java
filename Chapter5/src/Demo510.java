import java.awt.print.Book;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-03 08:37
 * </pre>
 */
public class Demo510 {
    public static void main(String[] args) {
        Book1 book1 = new Book1(true);
        book1.chenkIn();

        new Book1(true);
        System.gc();


    }

}
class Book1{
    boolean checkout =false;

    public Book1(boolean checkout) {
        this.checkout = checkout;
    }
    void chenkIn(){
        checkout = false;
    }

    protected void  finalize(){
        if (checkout){
            System.out.println("Error: checed out");
            try {
                super.finalize();
            }catch (Throwable e){
                e.printStackTrace();
            }

        }
    }
}