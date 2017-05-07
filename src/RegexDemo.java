import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
 
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. All dogs say meow.";
    private static String REPLACE = "cat";
 
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // 获得匹配器对象
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb, REPLACE);
        }
        System.out.println(sb.toString());
        System.out.println(m.appendTail(sb));
    }
}