package _1_weak._9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(plus(num1, num2));
        System.out.println(minus(num1, num2));
        System.out.println(multiply(num1, num2));
        System.out.println(division(num1, num2));
        System.out.println(solution(num1, num2));
    }

    private static int plus(int num1, int num2) {
        return num1 + num2;
    }
    private static int minus(int num1, int num2) {
        return num1 - num2;
    }
    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    private static int division(int num1, int num2) {
        return num1 / num2;
    }
    private static int solution(int num1, int num2) {
        return num1 % num2;
    }
}
