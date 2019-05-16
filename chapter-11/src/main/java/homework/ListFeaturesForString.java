package homework;

import java.util.*;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/13 23:47
 */
public class ListFeaturesForString {
    private static Random random = new Random(47);
    private static String[] source = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    static List<String> arrayList(int size){
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            result.add(new String(source[random.nextInt(source.length)]));
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> strings = arrayList(7);
        System.out.println("1: "+ strings);

        String eight = new String(source[8]);
        strings.add(eight);
        System.out.println("2: "+ strings);
        System.out.println("3: "+ strings.contains(eight));
        strings.remove(eight);

        String second = strings.get(2);
        System.out.println("4: "+ second + " "+ strings.indexOf(second));

        String nine = new String(source[9]);
        System.out.println("5: "+ strings.indexOf(nine)); // Integer等于条件是intValue
        System.out.println("6: "+ strings.remove(nine));
        System.out.println("7: "+ strings.remove(second));

        System.out.println("8: "+ strings); // remove方法移除首次遇到的该元素
        strings.add(3, new String(source[3]));
        System.out.println("9: "+ strings);

        List<String> sub = strings.subList(1, 4);
        System.out.println("subList: "+ sub);
        System.out.println("10: "+strings.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: "+ sub);
        System.out.println("11: "+ strings.containsAll(sub));
        Collections.shuffle(sub, random);
        System.out.println("12: "+ strings.containsAll(sub));
        List<String> copy = new ArrayList<String>(strings);
        sub = Arrays.asList(strings.get(1), strings.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: "+ copy); // 交集允许重复元素出现
        copy = new ArrayList<String>(strings);
        copy.remove(2);
        System.out.println("14: "+ copy);
        copy.removeAll(sub);
        System.out.println("15: "+ copy); // removeAll将移除所有数据，包括重复的数据
        copy.set(1, new String(source[5]));
        System.out.println("16: "+ copy);
        copy.addAll(2, sub);
        System.out.println("17: "+ copy);
        System.out.println("18: "+strings.isEmpty());
        strings.clear();
        System.out.println("19： "+ strings);
        System.out.println("20： "+ strings.isEmpty());
        strings.addAll(arrayList(4));
        System.out.println("21: "+ strings);
        Object[] o = strings.toArray();
        System.out.println("22: "+ o[3]);
        String[] ia = strings.toArray(new String[0]);
        System.out.println("23: "+ia[3].toString());
    }
}
