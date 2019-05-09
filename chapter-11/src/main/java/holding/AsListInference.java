package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

/**
 * Arrays.asList(T... t)返回结果集中的类型两种获取方式
 * 1. 隐式声明， 通过获取数组元素类型的最近公共父类以确定结果集元素类型
 * 2. 显示声明， 通过在asList前加泛型， 如：Arrays.<Snow>asList(new Light(), new Heavy()); 直接指定类型
 *
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/5/9 22:02
 */
public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        // asList 寻找列表中对象类型最近公共父类
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy(), new Powder(), new Snow());
        // 以下的最近公共父类为Powder
        // List<Snow> snow2 = Arrays.asList(new Light(), new Heavy(), new Powder());
        // List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
