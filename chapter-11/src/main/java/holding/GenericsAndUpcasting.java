package holding;

import java.util.ArrayList;

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/8 23:38
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}
/**
 * 输出：
 * holding.GrannySmith@4554617c
 * holding.Gala@74a14482
 * holding.Fuji@1540e19d
 * holding.Braeburn@677327b6
 */

