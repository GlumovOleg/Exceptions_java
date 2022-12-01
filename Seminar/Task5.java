package Seminar;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        Integer[] array = { 1, null, 5, 4, 6, null, 7, null };
        System.out.println("Индексы null позиций в массиве"+ " " + checkArray(array));
    }

    public static ArrayList<Integer> checkArray(Integer[] array) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
