package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Please provide radius of the circle: ");
        float userInput = newScan.nextFloat();
        Ex1 newCirc = new Ex1(userInput);
        System.out.println("Circle circumference using pi = 3.14");
        System.out.println(newCirc.calcCirc());
        System.out.println("Circle circumference using Math.PI");
        System.out.println(newCirc.calcCircMath());

    }
}
