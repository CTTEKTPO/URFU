package Laboratory5;
/*
Напишите программу с классом, в котором есть два закрытых
целочисленных поля (назовем их max и min). Значение поля max не может
быть меньше значения поля min. Значения полям присваиваются с помощью
открытого метода. Метод может вызываться с одним или двумя
целочисленными аргументами. При вызове метода значения полям
присваиваются так: сравниваются текущие значения полей и значения
аргументов, переданных методу. Самое большое из значений присваивается
полю max, а самое маленькое из значений присваивается полю min.
Предусмотрите конструктор, который работает по тому же принципу, что и
метод для присваивания значений полям. В классе также должен быть метод,
отображающий в консольном окне значения полей объекта.
*/
public class ex15_06 {
    public static void main(String[] args) {
        System.out.println("\t\tLaboratory work №5");
        System.out.println("\t\t\tTask №6");
        Example6 obj = new Example6();
        obj = new Example6(2);
        obj = new Example6(4,9);
        obj.SetVal(10);
        obj.viewField();
        obj.SetVal(1,25);
        obj.viewField();
    }
}
class Example6{
    private int max = 8;
    private int min = 3;

    Example6(){
        System.out.println("Default values field: min = "+ min + " max = " +max);
    }
    Example6(int z){
        if (z > max) max = z;
        else if (z < min) min = z;
        System.out.println("Constructor with one argument: Values field: min = "+ min + " max = " +max);
    }
    Example6(int x, int y){
        if (x > this.max) max = x;
        else if (x < min) min = x;
        if (y > max) max = y;
        else if (y < min) min = y;
        System.out.println("Constructor with two argument: Values field: min = "+ min + " max = " +max);
    }
    public void SetVal(int x, int y) {
    if (x > this.max) max = x;
    else if (x < min) min = x;
    if (y > max) max = y;
    else if (y < min) min = y;
    }
    public void SetVal(int z){
    if (z > max) max = z;
    else if (z < min) min = z;
    }

    public void viewField(){
        System.out.println("Values field: min = " + min + " max = "+max );
    }
}
