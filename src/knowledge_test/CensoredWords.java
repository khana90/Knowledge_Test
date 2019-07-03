package knowledge_test;


import java.util.regex.Pattern;
/**
 *
 * @author A
 */
public class CensoredWords {  
    public static void main(String args[]) {
    String s = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
    System.out.println(s.replaceAll(censorWords("Meow", "Woof"), "**"));
    // prints I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse
}
    //... means that zero or more String objects (or an array of them) may be passed as the argument(s) for that method.
public static String censorWords(String... words) {
    StringBuilder sb = new StringBuilder();
    for (String w : words) {
        if (sb.length() > 0) sb.append("|");
        sb.append(  //this is implemented in a more complix abstract form 
           String.format("(?<=(?=%s)../{0,%d}).",Pattern.quote(w),   //String.format("(?<=(?=%s)../{0,%d}).",Pattern.quote(w)
              w.length()-1
           )
        );
    }
    return sb.toString();
}     
}
