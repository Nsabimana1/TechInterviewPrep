package PracticeProblems;

import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double costPerSk = in.nextDouble();
        int nLawns = in.nextInt();
        double totalCost = 0.0;

        for (int i = 0; i < nLawns ; i++) {
            double w = in.nextDouble();
            double l = in.nextDouble();
            totalCost += (w * l) * costPerSk;
        }
        System.out.println(totalCost);
    }
}