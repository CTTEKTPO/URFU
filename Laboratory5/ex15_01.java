package Laboratory5;


class Example1 {
    // Создание закрытой переменной ch1
    private char ch1;

    //Один из методов позволяет присвоить значение полю.
    public void Set(char ch) {
        ch1 = ch;
    }

    //Еще один метод при вызове возвращает результатом код символа.
    public int getCodeSymbol(char ch) {
        return ch;
    }

    //Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
    public void viewCode() {
        System.out.println("ch1 = " + ch1);
        int code = ch1;
        System.out.println("ch1 = " + code);
    }
}
    public class ex15_01 {
        public static void main(String[] args) {

            /*Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код.*/

            System.out.println("\t\tLaboratory work №5");
            System.out.println("\t\t\tTask №1");
            Example1 field = new Example1();
            field.Set('x');
            System.out.println(field.getCodeSymbol('x'));
            field.viewCode();
        }
    }

