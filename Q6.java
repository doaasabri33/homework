
package newpackage;


import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int[] numbers = inputArray(5);
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
