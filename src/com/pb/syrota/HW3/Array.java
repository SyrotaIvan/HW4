package com.pb.syrota.HW3;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum;
    int[] array = new int[10];
        System.out.print("заполните массив десятью числами: ");
        array[0] = scan.nextInt();
        array[1] = scan.nextInt();
        array[2] = scan.nextInt();
        array[3] = scan.nextInt();
        array[4] = scan.nextInt();
        array[5] = scan.nextInt();
        array[6] = scan.nextInt();
        array[7] = scan.nextInt();
        array[8] = scan.nextInt();
        array[9] = scan.nextInt();
        System.out.println("Ваш массив "+Arrays.toString(array));
        sum=(array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9]);
        System.out.println("сумма элементов массива " + sum);
        int count = 0;
        for (int i : array) {
            if (i > 0) {
                count++;
            }
        }
        System.out.println("В массиве "+ count + " положительных элементов");
        for(int c = array.length-1; c>0; c--) {
            for(int a=0; a<c; a++) {
                if( array[c] < array[a] ){
                    int zz = array[c];
                    array[c] = array[a];
                    array[a] = zz;
                }
            }
        }
        System.out.println("отсортированный массив " + Arrays.toString(array));
}
}