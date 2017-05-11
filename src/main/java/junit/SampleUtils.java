package junit;

/**
 * Created by Yevgeniy on 08.04.2017.
 */
public class SampleUtils {

    private static final int HIGHT_BYTE_MASK = 0xf0;
    private static final int LOW_BYTE_MASK = 0x0f;

    private static final char[] HEX_SYMBOLS = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b'
    };

    public static boolean isEmpty(final CharSequence sequence) {
        return  sequence == null || sequence.length() <=0;
    }

    public static String toHexString(final byte[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Must be non-null");
        }
        final StringBuffer builder = new StringBuffer(2 * data.length);
        for (byte item : data) {
            builder.append(HEX_SYMBOLS[(HIGHT_BYTE_MASK & item) >>>4]);
            builder.append(HEX_SYMBOLS[(LOW_BYTE_MASK & item)]);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String result = toHexString(new byte[]{0, 1, 2});
        System.out.println(result);
    }
}
