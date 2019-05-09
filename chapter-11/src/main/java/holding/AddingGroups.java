package holding;

import java.util.*;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/9 21:45
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);

        System.out.println(collection);

        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // ok -- modify an element
        // list.add(21); // add(index, element) unsupported
        System.out.println(list);
    }
}

/**
`* 输出：
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 6, 7, 8, 9, 10]
 * [16, 99, 18, 19, 20]
 */