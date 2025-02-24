package ru.sber.base.syntax.Task5;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = in.nextInt();
        if (n > 1 && n < 101){
            int a = 0, b = 1, c;
            for(int i = 1; i <= n; ++i){
                c = a;
                a += b;
                b = c;
                System.out.print(a + " ");
            }
        }else{
            System.out.println("Введено недопустимое число: " + n + ". Допустимый диапазон значений: 2 - 100");
        }
    }
}
