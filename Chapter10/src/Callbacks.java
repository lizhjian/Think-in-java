/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-20 09:13
 * </pre>
 */


interface Incrementable{
    void increment();
}

class MyIncrement{
    public void increment(){
        System.out.println("Other operation");
    }
}

class Callee2 extends MyIncrement{
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Incrementable incrementable;
    Caller (Incrementable cbh){
        cbh.increment();
    }
}


public class Callbacks {

    public static void main(String[] args) {
        Caller caller = new Caller(new Callee2().getCallbackReference());
    }
}
