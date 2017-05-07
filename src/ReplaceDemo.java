import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式替换字符串方法
 */
public class ReplaceDemo {
 
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);//创建一个匹配模式
        Matcher m = p.matcher(INPUT); // 创建一个Matcher对象
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
        INPUT = m.replaceFirst(REPLACE);
        System.out.println(INPUT);
    }
}