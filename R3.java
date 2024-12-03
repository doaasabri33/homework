
package newpackage;


public class R3 {

public static boolean isMultiple(long n, long m) {
    return n % m == 0;
}
    public static void main(String[] args) {
        // Test cases
        System.out.println(isMultiple(20, 5));
        System.out.println(isMultiple(21, 4)); 
        System.out.println(isMultiple(0, 3));  
  
    }
}
    

