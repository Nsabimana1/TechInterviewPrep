package PracticeProblems;

import java.util.Scanner;
import java.util.*;
public class Pot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long total = 0;
        for (int i = 0; i < n; i++) {
            int tempVal = in.nextInt();
            int num = tempVal / 10;
            int exp = tempVal % 10;
            total += Math.pow(num, exp);
        }

        System.out.println(total);
    }
}
