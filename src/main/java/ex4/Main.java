package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Please provide an integer to be tested: ");
        int userInput = newScan.nextInt();

        for (int i = 1; i <= userInput; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif paf");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else {
                System.out.println(i);
            }
        }
    }
}
