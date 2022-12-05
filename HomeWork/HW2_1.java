package HomeWork;

import java.util.Scanner;

/* 
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class HW2_1 {
    public static void main(String[] args) {
        FloatHolder floatHolder = new FloatHolder();
        String str;

        do {
            System.out.println("Введие дробное число: ery");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
        } while (!tryParseFloat(str, floatHolder));

        System.out.println("Вы ввели число: " + floatHolder.getValue());
    }

    public static boolean tryParseFloat(String str, FloatHolder floatHolder) {
        try {
            floatHolder.setValue(Float.parseFloat(str));
        } catch (RuntimeException e) {
            System.out.println("Вы ввели не дробное число! Повторите ввод.");
            return false;
        }
        return true;
    }

}

// public static void Entering_number(float a) {
// boolean work = true;
// System.out.println("Введите дробное число типа float: ");
// while (work) {
// try (Scanner scan = new Scanner(System.in)) {
// flooput = Float.parseFloat(scan.readLine());
// float i = scan.nextFloat();
// System.out.println("Введено число :" + " " + flooput);
// work = false;
// } catch (NumberFormatException e) {
// throw new RuntimeException(e);
// // System.out.println("Ввели не дробное число! Повторите ввод внимательно!");
// }

// }
// }
