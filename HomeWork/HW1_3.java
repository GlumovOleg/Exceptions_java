package HomeWork;

import java.util.Arrays;

/*Реализуйте метод,принимающий в качестве аргументов два целочисленных массива,и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. 
*/

public class HW1_3 {
    public static void main(String[] args) {
        int[] firstArr = { 4, 5, 7, 3, 6 };
        int[] secondArr = { 1, 2, 4, 1, 5 };

        differenceArray(firstArr, secondArr);

    }

    public static int[] differenceArray(int[] firstArr, int[] secondArr) {

        if (firstArr.length != secondArr.length)
            throw new RuntimeException("Массивы разной длинны!");

        int[] resultArr = new int[firstArr.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArr[i] - secondArr[i];
        }
        System.out.println(Arrays.toString(resultArr));
        return resultArr;
    }
}
