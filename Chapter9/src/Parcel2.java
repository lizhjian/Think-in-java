/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-14 08:14
 * </pre>
 */
public class Parcel2 {
    private class Contents {
        private int i = 11;
        public int value(){
            return i;
        }
    }

    public Contents contents(){
        return new Contents();
    }


    public static void main(String[] args) {

        Parcel2.Contents contents = new Parcel2().contents();

        System.out.println(contents.value());

    }
}

