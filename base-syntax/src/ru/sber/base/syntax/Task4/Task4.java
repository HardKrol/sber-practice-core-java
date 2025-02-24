package ru.sber.base.syntax.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isPrime = true;
        if(n <= 1){
            isPrime = false;
        }else{
            for(int i = 2; i * i <= n; ++i){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Да");
        }else{
            System.out.println("Нет");
        }
    }
}
