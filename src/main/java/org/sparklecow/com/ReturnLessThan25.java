package org.sparklecow.com;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnLessThan25 {

    private final static Scanner scanner = new Scanner(System.in);

    public static int[] numbersLessThan25(){
        int[] numbers = new int[20];
        for(int i=0; i<20; i++){
            System.out.println("Por favor introduce un número");
            numbers[i] = scanner.nextInt();
        }
        return Arrays.stream(numbers).filter(x -> x<25).toArray();
    }
}
