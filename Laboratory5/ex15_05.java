package Laboratory5;
/*Напишите программу с классом, у которого есть закрытое целочисленное
поле. Значение полю присваивается с помощью открытого метода. Методу
аргументом может передаваться целое число, а также метод может вызываться
без аргументов. Если методы вызывается без аргументов, то поле получает
нулевое значение. Если метод вызывается с целочисленным аргументом, то
это значение присваивается полю. Однако если переданное аргументом
методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу
что и метод для присваивания значения полю. Также в классе должен быть
метод, позволяющий проверить значение поля.*/
public class ex15_05 {
    public static void main(String[] args) {
        System.out.println("\t\tLaboratory work №5");
        System.out.println("\t\t\tTask №5");
        Example5 obj = new Example5();
        obj = new Example5(55);
        obj.viewField();
        obj.Set();
        obj.viewField();
        obj.Set(21);
        obj.viewField();

    }
}
class Example5{
    private int num1;

    //Первый конструктор
    Example5(){
        System.out.println("Constructor with no argument: No field");
    }
    //Второй конструктор с параметром
    Example5(int i){
        if (i > 100){
            num1 = 100;
        }else{
            num1 = i;
        }
        System.out.println("Constructor with argument: Field equals: ");
    }
    public void Set(int i) {
        if (i > 100){
            num1 = 100;
        }else{
            num1 = i;
        }
        System.out.println("Method with argument: Field equals: ");
    }
    public void Set(){
        num1 = 0;
        System.out.println("Method with no argument: Field equals: ");
    }
    public void viewField(){
        System.out.println(num1);
    }
}
