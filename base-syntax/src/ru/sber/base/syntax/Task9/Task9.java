package ru.sber.base.syntax.Task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letBig = (char)('A' + Math.round(Math.random()*26));
        char letSmall = (char)(letBig - 'A' + 'a');
        System.out.println("Угадайте символ");
        char c = in.next().charAt(0);
        while(c != letBig && c != letSmall){
            if(c >= 'A' && c <= 'Z'){
                if (c < letBig) {
                    System.out.println("Ищи букву, которая после нее в алфавите");
                }else{
                    System.out.println("Ищи букву, которая перед ней в алфавите");
                }
            } else if (c >= 'a' && c <= 'z') {
                if (c < letSmall) {
                    System.out.println("Ищи букву, которая после нее в алфавите");
                }else{
                    System.out.println("Ищи букву, которая перед ней в алфавите");
                }
            }else{
                System.out.println("Введен недопустимый символ");
            }
            System.out.println("Угадайте символ");
            c = in.next().charAt(0);
        }
        System.out.println("Верно!");
    }
}
