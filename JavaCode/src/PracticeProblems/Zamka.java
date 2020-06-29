package PracticeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int d = in.nextInt();
        int x = in.nextInt();
        ArrayList<Integer> allNums = new ArrayList<>();
        for (int i = l; i <= d; i++) {
            if (getSumOfDigit(i) == x) allNums.add(i);
        }
        Collections.sort(allNums);
        System.out.println(allNums.get(0));
        System.out.println(allNums.get(allNums.size() - 1));
    }

    public static int getSumOfDigit(int num){
        int total = 0;
        int tempN = num;
        while (tempN > 0){
            int sDig = tempN % 10;
            total += sDig;
            tempN = tempN / 10;
        }
        return total;
    }
}
