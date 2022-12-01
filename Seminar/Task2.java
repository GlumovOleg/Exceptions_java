package Seminar;

public class Task2 {

    public static final int MIN = 3;

    public static void main(String[] args) {
        
        int arr[] = {1,5,4,7,3,5};
        // int arr[] = null;

        System.out.println(findElement(arr, 8));

    }

    public static int findElement(int[] arr, int num) {
        if (arr == null){
            return -3;
        }
        if (arr.length > MIN) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return i;
                }
            }
            return -2;
        }
        return -1;

    }
}
