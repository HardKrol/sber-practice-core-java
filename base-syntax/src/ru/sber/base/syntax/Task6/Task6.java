package ru.sber.base.syntax.Task6;

public class Task6 {
    public static void main(String[] args) {
        int arrSize = 100;
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize; ++i){
            arr[i] = (int) Math.round(Math.random()*1001);
        }
        int X = -1;
        int Z = -1;
        float sum = 0;
        for(int i = 0; i < arrSize; ++i){
            sum += arr[i];
            if(arr[i] > X){
                X = arr[i];
                Z = i;
            }
        }
        for(int i = 0; i < arrSize; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальное значение = " + X + " находится в элементе под индексом " + Z);
        System.out.println("Среднее значение = " + sum / arrSize);
    }
}