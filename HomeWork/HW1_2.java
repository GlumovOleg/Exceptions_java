package HomeWork;


/* 
1. Пользователь может ввести буквы вместо цифры (NumberFormatException)
2. В массиве может быть менее 5 строк (ArrayIndexOutOfBoundsException)
3. Массив может быть со значением null (NullPointerException)
 */
public class HW1_2 {
    public static void main(String[] args) {

        // Пользователь может ввести буквы вместо цифры (NumberFormatException)
        // String[][] arr = { { "1", "2", "2", "4", "4", "7" },
        //                     { "1", "2", "2", "4", "4", "7" },
        //                     { "2", "па", "7", "3", "1","8" } };

        //В массиве может быть менее 5 строк (ArrayIndexOutOfBoundsException)
        // String[][] arr = { { "1", "2", "2", "4", "4", "7" },
        //                 { "1", "2", "2", "4", "4", "7" },
        //                 { "2", "2", "7", "3" } };

        // Массив может быть пустым (NullPointerException)
        String[][] arr = null;

        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
