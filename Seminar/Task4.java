package Seminar;

public class Task4 {
    public static void main(String[] args) {

        // int[][] twoDimArr = {{5,7,3,1}, {7,2,6,9}, {4,6,2,8}};
        // int[][] twoDimArr = {{5,7,3}, {7,2,6}, {4,6,2}};
        int[][] twoDimArr = { { 0, 1, 1 }, { 0, 1, 0 }, { 1, 0, 1 } };

        System.out.println(result(twoDimArr));

    }

    public static int result(int[][] twoDimArr) {

        if (twoDimArr.length != twoDimArr[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }

        int result = 0;
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {

                if (twoDimArr[i][j] != 0 && twoDimArr[i][j] != 1) {
                    throw new RuntimeException("В массиве должны быть только 0 и 1");
                }

                if (twoDimArr[i][j] == 0 || twoDimArr[i][j] == 1) {
                    result += twoDimArr[i][j];
                } else {
                    throw new RuntimeException("Wrong value in the array");
                }
            }
        }
        return result;
    }
}
