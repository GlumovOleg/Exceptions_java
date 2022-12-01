package HomeWork;

import java.util.Arrays;

/* 
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, 
которое пользователь может увидеть - RuntimeException, т.е. ваше
 */
public class HW1_4 {
    public static void main(String[] args) {
        int[] firstArr = { 10, 20, 44, 3, 45 };
        int[] secondArr = { 5, 2, 4, 1, 9 };

        dividingArray(firstArr, secondArr);

    }

    public static int[] dividingArray(int[] firstArr, int[] secondArr) {

        if (firstArr.length != secondArr.length){
            throw new RuntimeException("Массивы разной длинны!");
        }
        
        int[] newArr = new int[firstArr.length];
        
        for (int i = 0; i < newArr.length; i++) {
            if (secondArr[i] == 0){
                throw new RuntimeException("Делить на ноль нельзя");
            }
            newArr[i] = firstArr[i] / secondArr[i];
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}

