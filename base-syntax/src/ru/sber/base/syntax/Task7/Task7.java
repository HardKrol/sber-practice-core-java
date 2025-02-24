package ru.sber.base.syntax.Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите а = ");
        double a = in.nextDouble();
        System.out.print("Введите b = ");
        double b = in.nextDouble();
        System.out.print("Введите c = ");
        double c = in.nextDouble();
        double disc = b * b - 4 * a * c;
        if(disc < 0){
            System.out.println("Корней нет");
        }else if(disc > 0){
            double x1 = (-b + Math.sqrt(disc))/(2 * a);
            double x2 = (-b - Math.sqrt(disc))/(2 * a);
            System.out.println("Корни: х1 = " + x1 + " x2 = " + x2);
        }else{
            double x = -b / (2 * a);
            System.out.println("Корень: х = " + x);
        }
    }
}