package Laboratory6;

/*
5. Напишите программу со статическим методом, которым вычисляется сумма
квадратов натуральных чисел 1^2 + 2^2 + 3^2 + ... + n^2.
Число n передается аргументом методу.
Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно
использовать формулу 1^2 + 2^2 +3^2+…+n^2
=(n+1) (2n + 1)/6
*/
public class ex15_05 {
    public static void main(String[] args){
        System.out.println(sumSqr(3));
        System.out.println(recSumSqr(5));
        System.out.println(check(3));
        System.out.println(check(5));

    }
    public static int sumSqr(int num){
        int res = 0;
        for (int i = 1; i <= num; i++){
            res += i*i;
        }
        return res;
    }
    public static int recSumSqr(int num){
        if (num == 1)return 1;
        else return num*num+recSumSqr(num - 1);
    }
    public static int check(int n)
    {
        return n*(n + 1)*(2*n + 1) / 6;
    }
}
