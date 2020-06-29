package PracticeProblems;

import java.util.Scanner;

public class ColdPuter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (in.nextInt() < 0) count ++;
        }
        System.out.println(count);
    }
}
