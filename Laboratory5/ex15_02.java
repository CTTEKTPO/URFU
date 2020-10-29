package Laboratory5;

/*
2. Напишите программу с классом, у которого есть два символьных поля и
метод. Он возвращает результат, и у него нет аргументов. При вызове метод
выводит в консольное окно все символы из кодовой таблицы, которые
находятся «между» символами, являющимися значениями полей объекта (из
которого вызывается метод). Например, если полям объекта присвоены
значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
выводиться все символы от ‘A’ до ‘D’ включительно.
*/
public class ex15_02 {
    public static void main(String[] args) {
        System.out.println("\t\tLaboratory work №5");
        System.out.println("\t\t\tTask №2");
        Example2 obj = new Example2('G', 'W');
        obj.method();

    }
}
class Example2 {

    private final char ch1;
    private final char ch2;

    Example2(char ch1, char ch2){
        this.ch1 = ch1;
        this.ch2 = ch2;
    }
    void method (){
        for (int i = ch1; i <= (int)ch2; i++){
        System.out.print((char)i + " ");
    }

    }
}

