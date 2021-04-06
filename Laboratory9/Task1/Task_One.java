package Laboratory9.Task1;

public class Task_One {
    /*public static void main(String[] args) {
        //Пример 1. Сгенерировано и перехвачено RuntimeException
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            /*«брошено» исключение
            создан экземпляр RuntimeException с сообщением
        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("1 "+ e); // исключение обработано
        }
        System.out.println("2");
    }*/
    //          Предок может перехватывать исключения всех своих потомков.
    //          Пример 2. Исключение перехвачено перехватчиком предка.
    /*public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("1"+ e );
        }
        System.out.println("2");
    }*/

    //Пример 3. Перехват исключения подходящим классом.
   /* public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }catch (RuntimeException e) {
            System.out.println("2" );
        }catch (Exception e) {
            System.out.println("3" );
        }
        System.out.println("4");
    }*/
    //Пример 4. Перехват исключения подходящим классом.
   /* public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }catch (Exception e) {
            System.out.println("2" );
        }catch (Error e) {
            System.out.println("3" );
        }
        System.out.println("4");
    }*/
    //Пример 5. Исключение не перехвачено.
    /*public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }
        System.out.println("2");
    }*/
//    Пример 6. Последовательность перехвата должна
//    соответствовать иерархии классов исключений. Предок не должен
//    перехватывать исключения раньше потомков. Указанный пример
//    выдает ошибку компилятора. Программу запустить невозможно.
    /*public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1" );
        }catch (RuntimeException e) {
            System.out.println("3" +e);
        }catch (Exception e) {
            System.out.println("2" );
        }
        System.out.println("4");
    }*/
    // Пример 7. Нельзя перехватить брошенное исключение с помощью чужого catch, даже если перехватчик подходит.
   /* public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("4"+e);
        }
        System.out.println("1");
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2"+e);
        }
        System.out.println("3");
    }*/
//    Далее приведены примеры с использованием конструкции try finally. Перехват брошенного исключения catch не производится.
//    Секция finally выполняется всегда.
//    Пример 8. Генерация исключения в методе.

       /* public static int m(){
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
                System.out.println("1");
            } }
        public static void main(String[] args) {
            System.out.println(m());
        }*/
//    Пример 9. Генерация исключительной ситуации в методе и
//    дополнительное использование оператора return.

       /* public static int m(){
            try {
                System.out.println("0");
                return 55; // выход из метода
            } finally {
                System.out.println("1");
            } }
        public static void main(String[] args) {
            System.out.println(m());
        }*/

//    Пример 10. Генерация исключительной ситуации в методе.
//    Использование оператора return в секциях try и finally.

       /* public static int m(){
            try {
                System.out.println("0");
                return 15;
            } finally {
                System.out.println("1");
                return 20;
            } }
        public static void main(String[] args) {
            System.out.println(m());
        }*/

    // Пример 11.
        /*public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new NullPointerException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1" );
            }finally {
                System.out.println("2" );
            }
            System.out.println("3");
        }*/
//    Пример 12. Исключение IllegalArgumentException – неверные
//    аргументы.

       /* public static void m(String str, double number){
            if (str==null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (number>0.001) {
                throw new IllegalArgumentException("Неверное число");
            } }
        public static void main(String[] args) {
            String s = "hi";
            m(s,0.1);
        }*/
//    Пример 13. Пример работы с аргументами метода main. На
//    рисунке 5 представлена настройка проекта и задание входных
//    значений аргументов.

        /*public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("размер массива= " + l);
                int h=10/l;
                args[l + 1] = "10";
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс не существует");
            }
    }*/
//    Пример 14. Обработка исключения, порожденного одним методом
//    m() в другом (в методе main).

    /*public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }

    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }*/
}
