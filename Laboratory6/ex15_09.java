package Laboratory6;
/*
* 9. Напишите программу со статическим методом, аргументом которому передается       *
* одномерный символьный массив. В результате вызова метода элементы массива попарно  *
* меняются местами: первый — с последн и м , второй — с предпоследним и так далее.   *
*/
public class ex15_09 {
    public static void main(String[] args)
    {
        char[] arr = new char[] {'A','B','C','M','D','E'};
        permutation(arr);
        for (char c : arr) System.out.print(c + " ");
        System.out.println();
    }

    public static void permutation(char [] chr){
            char buf;
            for(int i = 0; i < chr.length / 2; ++i) {
                buf = chr[i];
                chr[i] = chr[chr.length - 1 - i];
                chr[chr.length - 1 - i] = buf;
            }

    }
}
