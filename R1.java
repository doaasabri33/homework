
package newpackage;

import java.util.Scanner;

public class R1 {
    public static void inputAllBaseTypes() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a byte value:");
        byte b = sc.nextByte();
        System.out.println("Byte: " + b);

        System.out.println("Enter a short value:");
        short s = sc.nextShort();
        System.out.println("Short: " + s);

        System.out.println("Enter an int value:");
        int i = sc.nextInt();
        System.out.println("Int: " + i);

        System.out.println("Enter a long value:");
        long l = sc.nextLong();
        System.out.println("Long: " + l);

        System.out.println("Enter a float value:");
        float f = sc.nextFloat();
        System.out.println("Float: " + f);

        System.out.println("Enter a double value:");
        double d = sc.nextDouble();
        System.out.println("Double: " + d);

        System.out.println("Enter a boolean value:");
        boolean bool = sc.nextBoolean();
        System.out.println("Boolean: " + bool);

        System.out.println("Enter a char value:");
        char c = sc.next().charAt(0);
        System.out.println("Char: " + c);
    }

    public static void main(String[] args) {
        inputAllBaseTypes();
    }
}