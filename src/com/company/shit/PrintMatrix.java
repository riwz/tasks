package com.company.shit;

public class PrintMatrix {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
решение из серии "как вариант", но можно его улучшить, чтобы было более красиво,
попробуй сделать без массивов, тем более двумерных и с помощью одного цикла.
+ обрати внимание на текущий warning, как идея предлогает улучшить этот код
*/