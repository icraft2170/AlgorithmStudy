package _1_weak._8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextInt(), input.nextInt()));
    }

    private static double solution(int num1, int num2) {
        return (double)num1 / num2;
    }
}
