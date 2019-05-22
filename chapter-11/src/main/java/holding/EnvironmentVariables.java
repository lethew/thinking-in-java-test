package holding;

import java.util.Map;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/21 22:28
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
