/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-12 06:45
 * </pre>
 */
public class Demo911 {

    public static void main(String[] args) {
        Apply.process(new StringAdapter(new StringProcess()),"aadfahdsfvsdfjo");
    }
}

class StringAdapter extends Processor{

    private StringProcess stringProcess;

    @Override
    public String name() {
        return super.name();
    }

    @Override
    Object process(Object input) {
        return stringProcess.process((String) input);
    }

    public StringAdapter(StringProcess stringProcess) {
        this.stringProcess = stringProcess;
    }
}


class StringProcess {

    Object process(String input) {
        return ((String)input).length();
    }

}