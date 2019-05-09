package thinking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 结论：
 * ArrayList.subList方法返回的是原List中的一段，如果subList发生变化，原List也会跟着变化（包括元素顺序）
 *
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/9 22:29
 */
public class SubListShuffledToLargeList {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println("large before: "+ integers);
        List<Integer> subList = integers.subList(3, 6);
        System.out.println("sub before: "+ subList);
        Collections.shuffle(subList);
        System.out.println("sub after: "+ subList);
        System.out.println("large after: "+ integers);
    }
}
/**
 * 输出：
 * large before: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * sub before: [3, 4, 5]
 * sub after: [5, 3, 4]
 * large after: [0, 1, 2, 5, 3, 4, 6, 7, 8, 9]
 */