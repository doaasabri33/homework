
package newpackage;

public class R9 {
    public static String removePunctuation(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
            sb.append(c);
        }
    }
    return sb.toString();
}
    
}
