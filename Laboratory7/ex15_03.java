package Laboratory7;
/*
3. Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
параметром для присваивания значения полю и конструктор с одним параметром. Во
втором классе появляется открытое символьное поле, метод с двумя параметрами для
присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
параметрами. В третьем классе появляется открытое текстовое поле, метод с тремя
аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта
 */
public class ex15_03 {
    public static void main(String[] args){
        mySuperClass A = new mySuperClass(5);
        mySubClass B = new mySubClass(10, 'A');
        mySecondSubClass C = new mySecondSubClass(20, 'B', "Hello world");
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
    }
}
class mySuperClass {
    public int myNum;

    mySuperClass() {
        System.out.println("Default field int");
        myNum = 0;
    }

    mySuperClass(int myNum) {
        this.myNum = myNum;
    }

    public void setMyField(int myNum) {
        this.myNum = myNum;
    }

    @Override
    public String toString(){
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                +"My int: " + this.myNum;
    }
}
class mySubClass extends mySuperClass{
    public Character mySymbol;

    mySubClass(){
        System.out.println("Default field Char and Int");
        this.mySymbol = 0;
        this.myNum = 0;
    }
    mySubClass(int myNum, char mySymbol){
        super(myNum);
        this.mySymbol = mySymbol;
    }

    public void setMyField(int myNum, char mySymbol) {
        this.myNum = myNum;
        this.mySymbol = mySymbol;
    }
    @Override
    public String toString(){
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                +"My int: " + super.myNum + "\n"
                +"My Char: " + this.mySymbol;
    }
}
class mySecondSubClass extends mySubClass {
    public String myString;

    mySecondSubClass() {
        System.out.println("Default field Char, Int and String");
        this.mySymbol = null;
        this.myNum = 0;
        this.myString = "null";
    }

    mySecondSubClass(int myNum, char mySymbol, String myString) {
        super(myNum, mySymbol);
        this.myString = myString;
    }

    public void setMyField(int myNum, char mySymbol, String myString) {
        this.myNum = myNum;
        this.mySymbol = mySymbol;
        this.myString = myString;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                + "My int: " + super.myNum + "\n"
                + "My Char: " + super.mySymbol + "\n"
                + "My String: " + this.myString;

    }
}


