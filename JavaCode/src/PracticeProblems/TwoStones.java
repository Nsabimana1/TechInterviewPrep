package PracticeProblems;

import java.util.Scanner;
public class TwoStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.nextInt() % 2 != 0) System.out.println("Alice"); else System.out.println("Bob");
    }
}
