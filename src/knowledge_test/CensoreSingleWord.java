package knowledge_test;
import java.util.regex.Pattern;

/**
 *
 * @author A
 */
public class CensoreSingleWord {
    
   public static void main(String... args) {
    String s = "\"Anna went to vote in the election to fulfil her civic duty\"";
    System.out.println(s.replaceAll(censorWords( "civic", "Anna"), "%%"));
    // prints "lorem ***** dolor *** blah *** bleh"
}
public static String censorWords(String... words) {
    StringBuilder sb = new StringBuilder();
    for (String w : words) {
        if (sb.length() > 0) sb.append("|");
        sb.append(
           String.format("(?<=(?=%s)../{0,%d}).",
              Pattern.quote(w),
              w.length()-1
           )
        );
    }
    return sb.toString();
}
}
    

    

