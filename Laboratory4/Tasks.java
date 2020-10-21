package Laboratory4;
import java.util.Random;
import java.util.Scanner;
public class Tasks {
    public static void one() {

        /*Напишите программу, которая выводить в консольное окно
прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
строк;*/
        System.out.println("\t\tTask No.1");
        int figure = 11;
        for (int i = 1; i <= figure; i++) {
            for (int j = -12; j < figure; j++) {
                System.out.print("+ ");
            }System.out.println();
        }
        System.out.print("Высота: 11 " );
        System.out.println("Ширина: 23" );
    }

    public static void two() {

        /*Напишите программу, которая выводит в консольное окно
прямоугольный треугольник;*/
        System.out.println("\t\tTask No.2");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the right triangle: ");
        int h = in.nextInt();
        int i, j;
        for (i = 0 ; i < h; i++){
            for(j = i; j < h; j++){
                System.out.print("+");
            }System.out.println();
        }
    }

    public static void three() {
        /*Напишите программу, в которой создается двумерный массив,
который выводит прямоугольник из цифр 2;*/

        System.out.println("\t\tTask No.3");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int n = in.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int n1 = in.nextInt();
        int[][] A = new int[n1][n];


        for (int i = 0 ; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                System.out.print((A[i][j] = 2)+ " ");
            }System.out.println("\t");}
            System.out.println();
    }
    public static void four() {

        /*Напишите программу, в которой создается двумерный массив,
который выводит прямоугольный треугольник*/
        System.out.println("\t\tTask No.4");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the right triangle: ");
        int n = in.nextInt();
        char[][] A = new char[n][n];


        for (int i = 0 ; i < A.length; i++){
            for(int j = i; j < A[i].length; j++){
                System.out.print((A[i][j] = '+')+ " ");
            }System.out.println();}
        System.out.println();
    }
    public static void five() {

        /*Напишите программу, в которой создается двумерный
целочисленный массив. Он заполняется случайными числами. Затем в этом
массиве строи и столбцы меняются местами: первая строка становится первым
столбцом, вторая строка становиться вторым столбцом и так далее. Например,
если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем
массив из 5 строк и 3 столбцов.*/

        System.out.println("\t\tTask No.5");
        Scanner id = new Scanner(System.in);
        System.out.print("Enter the number of lines in the array: ");
        int SizeLine = id.nextInt();
        System.out.print("Enter the number of columns in the array: ");
        int SizeColumns = id.nextInt();
        int[][] nums = new int[SizeLine][SizeColumns];
        Random random = new Random();

        System.out.println("Source array: ");
        for (int i = 0 ; i < SizeLine ; i++ ){
            for (int j = 0 ; j < SizeColumns ; j++ ){
            nums[i][j] = random.nextInt(100);
            System.out.print(nums[i][j]+" ");
        }System.out.println();}

        System.out.println("Transpose an array");
        int [][] numsTwo = new int[SizeColumns][SizeLine];
        for (int i = 0; i < SizeLine; i++) {
            for (int j = 0; j < SizeColumns; j++) {
                numsTwo[j][i] = nums[i][j];

            }
        }
        System.out.println("The resulting array: ");
        for (int i = 0 ; i < SizeColumns ; i++ ){
            for (int j = 0 ; j < SizeLine ; j++ ){
                System.out.print(numsTwo[i][j]+" ");
            }System.out.println();}

    }
    public static void six() {

        /*Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.*/

        System.out.println("\t\tTask No.5");
        Scanner id = new Scanner(System.in);
        System.out.print("Enter the number of lines in the array: ");
        int SizeLine = id.nextInt();
        System.out.print("Enter the number of columns in the array: ");
        int SizeColumns = id.nextInt();
        int[][] nums = new int[SizeLine][SizeColumns];
        Random random = new Random();

        System.out.println("Source array: ");
        for (int i = 0 ; i < nums.length ; i++ ){
            for (int j = 0 ; j < nums[i].length ; j++ ){
                nums[i][j] = random.nextInt(100);
                System.out.print(nums[i][j]+" ");
            }System.out.println();}

        int delLine = random.nextInt(SizeLine-1);
        int delColumns = random.nextInt(SizeColumns-1);

        System.out.println("Deleted line: " + (delLine + 1) + "\n" +"Deleted columns: " + (delColumns + 1));
        int [][] numsTwo = new int[SizeLine][SizeColumns];

        for (int i = 0; i < numsTwo.length;i++) {
            if (delLine != i){
                for (int j = 0; j < numsTwo[i].length; j++) {
                    if (delColumns != j){
                        numsTwo[i][j] = nums[i][j];
                        System.out.print(numsTwo[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void seven() {

        /*Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее*/

        System.out.println("\t\tTask No.7");
        int Line = 4;
        int Columns = 4;
        int[][] nums = new int[Line][Columns];
        Random random = new Random();

        //----------------------------------
        for (int i = 0; i < Columns; i++){
            nums[0][i] = random.nextInt(100);
        }
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }System.out.print("----------");
        System.out.println();
        for (int i = Line-1; i > 0; i--){
                int j = Columns - 1;
                nums [i][j] = random.nextInt(100);

        }
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }System.out.print("----------");
        System.out.println();
        //--------------------------------

        for (int i = 0; i < Columns-1; i++){
            nums[1][i] = random.nextInt(100);
        }
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }System.out.println();
        }System.out.print("----------");
        System.out.println();

        for (int i = Line-1; i > 1; i--){
            int j = Columns - 1;
            nums [i][j] = random.nextInt(100);

        }
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }System.out.print("----------");
        System.out.println();
        //-----------------------------------

        for (int i = 0; i < Columns-2; i++){
            nums[2][i] = random.nextInt(100);
        }
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }System.out.print("----------");
        System.out.println();
        //--------------------------------
        nums [3][1] = random.nextInt(100);

        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }System.out.print("----------");
         System.out.println();
        //-------------------------------


            nums[3][0] = random.nextInt(100);
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }





    }


    }

