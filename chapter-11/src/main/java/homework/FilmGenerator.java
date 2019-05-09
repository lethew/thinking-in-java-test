package homework;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/9 22:52
 */
public class FilmGenerator {
    private static String[] resource = {"Show White", "Star Wars", "Eclipse"};
    private static AtomicInteger offset = new AtomicInteger(0);
    static String next(){
        return resource[offset.getAndAdd(1)%resource.length];
    }

    static Collection<String> fill(Collection<String> collection){
        for (int i = 0; i < 10; i++) {
            collection.add(next());
        }
        return collection;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
    }
}
/**
 * 输出：
 * [Show White, Star Wars, Eclipse, Show White, Star Wars, Eclipse, Show White, Star Wars, Eclipse, Show White]
 * [Star Wars, Eclipse, Show White, Star Wars, Eclipse, Show White, Star Wars, Eclipse, Show White, Star Wars]
 * [Star Wars, Eclipse, Show White]
 * [Show White, Star Wars, Eclipse]
 * [Eclipse, Show White, Star Wars]
 */
