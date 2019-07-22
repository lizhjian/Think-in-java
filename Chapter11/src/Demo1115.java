import java.util.LinkedList;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-22 21:17
 * </pre>
 */
public class Demo1115 {
    public static void main(String[] args) {
        Stack<Character> sc = new Stack<Character>();
        sc.push('U');
        sc.push('n');
        sc.push('c');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('e');
        sc.push('r');
        sc.push('t');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('a');
        sc.push('i');
        sc.push('n');
        sc.push('t');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push(' ');
        System.out.print(sc.pop());
        sc.push('r');
        sc.push('u');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('l');
        sc.push('e');
        sc.push('s');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
    }
}

class Stack<T>{
    private LinkedList<T> storage = new LinkedList<>();
    public void  push(T t){
        storage.addFirst(t);
    }
    public T  pop(){
        return storage.removeFirst();
    }
}