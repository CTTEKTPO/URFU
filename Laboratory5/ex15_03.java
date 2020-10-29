package Laboratory5;
/*Напишите программу с классом, у которого есть два целочисленных поля.
В классе должны быть описаны конструкторы, позволяющие создавать
объекты без передачи аргументов, с передачей одного аргумента и с передачей
двух аргументов.
*/
public class ex15_03 {
    public static void main(String[] args) {
        Example3 ex = new Example3();
        ex = new Example3(15);
        ex = new Example3(1, 20);

    }
}
class Example3{
    private int numOne;
    private int numTwo;

    Example3(){
        System.out.println("Конструктор без аргументов");
    }
    Example3(int numOne){
        this.numOne = numOne;
        System.out.println("Конструктор с одним аргументом: "+numOne);
    }
    Example3(int numOne, int numTwo){
        this.numOne = numOne;
        this.numTwo = numTwo;
        System.out.println("Конструктор с двумя аргументами: "+numOne + " " + numTwo);
    }
    void method(){
        System.out.println("Num one "+ numOne);
        System.out.println("Num two "+ numTwo);
    }

}
