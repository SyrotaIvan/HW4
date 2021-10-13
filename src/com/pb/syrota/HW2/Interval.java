package com.pb.syrota.HW2;
import java.util.Scanner;
public class Interval {
            public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = 0, b = 14, d = 15, e = 35, f = 36, g = 49, h = 50, j = 100;

            System.out.print("программа проверки интервала" + "\n" + "Введите число: ");


            int  rez = scan.nextInt();

            if (a <= rez && rez <= b) {
                System.out.print("Ваше число " + rez + " находится  в интервале от " + a + " до " + b + "\n");}
             else if (d <= rez && rez <= e) {
                System.out.print("Ваше число " + rez + " находится  в интервале от " + d + " до " + e + "\n");}
             else if (f <= rez && rez <= g) {
                System.out.print("Ваше число " + rez + " находится  в интервале от " + f + " до " + g + "\n");}
            else if (h <= rez && rez <= j) {
                System.out.print("Ваше число " + rez + " находится  в интервале от " + h + " до " + j + "\n");}
             else if (j <= rez) {
                System.out.print("Ваше число " + rez + " не попадает ни в один интервал");}
            else if (a <= -rez && -rez <= j) {
                System.out.print("Ваше число " + rez + " является отрицательным");}

        }
    }

