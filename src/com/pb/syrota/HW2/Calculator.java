package com.pb.syrota.HW2;

import java.util.Scanner;


public class Calculator {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int operand1;
  int operand2;
  String sign;
  int result = 0;
  System.out.print("введите первое число: ");
  operand1 = scan.nextInt();
  System.out.print("введите второе число: ");
  operand2 = scan.nextInt();
  System.out.print("выберите операцию (+, -, *, /): ");
  sign = scan.next();
  switch (sign) {
   case "+":
    result = operand1 + operand2;
    break;
   case "-":
    result = operand1 - operand2;
    break;
   case "*":
    result = operand1 * operand2;
    break;
   case "/": {
    if (operand2 == 0)
     System.out.print("ну кто же делит на ноль? ");
    else
     result = operand1 / operand2;
    break;
   }
  }
   System.out.println("\nпогоди,считаю:\n");
   System.out.println(operand1 + " " + sign + " " + operand2 + " = " + result);

  }
 }
