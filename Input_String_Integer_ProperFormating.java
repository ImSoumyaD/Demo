package HackerRank_Practice;

import java.util.Scanner;

public class Input_String_Integer_ProperFormating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            int num = scanner.nextInt();
            // Format the output
            System.out.printf("%-15s%03d\n", str, num);
        }
    }
}
