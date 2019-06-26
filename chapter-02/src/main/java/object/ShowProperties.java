package object;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/6/26 23:27
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
