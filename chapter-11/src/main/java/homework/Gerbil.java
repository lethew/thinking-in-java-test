package homework;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/8 23:41
 */
public class Gerbil {
    // thread-unsafe
//    private static int counter;
//    private final int gerbilNumber = counter++;

    // thread-safe
    private static AtomicInteger counter = new AtomicInteger();
    private final int gerbilNumber = counter.getAndAdd(1);

    public void hop(){
        System.out.println("No."+gerbilNumber+" hopping......");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil());
        }

        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }
}
/**
 * 输出：
 * No.0 hopping......
 * No.1 hopping......
 * No.2 hopping......
 * No.3 hopping......
 * No.4 hopping......
 * No.5 hopping......
 * No.6 hopping......
 * No.7 hopping......
 * No.8 hopping......
 * No.9 hopping......
 */
