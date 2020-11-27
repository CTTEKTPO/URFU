package Laboratory6;

/*4. Напишите программу, в которой описан статический метод для вычисления
двойного факториала числа, переданного аргументом методу. По определению, двойной
факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
Предложите версию метода без рекурсии и с рекурсией.
*/
public class ex15_04 {
    public static void main(String[] args){
        System.out.println(nonRecDualFact(5));
        System.out.println(recDualFact(6));
    }
    public static int nonRecDualFact(int n){
        int result = 1;
        for (int i = n; i > 0; i-= 2){
            result *= i;
        }
        return result;
    }
    public static int recDualFact(int n){
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else return n*recDualFact(n - 2);
    }
}
