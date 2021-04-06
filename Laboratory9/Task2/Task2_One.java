package Laboratory9.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_One {
    static Scanner scanner = new Scanner(System.in);
    /*Задание 1
В программе, вычисляющей среднее значение среди положительных элементов
одномерного массива (тип элементов int), вводимого с клавиатуры, могут
возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– несоответствие числового типа данных;
– положительные элементы отсутствуют.
*/
    public static void main(String[] args) {
        int [] massive = setArray(5);
        averageVal(massive);
    }

    public static void averageVal(int [] arr){
        if (arr == null){
            return;
        }
        int sum = 0, i = 0;
        for (int j : arr) {
            if (j > 0) {
                sum += j;
                i++;
            }
        }
        if (sum <= 0) {
            throw new NullPointerException("положительные элементы отсутствуют");
        } else System.out.println("Среднее значение элементов в массиве: " + sum / i);
    }
    public static int[] setArray(int num){

            int[] A = new int[num];
            System.out.println("Массив состоиз из " + num + " элемента(ов), далее заполните его:");
        int b = 0;
        while(true) {
            try {
                int i = b;
                for (; i < A.length; i++) {
                    b = i;
                    System.out.print("A[" + i + "] = ");
                    A[i] = scanner.nextInt();

                }
                scanner.close();
                return A;
            } catch (InputMismatchException e) {
                System.out.println("Сгенерировано исключение: " + e.toString());
                scanner.next();
                A[b] = 0;
            }
        }

    }
}
