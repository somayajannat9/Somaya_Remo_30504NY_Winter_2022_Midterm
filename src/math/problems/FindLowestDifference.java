package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        FindLowestDifference obj = new FindLowestDifference();
        int n = obj.lowestNum(array1, array2);
        System.out.println(n);


    }
    public int lowestNum (int[] array1, int[] array2){
        return Arrays.compare(array1,array2);
    }

}
