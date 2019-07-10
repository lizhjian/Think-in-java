/**
 * <pre>
 * desc ：计数法 shared作为计数变量,finalize作为其成员函数,判断shared内部的计数是否为空再进行回收
 * author ：lizj
 * date ：2019-07-10 08:00
 * </pre>
 */
public class ReferenceCounting {

    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = new Composing[]{new Composing(shared),new Composing(shared),new Composing(shared)};

        for (Composing c:composings){
            c.dispose();
        }
       // System.gc();


        Composing compTest = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        // Test finalize():
        shared.finalize();
//        Shared sharedTest = new Shared();
//        Composing compTest3 = new Composing(sharedTest);
//        // Test sharedTest finalize():
//        sharedTest.finalize();
    }


}

class Shared{
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating "+this);
    }
    public void addRef(){
        refcount ++;
    }
    protected void dispose(){
        if(--refcount ==0){
            System.out.println("Disposing "+this);
        }
    }

    @Override
    protected void finalize() {
        if(refcount > 0)
            System.out.println("Error: " + refcount + " Shared " + id + " objects in use");
    }


    @Override
    public String toString() {
        return "Shared "+id;
    }
}

class Composing{
    private Shared shared;
    private static long counter = 0;

    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating "+this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose(){
        System.out.println("disposing..."+this);
        shared.dispose();

    }

    @Override
    public String toString() {
        return "Composing "+id;
    }


}
