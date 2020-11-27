package Laboratory6;
/*
* 8.Напишите программу со статическим методом, аргументом которому передается      *
* целочисленный массив, а результатом возвращается среднее значение для элементов  *
* массива (сумма значений элементов, деленная на количество элементов в массиве).  *
* */
public class ex15_08 {

    public static void main(String[] args){
        int[] n = {5,6,7,8,9};
        int a = getMean(n);
        System.out.println("Mean: " + a);
    }
    public static int getMean(int[] num){
        int sum = 0, mean;
        for(int x: num){
            sum += x;
        }
        mean = sum / num.length;
        return mean;
    }
}
