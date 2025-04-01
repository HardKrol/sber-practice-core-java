package ru.sber.base.syntax.Task2a;

import java.util.Scanner;

public class RomanConverter {
    public String convertToRoman(int number) {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("Введите число от 1 до 100");
        }

//        String[] thousands = { "", "M", "MM", "MMM" };
//        String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] hundreds = { "", "C" };
        String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] units = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        StringBuilder roman = new StringBuilder();
//        roman.append(thousands[number / 1000]);
//        roman.append(hundreds[(number % 1000) / 100]);
        roman.append(hundreds[number / 100]);
        roman.append(tens[(number % 100) / 10]);
        roman.append(units[number % 10]);

        return roman.toString();
    }

    public static void main(String[] args) {
        RomanConverter converter = new RomanConverter();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String romanNumeral = converter.convertToRoman(number);
        System.out.println("Число " + number + " в римской записи: " + romanNumeral);
    }
}