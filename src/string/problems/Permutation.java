package string.problems;

import java.util.SortedSet;
import java.util.TreeSet;

public class Permutation {



        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */


    public static void main(String[] args) {
        permutation("Brb");
        System.out.println(set);

    }

    public static void permutation(String input) {

        permutation("", input);
    }

    private static SortedSet set = new TreeSet();

    private static void permutation(String perm, String word) {

        if (word.isEmpty()) {
            String setString = perm + word;
            set.add(setString);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }
    }
}
