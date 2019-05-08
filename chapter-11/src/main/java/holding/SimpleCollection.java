package holding;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/8 23:49
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        for (Integer integer : integers) {
            System.out.print(integer+", ");
        }
    }
}
/**
 * 输出：
 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
 */
