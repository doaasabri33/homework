
package newpackage;


public class R8 {
    public static int countVowels(String s) {
    int count = 0;
    s = s.toLowerCase(); // Convert to lowercase for easier comparison
    for (char c : s.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
        }
    }
    return count;
}
}
