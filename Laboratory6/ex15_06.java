package Laboratory6;
/*
 6. Напишите программу со статическим методом, которому аргументом передается
целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
массив, который получается из исходного массива (переданного первым аргументом
методу), если в нем взять несколько начальных элементов. Количество элементов, которые
нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
аргумент метода больше длины массива, переданного первым аргументом, то методом
создается копия исходного массива и возвращается ссылка на эту копию.
* */
public class ex15_06 {
    public static void main(String[] args)
    {
        int[] A = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] array = getArr(A, 4);
        for (int j : array) {
            System.out.print(j + " ");

        }System.out.println();

        int[] array1 = getArr(A, 15);
        for (int j : array1) {
            System.out.print(j + " ");

        }System.out.println();


    }
    public static int[] getArr(int[] A, int len){
        if (A.length > len){
            int [] arr = new int[len];
            if (len >= 0) System.arraycopy(A, 0, arr, 0, len);
            return arr;
        } else return A;
    }
}
