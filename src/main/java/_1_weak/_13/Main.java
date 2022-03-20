package _1_weak._13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1 = input.nextLine();
        String num2 = input.nextLine();
        solution(num1, num2);
    }

    private static void solution(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int x1 = Integer.parseInt(String.valueOf(num2.charAt(2)));
        int x2 = Integer.parseInt(String.valueOf(num2.charAt(1)));
        int x3 = Integer.parseInt(String.valueOf(num2.charAt(0)));

        System.out.println(n1 * x1);
        System.out.println(n1 * x2);
        System.out.println(n1 * x3);
        System.out.println(n1 * n2);
    }
}

