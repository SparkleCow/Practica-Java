package org.sparklecow.com;

public class Fibonacci {

    /**
     * This method receives an integer and returns an array with the corresponding Fibonacci sequence
     * of the given length.
     *
     * @param num the number of elements in the Fibonacci sequence to generate
     * @return an array containing the Fibonacci sequence of length num
     */
    public static int[] FibonacciPractice(int num){
        if (num <= 0) {
            // If the input is zero or negative, return an empty array
            return new int[0];
        }

        int[] fibonacciArray = new int[num];

        // Always assign the first number
        fibonacciArray[0] = 0;

        // If num is greater than 1, assign the second number and continue with the loop
        if (num > 1) {
            fibonacciArray[1] = 1;
            for (int i = 2; i < num; i++) {
                fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
            }
        }

        return fibonacciArray;
    }
}
