package Laboratory7;
/*4. Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
*/
public class ex15_04 {
    public static void main(String[] args){
    MySuperClass A = new MySuperClass('A');
    MySuperClass myCloneA = new MySuperClass(A);
        System.out.println(A.toString());
        System.out.println(myCloneA.toString());
    MySubClass B = new MySubClass('B',"Hello");
    MySubClass myCloneB = new MySubClass(B);
        System.out.println(B.toString());
        System.out.println(myCloneB.toString());
    MySecondSubClass C = new MySecondSubClass('C', "World", 15);
    MySecondSubClass myCloneC = new MySecondSubClass(C);
        System.out.println(C.toString());
        System.out.println(myCloneC.toString());
    }
}
class MySuperClass{
    public char myChar;

    MySuperClass(char myChar){
        this.myChar = myChar;
    }
    MySuperClass(MySuperClass ob){
        myChar = ob.myChar;
    }

    @Override
    public String toString() {
        return "MySuperClass{" +
                "myChar=" + myChar +
                '}';
    }
}
class MySubClass extends MySuperClass{
    public String myString;

    MySubClass(char myChar, String myString) {
        super(myChar);
        this.myString = myString;
    }
    MySubClass(MySubClass ob){
        super(ob);
        this.myString = ob.myString;
    }

    @Override
    public String toString() {
        return "MySubClass{" +
                "myString='" + myString + '\'' +
                "} \n" + super.toString();
    }
}
class MySecondSubClass extends MySubClass{
    public int myNum;

    MySecondSubClass(char myChar, String myString, int myNum) {
        super(myChar, myString);
        this.myNum = myNum;
    }

    MySecondSubClass(MySecondSubClass ob) {
        super(ob);
        this.myNum = ob.myNum;
    }

    @Override
    public String toString() {
        return "MySecondSubClass{" +
                "myNum=" + myNum +
                "} " + super.toString();
    }
}

