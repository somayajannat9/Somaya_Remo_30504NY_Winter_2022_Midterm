package string.problems;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {



    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

          //  String str1 = "Heart";
            String str2 = "Earth";

            // Set both strings to lower case because their letters will switch.
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // check if the length of 2 words are the same
            if(str1.length() == str2.length()) {

                // convert strings to char array
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();

                // sort the char array
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                // if sorted char arrays are same
                // then the string is anagram
                boolean result = Arrays.equals(charArray1, charArray2);

                if(result) {
                    System.out.println(str1 + " and " + str2 + " are anagram.");
                }
                else {
                    System.out.println(str1 + " and " + str2 + " are not anagram.");
                }
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
    }











