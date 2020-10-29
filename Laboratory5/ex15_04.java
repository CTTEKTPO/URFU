package Laboratory5;
/*Напишите программу с классом, у которого есть символьное и
целочисленное поле. В классе должны быть описаны версии конструктора с
двумя аргументами (целое число и символ – определяют значения полей), а
также с одним аргументом типа double. В последнем случае действительная
часть аргумента определяет код символа (значение символьного поля), а
дробная часть (с учетом десятых и сотых) определяет значение
целочисленного поля. Например, если аргументом передается число 65.1267,
то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
поле получит значение 12 (в дробной части учитываются только десятые и
сотые).*/
public class ex15_04 {
    public static void main(String[] args) {
        System.out.println("\t\tLaboratory work №5");
        System.out.println("\t\t\tTask №4");
        Example4 obj = new Example4(64,'F');
        Example4 obj1 = new Example4(82.2714);


    }
}
class Example4{
    int num1;
    char ch;

    Example4(int num1, char ch){
        this.num1 = num1;
        this.ch = ch;
        System.out.println(num1 + " " + ch);
    }
    Example4(double numDouble){
        ch = (char)numDouble;
        num1 = (int)(numDouble*100%100);
        System.out.println(num1 + " " + ch);
    }
}
