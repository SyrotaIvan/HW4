package com.pb.syrota.HW4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println("Введите Ваше слово");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String name = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();;
        System.out.println(name);

}
}
