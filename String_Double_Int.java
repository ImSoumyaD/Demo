package HackerRank_Practice;

import java.util.Scanner;

public class String_Double_Int {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the newline character left in the buffer
        String s = scan.nextLine();
        System.out.println(s);
        System.out.println(d);
        System.out.println(i);
    }
}
