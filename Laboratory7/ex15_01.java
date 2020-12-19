package Laboratory7;
/*
 1. Напишите программу, в которой есть суперкласс с приватным текстовым полем,
конструктором с текстовым параметром и где переопределен метод toString (). На основе
суперкласса путем наследования создается подкласс. У него появляется еще одно
приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
В обоих классах метод toString () переопределяется так, что он возвращает строку с
названием класса и значение текстового поля или текстовых полей.
*/
public class ex15_01 {
    public static void main(String[] args){

        SuperClass superClassObject = new SuperClass("В конструктор суперкласса");
        System.out.println(superClassObject.toString());

        SubClass subClassObject = new SubClass("В конструктор подкласса");
        System.out.println(subClassObject.toString());

        SubClass subClassObjectTwo = new SubClass("Конструктор подкласса", "с двумя параметрами");
        System.out.println(subClassObjectTwo.toString());
    }
}
class SuperClass{
    private String mySuperString;

    SuperClass(){
    }

    SuperClass(String myString){

        this.mySuperString = myString;
    }

    public String getString(){

        return this.mySuperString;
    }
    @Override
    public String toString(){
        return "Class name: " + this.getClass().getSimpleName() + "\n"+"My string: " + this.mySuperString;
    }

}
class SubClass extends SuperClass{
    private final String mySubString;

    SubClass(String mySubString){
        super();
    this.mySubString = mySubString;
    }

    SubClass(String mySuperString, String mySubString){
        super(mySuperString);
        this.mySubString = mySubString;
    }

    @Override
    public String toString(){
        return
                "SubClass: " + this.getClass().getSimpleName()+ "\n" +
                "SuperText: " +  super.getString() +
                "\nSubText: " + mySubString;

    }
}
