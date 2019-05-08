package holding;

import java.util.ArrayList;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/8 23:33
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).getId());
        }

        for (Apple apple : apples) {
            System.out.println(apple.getId());
        }
    }
}
/**
 *输出：
 * 0
 * 1
 * 2
 * 0
 * 1
 * 2
 */