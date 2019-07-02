/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-01 21:47
 * </pre>
 */
public class Fibonacci {

    public static void main(String[] args) {

        for (int i=0 ;i<5;i++){
            System.out.println(Fibonacci.fib(i));
        }



    }
   static int fib(int i){
        if(i<2){
            return 1;
        }else{
            return fib(i-1) + fib(i-2);
        }
    }
}

