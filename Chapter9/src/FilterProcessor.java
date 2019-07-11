

/**
 * <pre>
 * desc ：适配器持有filter的子类,调用适配器.process()的方法等于调用子类的.process()方法
 * author ：lizj
 * date ：2019-07-11 23:33
 * </pre>
 */

class FilterAdapter extends Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name(){
        return filter.name();
    }

    @Override
    Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}


public class FilterProcessor {

    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Apply.process(new FilterAdapter(new HighPass(1.0)),waveform);
        Apply.process(new FilterAdapter(new LowPass(2.0)),waveform);
    }

}


class Waveform{
    private static long counter;

    private final long id = counter;

    public String toString(){
        return "Waveform "+id;
    }
}

class Filter{
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}


class LowPass extends Filter{
    double cutoff;

    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}


class HighPass extends Filter{
    double cutoff;

    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}