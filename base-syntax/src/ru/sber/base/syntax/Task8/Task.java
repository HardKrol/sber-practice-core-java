package ru.sber.base.syntax.Task8;

public class Task {
    public static void main(String[] args) {
        int arrSize = 30;
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize; ++i){
            arr[i] = (int) Math.round(Math.random()*1001);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < arrSize - 2; ++i){
            for(int j = 0; j < arrSize - 1 - i; ++j){
                if(arr[j] > arr[j + 1]){
                    int d = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = d;
                }
            }
        }
        for(int i = 0; i < arrSize; ++i){
            System.out.print(arr[i] + " ");
        }
    }
}