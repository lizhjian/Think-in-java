/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-01 22:04
 * </pre>
 */
public class Num {
//    public static void main(String[] args) {
//
//        for(int i = 1000;i<9999;i++){
//            //int i = 1234;
//            int a = i/1000;  //千位
//            int b = (i%1000)/100;  //百位
//            int c = ((i%1000)%100)/10;  //十位
//            int d = ((i%1000)%100)%10;  //十位
//
//
//
//
//            if(i==(a*10+b) *(c*10+d)){
//                System.out.println(i + "="+(a*10+b) +"*"+(c*10+d));
//            }
//            if(i==(a*10+b) *(d*10+c)){
//                System.out.println(i + "="+(a*10+b) +"*"+(c*10+d));
//            }if(i==(b*10+c) *(d*10+a)){
//                System.out.println(i + "="+(a*10+b) +"*"+(c*10+d));
//            }if(i==(b*10+c) *(a*10+d)){
//                System.out.println(i + "="+(a*10+b) +"*"+(c*10+d));
//            }if(i==(c*10+b) *(a*10+d)){
//                System.out.println(i + "="+(a*10+b) +"*"+(c*10+d));
//            }
//            if(i==(b*10+c) *(d*10+a)){
//                System.out.println(i + "="+(b*10+c) +"*"+(d*10+a));
//            }if(i==(c*10+d) *(a*10+b)){
//                System.out.println(i + "="+(c*10+d) +"*"+(a*10+b));
//            }
//
//        }
//
//    }

//    static int a(int i) {
//        return i/1000;
//    }
//    static int b(int i) {
//        return (i%1000)/100;
//    }
//    static int c(int i) {
//        return ((i%1000)%100)/10;
//    }
//    static int d(int i) {
//        return ((i%1000)%100)%10;
//    }
//    static int com(int i, int j) {
//        return (i * 10) + j;
//    }
//    static void productTest (int i, int m, int n) {
//        if(m * n == i) System.out.println(i + " = " + m + " * " + n);
//    }
//    public static void main(String[] args) {
//        for(int i = 1001; i < 9999; i++) {
//            productTest(i, com(a(i), b(i)), com(c(i), d(i)));
//            productTest(i, com(a(i), b(i)), com(d(i), c(i)));
//            productTest(i, com(a(i), c(i)), com(b(i), d(i)));
//            productTest(i, com(a(i), c(i)), com(d(i), b(i)));
//            productTest(i, com(a(i), d(i)), com(b(i), c(i)));
//            productTest(i, com(a(i), d(i)), com(c(i), b(i)));
//            productTest(i, com(b(i), a(i)), com(c(i), d(i)));
//            productTest(i, com(b(i), a(i)), com(d(i), c(i)));
//            productTest(i, com(b(i), c(i)), com(d(i), a(i)));
//            productTest(i, com(b(i), d(i)), com(c(i), a(i)));
//            productTest(i, com(c(i), a(i)), com(d(i), b(i)));
//            productTest(i, com(c(i), b(i)), com(d(i), a(i)));
//            productTest(i, com(d(i), c(i)), com(b(i), a(i)));
//            productTest(i, com(d(i), b(i)), com(a(i), c(i)));
//            productTest(i, com(d(i), a(i)), com(c(i), b(i)));
//            productTest(i, com(d(i), a(i)), com(b(i), c(i)));
//        }
//    }

    static int qian(int i ){
        return i/1000;

    }static int bai(int i ){
        return (i%1000)/100;

    }static int shi(int i ){
        return ((i%1000)%100)/10;

    }
    static int fen(int i ){
        return ((i%1000)%100)%10;
    }

    static int com(int a ,int j){
        return (a*10)+j;
    }

    static void  cal(int i,int m ,int n){
        if(i == m*n){
            System.out.println(i+"="+m +"*"+n);
        }
    }

    public static void main(String[] args) {
        System.out.println("------");
        for (int i=1001;i<9999;i++){
           // System.out.println("111");
            Num.cal(i,com(qian(i),bai(i)),com(shi(i),fen(i)));
            Num.cal(i,com(qian(i),bai(i)),com(fen(i),shi(i)));
            Num.cal(i,com(qian(i),shi(i)),com(fen(i),bai(i)));
            Num.cal(i,com(qian(i),shi(i)),com(bai(i),fen(i)));
            Num.cal(i,com(qian(i),fen(i)),com(bai(i),shi(i)));
            Num.cal(i,com(qian(i),fen(i)),com(shi(i),bai(i)));

            Num.cal(i,com(bai(i),qian(i)),com(shi(i),fen(i)));
            Num.cal(i,com(bai(i),qian(i)),com(fen(i),shi(i)));
            Num.cal(i,com(bai(i),shi(i)),com(qian(i),fen(i)));
            Num.cal(i,com(bai(i),shi(i)),com(fen(i),qian(i)));

        }
    }



}


