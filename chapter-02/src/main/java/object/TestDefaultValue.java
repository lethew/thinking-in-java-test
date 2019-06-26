package object;

/**
 * @author <a href="http://greeks.studio">吴昭</a>
 * @version thinking-in-java-test@2019/6/20 22:55
 */
public class TestDefaultValue {
    public static void main(String[] args) {

        new TestDefaultValue().print2();
    }

    public void print(int x){
        System.out.println(x);
    }

    public void print2(){
        // compile error
        // int xx;
        int xx = 0;
        print(xx);
    }
}
