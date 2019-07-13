/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-14 07:04
 * </pre>
 */
interface Service{
    void method1();
    void method2();
}


interface ServiceFactory{
    Service getService();
}

class Implemention1 implements Service{
    @Override
    public void method1() {
        System.out.println("Implemention1....method1");
    }

    @Override
    public void method2() {
        System.out.println("Implemention1...method2");

    }
}
class Implemention2 implements Service{
    @Override
    public void method1() {
        System.out.println("Implemention2....method1");
    }

    @Override
    public void method2() {
        System.out.println("Implemention2...method2");

    }
}

class ImplementionFaction2 implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implemention2();
    }
}



public class Factories {

    public static void serviceConsumer(ServiceFactory factory){
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {

        serviceConsumer(new ImplementionFaction2());

    }
}
