package com.pb.syrota.HW3;
import java.util.Random;
import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(101),y,attempt = 0;
        System.out.println("Угадайте задуманное число от одного до ста");
        System.out.println("если не хотите играть- введите число более ста");
      do{
        y = scan.nextInt();
        attempt++;
            if (y< x ) {
                System.out.println("Ваше число меньше загаданного");
                continue;}
            if (y> x ) {
                System.out.println("Ваше число ,больше загаданного");
                continue;
            }

            if (x!= y) {
                continue;
            }


            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }
      while (y < 101);
        System.out.println("Конец игры!");
    }

}
