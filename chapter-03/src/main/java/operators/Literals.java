package operators;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/6/30 22:10
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1:"+Integer.toBinaryString(i1));
        int i2 = 0X2F;
        System.out.println("i2:"+Integer.toBinaryString(i2));
        int i3 = 0177;
        System.out.println("i3:"+Integer.toBinaryString(i3));
        System.out.println(i3);
        float f = 1e-43f;
        System.out.println(i2);
        System.out.println(~i2);
        System.out.println(i1 & i2);
        System.out.println(i1 | i2);
        System.out.println(i1 ^ i2);
    }
}
