package com.hillel.skoryk.homeworks.lesson7;

import java.util.Scanner;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        try {
            int[][] array = readArrayFromUser();
            int result = doCalc(array);
            System.out.println("Результат розрахунку: " + result);
        } catch (ArraySizeException e) {
            System.err.println("Помилка: розмір масиву не відповідає 4x4.");
        } catch (ArrayDataException e) {
            System.err.println("Помилка: неправильні дані в комірці масиву: " + e.getMessage());
        }
    }

    public static int[][] readArrayFromUser() throws ArraySizeException, ArrayDataException {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][4];
        System.out.println("Введіть масив 4x4:");
        for (int i = 0; i < 4; i++) {
            String[] rowValues = scanner.nextLine().split(" ");
            if (rowValues.length != 4) {
                throw new ArraySizeException("Рядок " + (i + 1) + " має неправильну кількість значень.");
            }
            for (int j = 0; j < 4; j++) {
                try {
                    array[i][j] = parseInt(rowValues[j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Рядок " + (i + 1) + ", стовпець " + (j + 1));
                }
            }
        }
        if (scanner.hasNextLine()) {
            throw new ArraySizeException("Масив повинен бути 4x4");
        }
        return array;
    }


    public static int doCalc(int[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Масив повинен бути 4x4");
        }
        int result = 0;
        for (int[] row : array) {
            for (int value : row) {
                result += value;
            }
        }
        return result;
    }

    public static int parseInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
}

class ArraySizeException extends Exception {
    public ArraySizeException(String message) {
        super(message);
    }
}

class ArrayDataException extends Exception {
    public ArrayDataException(String message) {
        super(message);
    }
}

