package PracticeProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] allPost = in.nextLine().toCharArray();
        ArrayList<Character> moves = new ArrayList<>();
        moves.add('A');
        moves.add('B');
        moves.add('C');
        for (int i = 0; i < allPost.length - 1 ; i+=2) {
            moves = swap(allPost[i], allPost[i+1], moves);
            System.out.println(allPost[i]   + " " + allPost[i+1]);
            System.out.println(moves);
        }
        System.out.println(moves.indexOf('C') + 1);
    }

    public static ArrayList<Character> swap(char st1, char st2, ArrayList<Character> list){
        int temp = list.indexOf(st1);
        list.set(temp, st2);
        list.set(list.indexOf(st2), st1);
        return list;
    }
}
