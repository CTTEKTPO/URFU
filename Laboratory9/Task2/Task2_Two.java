package Laboratory9.Task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task2_Two {
    /*Задание 2
В программе, где требуется из матрицы вывести столбец с номером, заданным с
клавиатуры, могут возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– нет столбца с таким номером.*/
    static Random random = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println("Текущий массив:");
       int [][] Array_one = setArray(a,b);
        for (int[] ints : Array_one) {
            for (int j = 0; j < Array_one.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
       int [] Array = getColumn(Array_one);
        for(int x : Array){
            System.out.println(x);
        }

    }
    public static int [][] setArray(int num_one, int num_two){
        int [][] myArr = new int[num_one][num_two];
        for(int i = 0; i < num_one; i++){
            for(int j = 0; j < num_two; j++){
                myArr[i][j] = random.nextInt(100);
            }
        } return myArr;
    }
    public static int [] getColumn(int [] [] Arr){
        System.out.print("Введите номер столбца для его вывода: ");

        int [] newArr = new int[Arr.length];
        try{
            int num = input.nextInt();
            for (int i = 0; i < newArr.length; i++){
                newArr [i] = Arr[i][num];
            }
        }catch (InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println("Сгенерировано исключение: " + e.toString());
            System.exit(0);
        }
        return newArr;
    }
}
