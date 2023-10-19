package Priya;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter details:");
        String word = obj.nextLine();
        char[] a = word.toCharArray();
        String cons = "sdfbhhh";

        for (char c : a) {
            if (cons.indexOf(c) != -1) {
                System.out.println(c + " is a consonant.");
            } else {
                System.out.println(c + " is not a consonant.");
            }
        }
    }
}


