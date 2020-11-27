package Laboratory6;
/*
* 10. Напишите программу со статическим методом, аргументом которому передается    *
* произвольное количество целочисленных аргументов. Результатом метод возвращает   *
* массив из двух элементов: это значения наибольшего и наименьшего значений среди  *
* аргументов, переданных методу.                                                   *
*/
public class ex15_10 {
    public static void main(String[] args){
        int [] ar = minMax(3,6,8,10);
        for(int x: ar){
            System.out.print(x +" ");
        }
        System.out.println();
    }

    public static int[] minMax(int...num){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int [] a = new int[2];
        for(int x: num){
            if (x < min) {
                min = x;
                a[1] = min;
            }
        else if (x > max) {
            max = x;
            a[0] = max;
        }
        }
        return a;
    }
}
