package ru.sber.base.syntax.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = in.nextInt();
        if (n > 0 && n < 501){
            for(int i = 1; i <= n; ++i){
                System.out.print(7 * i + " ");
            }
        }else{
            System.out.println("Введено недопустимое число: " + n + ". Допустимый диапазон значений: 1 - 500");
        }
    }
}