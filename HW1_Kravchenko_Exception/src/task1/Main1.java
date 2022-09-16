package task1;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

//Задание 4 (семинар)
//Создайте несколько методов, в каждом из которых, на этапе выполнения, JVM выбросит исключение.
//        В методе создается целочисленная переменная, которая инициализируется значением 10 / 0
//        В методе создается целочисленный массив длиной 10, и в ячейку этого массива с индексом 100 записывается значение 1
//        В методе создается строка и инициализируется значением null, затем в консоль выводится длина этой строки
//        В методе создается строка и инициализируется значением “10e2”, далее строка преобразуется к целому числу с помощью метода Integer.parseInt()
//        В методе создается переменная типа Object, в которую записывается строка “5”, попробуйте перенести значение этой переменной в другую переменную с типом Integer (т.е. нужно будет сделать каст из Object в Integer)



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
//        int result = divisionByZero(); //ArithmeticException

//        int[] array = new int[10]; //ArrayIndexOutOfBoundsException
//        recordNumberInArray(array, 100, 1);

//        String str = null;  //NullPointerException
//        printStringLength(str);

//        String str = "10e2";  //NumberFormatException
//        convertStringToNumber(str);

//        Object obj = "5"; //ClassCastException
//        convertObjectToInteger(obj);

    }

    public static int divisionByZero() { //ArithmeticException
        return 10 / 0;

    }

    public static int[] recordNumberInArray(int[] array, int index, int number) { //ArrayIndexOutOfBoundsException
        array[index] = number;
        return array;
    }

    public static int printStringLength(String str) { //NullPointerException
        return str.length();
    }

    public static int convertStringToNumber(String str) { //NumberFormatException
        return Integer.parseInt(str);
    }

    public static Integer convertObjectToInteger(Object obj) { //ClassCastException class java.lang.String cannot be cast to class java.lang.Integer
        return (Integer)obj;
    }
}
