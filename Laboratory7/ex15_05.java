package Laboratory7;
/*5. Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля. На основе суперкласса создаются два
подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
защищенное целочисленное поле, там есть конструктор с двумя параметрами и
переопределен метод для отображения значений полей объекта и названия класса. Во
втором подклассе появляется защищенное символьное поле, конструктор с двумя
параметрами и переопределен метод, отображающий в консоли название класса и значения
полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную переменную суперкласса, которая ссылается на объект
производного класса.*/
public class ex15_05 {
    public static void main(String[] args) {
        My_super_class A = new My_super_class("Hello");
        First_sub_class B = new First_sub_class("World", 50);
        Second_sub_class C = new Second_sub_class("!!!", 'C');
        My_super_class r;
        r = A;
        System.out.println(r.toString());
        r = B;
        System.out.println(r.toString());
        r = C;
        System.out.println(r.toString());
    }
}
class My_super_class{
    private String myString;

    My_super_class(String myString){
        this.myString = myString;
    }

    @Override
    public String toString() {
        return "My_super_class{" +
                "myString='" + myString + '\'' +
                '}';
    }
}
class First_sub_class extends My_super_class{
    private int myNum;

    First_sub_class(String myString, int myNum){
        super(myString);
        this.myNum = myNum;
    }

    @Override
    public String toString() {
        return "First_sub_class{" +
                "myNum=" + myNum +
                "} " + super.toString();
    }
}
class Second_sub_class extends My_super_class{
    private char myChar;

    Second_sub_class(String myString, char myChar){
        super(myString);
        this.myChar = myChar;
    }

    @Override
    public String toString() {
        return "Second_sub_class{" +
                "myChar=" + myChar +
                "} " + super.toString();
    }
}
