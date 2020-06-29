package PracticeProblems;

import java.util.Scanner;

public class TimeLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();
        for (int i = 0; i < limit ; i++) {
            System.out.println( (i + 1)  + " Abracadabra");
        }
    }
}
