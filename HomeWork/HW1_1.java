package HomeWork;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class HW1_1 {
    public static void main(String[] args) {

        divAB(4, 0); //1

        method1(); //2

        int array[] = { 1, 5, 7 }; //3
        notFoundIndex(array);
        
    }

    // #region Деление на ноль

    public static int divAB(int a, int b) {
        return a / b;

    }
    // #endregion

    // #region Переполнение стека (рекурсия)

    public static void method1() {
        method4();
    }

    public static void method2() {
        method1();
    }

    public static void method3() {
        method2();
    }

    public static void method4() {
        method3();
    }
    // #endregion

    // #region Обращение к несществующему индексу в массиве

    public static void notFoundIndex(int[] array) {
        System.out.println(array[5]);
    }

    // #endregion
}
