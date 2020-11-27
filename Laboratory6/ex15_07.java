package Laboratory6;
/*
* 7. Напишите программу со статическим методом, аргументом которому передастся  *
* символьный массив, а результатом возвращается ссылка на целочисленным массив, *
* состоящий из кодов символов из массива- аргумента.                            *
*/
public class ex15_07 {
    public static void main(String[] args){
        char[] symbol = {'a','g','b','c','ъ','A','C'};
        int[] num = getArg(symbol);
        for (int x : num){
            System.out.print(x +" ");
        }
        System.out.println();
    }

    public static int[] getArg(char[] chr){
        int[] arr = new int[chr.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = chr[i];
        }
        return arr;
    }
}
