/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-03 08:56
 * </pre>
 */
public class Demo511 {
    public static void main(String[] args) {
        Book51 book51 = new Book51(1);
        Book51 book52 = new Book51(1);
        Book51 book53 = new Book51(1);
        Book51 book54 = new Book51(1);
        Book51 book55 = new Book51(1);
        Book51 book56 = new Book51(1);
        Book51 book57 = new Book51(1);
        Book51 book58 = new Book51(1);
        Book51 book59 = new Book51(1);
        Book51 book510 = new Book51(1);
        Book51 book511 = new Book51(1);
        Book51 book512 = new Book51(1);
        Book51 book513 = new Book51(1);
        Book51 book514 = new Book51(1);
        new Book51(1);
        book51.get();

        System.gc();  //只有new Book51(1)时虚拟机才会尝试垃圾回收
       // book51.finalize();
    }

}
class Book51{
    protected void  finalize(){
        System.out.println("垃圾回收");
    }
    int get (){
        return 1;
    }
    int num;

    public Book51(int num) {
        this.num = num;
    }
}
//class WebBank {
//    boolean loggedIn = false;
//    WebBank(boolean logStatus) {
//        loggedIn = logStatus;
//    }
//    void logIn() {
//        loggedIn = true;
//    }
//    void logOut() {
//        loggedIn = false;
//    }
//    protected void finalize() {
//        if(loggedIn)
//            System.out.println("Error: still logged in");
//        // Normally, you'll also do this:
//        // super.finalize(); // Call the base-class version
//    }
//}
//
//public class Demo511 {
//    public static void main(String[] args) {
//        WebBank bank1 = new WebBank(true);
//        WebBank bank2 = new WebBank(true);
//        // Proper cleanup: log out of bank1 before going home
//        bank1.logOut();
//        // Drop the reference, forget to cleanup:
//        new WebBank(true);
//        // Force garbage collection and finalization:
//        System.gc();
//    }
//}