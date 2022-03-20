package _1_weak._6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextInt(), input.nextInt()));
    }

    private static int solution(int num1, int num2) {
        return num1 - num2;
    }
}
