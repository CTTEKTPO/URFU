package Laboratory6;

/*2. Напишите программу с классом, в котором есть закрытое статическое
целочисленное ноле с начальным нулевым значением. В классе должен быть описан
статический метод, при вызове которого отображается текущее значение статического
поля, после чего значение поля увеличивается на единицу.
*/
public class ex15_02 {
    public static void main(String[] args) {
        Example2.printVal();
        Example2.printVal();
        Example2.printVal();
    }
}
class Example2{
    private static int num = 0;

    static void printVal(){
        System.out.println(num);
        num ++;
    }
}
