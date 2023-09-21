package com.hillel.skoryk.homeworks.lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayToListConverter {
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static <T> List<T> inputArrayFromUser(Class<T> elementType) {
        Scanner scanner = new Scanner(System.in);
        List<T> list = new ArrayList<>();

        System.out.println("Введіть елементи масиву (для завершення введіть 'done'):");

        while (true) {
            System.out.print("Елемент: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                T element = elementType.getConstructor(String.class).newInstance(input);
                list.add(element);
            } catch (Exception e) {
                System.err.println("Помилка при додаванні елементу: " + e.getMessage());
            }
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> integerList = inputArrayFromUser(Integer.class);
        System.out.println("Список цілих чисел: " + integerList);

        List<String> stringList = inputArrayFromUser(String.class);
        System.out.println("Список рядків: " + stringList);
    }
}
