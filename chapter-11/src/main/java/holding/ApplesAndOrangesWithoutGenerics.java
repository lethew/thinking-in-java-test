package holding;

import java.util.ArrayList;

/**
 * 思考：
 * 该类为线程不安全类
 * counter的自加的非原子性可能导致生成的对象id相同
 * 如需编写可靠的线程安全的功能相同的，可将counter的类型生命为AtomicLong类型
 */
class Apple{
    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}

class Orange{}

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/8 23:23
 */
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).getId();
        }
    }
}
/*
 * 输出：
 * Exception in thread "main" java.lang.ClassCastException: holding.Orange cannot be cast to holding.Apple
 * 	at holding.ApplesAndOrangesWithoutGenerics.main(ApplesAndOrangesWithoutGenerics.java:31)
 */
