package _1_weak._12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println(getOne(num1, num2, num3));
        System.out.println(getTwo(num1, num2, num3));
        System.out.println(getThree(num1, num2, num3));
        System.out.println(getFour(num1, num2, num3));
    }

    private static int getFour(int num1, int num2, int num3) {
        return ((num1 % num3) * (num2 % num3)) % num3;
    }

    private static int getThree(int num1, int num2, int num3) {
        return (num1 * num2) % num3;
    }

    private static int getTwo(int num1, int num2, int num3) {
        return ((num1 % num3) + (num2 % num3)) % num3;
    }

    private static int getOne(int num1, int num2, int num3) {
        return (num1 + num2) % num3;
    }

}
