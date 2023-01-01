package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


    }
    public static void fibonacciMethod(int fib){

        int fibArr [] = new int [fib];
        fibArr[0] = 0;
        fibArr[1] = 1;
        fibArr[2] = 1;

        System.out.print("0");
        System.out.print(", 1");

        int index = 1;
        while ( fibArr[index] <= fib){

            index++;

            fibArr[index] = fibArr[index-1] + fibArr[index-2];

            if (fibArr[index] <= fib){
                System.out.print(", "+ fibArr[index]);
            } else {
                break;
            }
        }
    }
}
