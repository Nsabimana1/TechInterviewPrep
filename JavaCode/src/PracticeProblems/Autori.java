package PracticeProblems;

import java.util.Scanner;
public class Autori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] ars = in.nextLine().split("-");
        String result = "";
        for (int i = 0; i < ars.length; i++) {
            result += ars[i].charAt(0);
        }
        System.out.println(result);
    }
}
