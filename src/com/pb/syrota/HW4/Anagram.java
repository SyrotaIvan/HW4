package com.pb.syrota.HW4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);

            System.out.print("Впишите первую фразу: ");
            String first = scan.nextLine().toUpperCase();


            System.out.print("Впишите второю фразу: ");
            String second = scan.nextLine().toUpperCase();

            String result = checkAnagram(first, second);
            System.out.println(result);
        }

        private static String checkAnagram(String first, String second) {
            if (first == null || second == null || first.equals("") || second.equals("") || !first.matches("[A-Za-z,. ]+")
                    || !second.matches("[A-Za-z,. ]+")) {
                return "Не является анаграммой.";
            }
            String answer;
            String st = first.replaceAll("[,. ]+", "");
            String nd = second.replaceAll("[,. ]+", "");

            if (st.equals("") || nd.equals("")) {
                return "Не является анаграммой.";
            }

            char[] arraySt = st.toCharArray();
            char[] arrayNd = nd.toCharArray();
            Arrays.sort(arraySt);
            Arrays.sort(arrayNd);

            if (Arrays.equals(arraySt, arrayNd)) {
                answer = "Является анаграммой.";
            } else {
                answer = "Не является анаграммой.";
            }
            return answer;
        }
    }
