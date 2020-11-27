package Laboratory6;

/*3. Напишите программу с классом, в котором есть статические методы, которым
можно передавать произвольное количество целочисленных аргументов (или
целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
значение из набора чисел.*/

public class ex15_03 {

    public static void main(String[] args){
        min(5,12,1);
        max(2,6,20);
        average(1,2,3,4,5);
        int [] a ={5,8,9,0};
        min(a);
        max(a);
        average(a);
    }
    private static void min(int...nums){
        int min = Integer.MAX_VALUE;

        for (int x : nums) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Min: " + min);
    }
    private static void max(int...nums){
        int max = Integer.MIN_VALUE;

        for (int x : nums) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Max: " + max);
    }
    private static void average(int...nums){
        int sum = 0;

        for (int x : nums) {
                sum += x;
        }
        int average = sum / nums.length;
        System.out.println("Average: " + average );
    }
}
