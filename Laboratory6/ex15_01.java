package Laboratory6;

public class ex15_01 {
    /*Напишите программу с классом, в котором есть два поля: символьное и текстовое.
В классе должен быть перегруженный метод для присваивания значений полям. Если метод
вызывается с символьным аргументом, то соответствующее значение присваивается
символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
значение текстового ноля. Методу аргументом также может передаваться символьный
массив. Если массив состоит из одного элемента, то он определяет значение символьного
поля. В противном случае (если в массиве больше одного элемента) из символов массива
формируется текстовая строка и присваивается значением текстовому полю.*/

    public static void main(String[] args) {

        Example1 s = new Example1();
        s.print();

        s.setVal('F');
        s.setVal("new string value");
        s.print();

        char[] chars = {'N'};
        s.setVal(chars);
        s.print();

        chars = new char[]{'H', 'e', 'l', 'l', '0'};
        s.setVal(chars);
        s.print();
    }
}
    class Example1{
        char chr1;
        String str1;

        public void setVal(char chr1){
            this.chr1 = chr1;
        }
        public void setVal(String str1){
            this.str1 = str1;
        }
        public void setVal(char [] chrArr){
            if (chrArr.length == 1){
                chr1 = chrArr[0];
            }
            else
                str1 = new String(chrArr);
        }
        public void print(){
            System.out.println("ch = " + chr1 + ", str = " + str1);
        }
    }


