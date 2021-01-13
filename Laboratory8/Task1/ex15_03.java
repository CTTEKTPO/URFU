package Laboratory8.Task1;
/*
 * Пример 1. Для заданного параметра x вывести
 * последовательность значений элементов числового ряда в
 * соответствии со следующими требованиями:
 * – очередной элемент x = 2*x+1 (новое значение вычисляется с
 * использованием старого);
 * – 0 ≤ x < 20.
 *
 * Пример 3. Для вышеописанного задания сделать вывод параметра
 * перед вхождением в рекурсивный вызов и после него.
 */
public class ex15_03 {
    private static int step=0;
    public static void m(int x) {
        space();
        System.out.println(""+x+"-> ");
        step++;
        if ((2*x+1) <20) {
            m(2*x+1);
        }
        step --;
        space();
        System.out.println(""+x+ " <-");
    }
    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        m(1);
    }
}
