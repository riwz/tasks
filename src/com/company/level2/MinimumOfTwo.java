package com.company.level2;

public class MinimumOfTwo {

    public static int min(int a, int b, int c) {

        if (a < b & b < c) {
           return a;
        } else if (b < a & b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(-12, 0, 45));
        System.out.println(min(-20, 3, -22));
        System.out.println(min(-10, -20, 44));
    }

}

/*
раскоментировать все и реализовать метод который возвращает меньшее из двух чисел

 */
