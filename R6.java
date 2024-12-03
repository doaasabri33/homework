
package newpackage;


public class R6 {
    public static int sumOddIntegers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i += 2) { // Increment by 2 to skip even numbers
        sum += i;
    }
    return sum;
}
    
}
