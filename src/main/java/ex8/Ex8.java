package ex8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex8 {
    private float num1;
    private float num2;
    private String operation;
    private Map<String, Integer> operMap;

    public Ex8() {
        System.out.println("This is a simple calculator working on floats");
        this.operMap = new HashMap<>();
        initOperators();
        getInput();
    }

    /*
    * For the getInput method there are two things to remember:
    * 1. After using nextFloat method with Scanner object the new line
    * needs to be consumed. Hence there is an additional line scan1.nextLine().
    * 2. When user types in a float number with decimal symbol (.) there is an
    * error InputMismatchException. The reason for this is that it depends
    * what type of keyboard language is used on the OS. In this case it accepts
    * (,) but throws an exception when using (.). This can be resolved using
    * exception catch.
    *
    * */

    public void getInput() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please provide first number: ");
        num1 = scan1.nextFloat();
        scan1.nextLine();
        System.out.println("Please provide operator: ");
        operation = scan1.nextLine();
        System.out.println("Please provide second number: ");
        num2 = scan1.nextFloat();
    }

    public void initOperators() {
        this.operMap.put("+", 1);
        this.operMap.put("-", 2);
        this.operMap.put("*", 3);
        this.operMap.put("/", 4);
    }

    public float calculate() {
        int oper = operMap.get(operation);
        System.out.print("The result is: ");
        switch (oper) {
            case 1:
                return this.num1 + this.num2;
//            break;
            case 2:
                return this.num1 - this.num2;
//            break;
            case 3:
                return this.num1 * this.num2;
//            break;
            case 4:
                return this.num1 / this.num2;
//            break;
            default:
                System.out.println("Improper operator");
                return 0;
//            break;


        }
    }
}
