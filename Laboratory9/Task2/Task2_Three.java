package Laboratory9.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;
/*Задание 3
В программе, вычисляющей сумму элементов типа byte одномерного массива,
вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– ввод или вычисление значения за границами диапазона типа.*/

public class Task2_Three {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Сумма чисел массива типа Byte: " + getSum(setArray()) );
    }

    public static byte[] setArray() {
        System.out.print("Введите размер массива: ");
        int num = scanner.nextInt();
        byte[] Array = new byte[num];
        try {
            for (int i = 0; i < Array.length; i++) {
                Array[i] = scanner.nextByte();
            }

        } catch (InputMismatchException e) {
            System.out.println("Сгенерировано исключение: " + e.toString());
        }
        return Array;
    }
    public static byte getSum(byte [] arr){
        byte sum = 0;
        for (byte b : arr) {
            sum += b;
        }
        return sum;
    }
}

