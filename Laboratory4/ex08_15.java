package com.company;
import java.util.Scanner;
public class ex08_15 {


    static class crypt {
        public static String getEncryptString(String encryptString, int shift) {
            char[] ArrayChar = encryptString.toCharArray(); // преобразуем переданную в метод строку в символьный массив
            long[] ArrayInt = new long[ArrayChar.length]; // создаем массив с типом данных long, размер массива равен размеру символьного массива
            char[] ArrayCharNew = new char[ArrayChar.length]; // создаем символьный массив в который будем записывать преобразованные символы
            //в цикле перебираем все символы из которых состоит переданная нами строка и прибавляем к ним число, ключ (сдвиг)
            for (int i = 0; i< ArrayChar.length; i++)
            {
                ArrayInt[i] = ArrayChar[i] + shift; // прибавляем к символу с индексом i сдвиг
                ArrayCharNew[i] = (char)ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
            }
            encryptString = new String (ArrayCharNew); // преобразовываем новый массив символов в строку
            return encryptString; // возвращаем строку в метод из которого был вызван текущий метод
        }

        public static String getDecryptString(String DecryptString, int shift) {
            char[] ArrayChar = DecryptString.toCharArray(); // преобразуем переданную в метод строку в символьный массив
            long[] ArrayInt = new long[ArrayChar.length]; // создаем массив с типом данных long, размер массива равен размеру символьного массива
            char[] ArrayCharNew = new char[ArrayChar.length]; // создаем символьный массив в который будем записывать преобразованные символы
            //в цикле перебираем все символы из которых состоит переданная нами строка и прибавляем к ним число, ключ (сдвиг)
            for (int i = 0; i < ArrayChar.length; i++) {
                ArrayInt[i] = ArrayChar[i] - shift; // убавляем к символу с индексом i сдвиг
                ArrayCharNew[i] = (char) ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
            }
            DecryptString = new String(ArrayCharNew); // преобразовываем новый массив символов в строку
            return DecryptString; // возвращаем строку в метод из которого был вызван текущий метод
        }
    }
    /*Напишите программу «Шифр Цезаря», которая зашифровывает
   введенный текст. Используете кодовую таблицу символов. При запуске
   программы в консоль необходимо вывести сообщение: «Введите текст для
   шифрования», после ввода текста, появляется сообщение: «Введите ключ».
   После того как введены все данные, необходимо вывести преобразованную
   строку с сообщением «Текст после преобразования : ». Далее необходимо
   задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
   если пользователь вводит «y», тогда выполнить обратное преобразование.
   Если пользователь вводит «n», того программа выводит сообщение «До
   свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
   то программа ему выводит сообщение: «Введите корректный ответ».
   */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
            String str = in.nextLine();
            System.out.print("Введите ключ: ");
            int sh = in.nextInt();
            String out = crypt.getEncryptString(str, sh);
            System.out.println("Текст после преобразования: " + out);
            System.out.print("Выполнить обратное преобразование? (y/n): " );
            in.nextLine();
            while(true) {
                if(in.hasNextLine()) {
                    String str1 = in.nextLine();
                    if (str1.equals("y")) {
                        out = crypt.getDecryptString(out, sh);
                        System.out.println("Исходный текст " + out);
                        break;
                    } else if (str1.equals("n")) {
                        System.out.println("До свидания!");
                        break;
                    } else {
                        System.out.print("Введите корректный ответ: ");
                    }
                }

            }
    }
}