package ru.sber.base.syntax.Task3;

public class Task3 {
    public static void main(String[] args) {
        int n = 6;
        int m = 19;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                System.out.print((i + j) % 2 == 0 ? '*' : ' ');
            }
            System.out.println();
        }
    }
}
