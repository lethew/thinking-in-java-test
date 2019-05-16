package homework;

import java.util.*;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/13 23:47
 */
public class ListFeaturesForInteger {
    private static Random random = new Random(47);
    private static int max = 10;

    private static List<Integer> arrayList(int size){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(max));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> integers = arrayList(7);
        System.out.println("1: "+ integers);

        Integer eight = 8;
        integers.add(eight);
        System.out.println("2: "+ integers);
        System.out.println("3: "+ integers.contains(eight));
        integers.remove(eight);

        Integer second = integers.get(2);
        System.out.println("4: "+ second + " "+ integers.indexOf(second));

        Integer nine = 9;
        System.out.println("5: "+ integers.indexOf(nine)); // Integer等于条件是intValue
        System.out.println("6: "+ integers.remove(nine));
        System.out.println("7: "+ integers.remove(second));

        System.out.println("8: "+ integers); // remove方法移除首次遇到的该元素
        integers.add(3, 3);
        System.out.println("9: "+ integers);

        List<Integer> sub = integers.subList(1, 4);
        System.out.println("subList: "+ sub);
        System.out.println("10: "+integers.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: "+ sub);
        System.out.println("11: "+ integers.containsAll(sub));
        Collections.shuffle(sub, random);
        System.out.println("12: "+ integers.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: "+ copy); // 交集允许重复元素出现
        copy = new ArrayList<Integer>(integers);
        copy.remove(2);
        System.out.println("14: "+ copy);
        copy.removeAll(sub);
        System.out.println("15: "+ copy); // removeAll将移除所有数据，包括重复的数据
        copy.set(1, 5);
        System.out.println("16: "+ copy);
        copy.addAll(2, sub);
        System.out.println("17: "+ copy);
        System.out.println("18: "+integers.isEmpty());
        integers.clear();
        System.out.println("19： "+ integers);
        System.out.println("20： "+ integers.isEmpty());
        integers.addAll(arrayList(4));
        System.out.println("21: "+ integers);
        Object[] o = integers.toArray();
        System.out.println("22: "+ o[3]);
        Integer[] ia = integers.toArray(new Integer[0]);
        System.out.println("23: "+ia[3].toString());
    }
}
