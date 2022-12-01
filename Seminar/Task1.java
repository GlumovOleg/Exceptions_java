package Seminar;

public class Task1 {

    public static final int MIN_LENGTH = 3;

    public static void main(String[] args) {
        int[] array = {1,2};

        System.out.println(checkArrayLength(array));
    }

    public static int checkArrayLength(int[] array){

        if(array != null){
            if (array.length >= MIN_LENGTH){
                return array.length;
            }
            return -1;
        }
        return -2;
    }
}
