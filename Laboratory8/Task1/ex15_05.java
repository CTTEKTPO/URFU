package Laboratory8.Task1;
/*
 * Пример 5. Вывести число Фибоначчи, заданное его номером в
 * последовательности.
 * Последовательность Фибоначчи формируется так: нулевой член
 * последовательности равен нулю, первый – единице, а каждый
 * следующий – сумме двух предыдущих.
 */
public class ex15_05 {
    public static int f(int n){
        if (n==0){
            return 0;
        }else
        if (n==1){
            return 1;
        } else {
            return f(n-2)+f(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(10));
    }
}
