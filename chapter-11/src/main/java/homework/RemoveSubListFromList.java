package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/13 23:47
 */
public class RemoveSubListFromList {
    public static void main(String[] args) {
        List<String> src = ListFeaturesForString.arrayList(7);
        System.out.println("src: "+ src);
        List<String> sub = src.subList(1, 4);
        System.out.println("sub: "+ sub);

        int index = -1;
        int end = -1;
        for (int i = 0; i < src.size(); i++) {
            String current = src.get(i);
            if(sub.get(0).equals(current)){
                index = i;
                boolean flag = true;
                for (String s : sub) {
                    flag = s.equals(src.get(index));
                    if(!flag){
                        break;
                    }
                    index ++;
                }
                if(!flag){
                    i = index;
                    index = -1;
                }else{

                    break;
                }
            }
        }

        System.out.println("start: " + (index - sub.size()));
        System.out.println("end: " + index);
        List<String> del = new ArrayList<String>();
        del.addAll(src.subList(0, index - sub.size()));
        del.addAll(src.subList(index, src.size()));
        System.out.println("del: "+ del);
    }
}
