package task3;

//         Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//         каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
//         не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arrayA = {0, 1, 2};
        int[] arrayB = {0, -1, -2};
        int[] arrayC = {0, 1, 2, 3, 4};
        int[] arrayD = null;

        printResultOfSumOfTwoArrays(arrayA, arrayB);
        printResultOfSumOfTwoArrays(arrayA, arrayC);
        printResultOfSumOfTwoArrays(arrayA, arrayD);
    }

    public static int[] sumOfTwoArrays(int[] arrayA, int[] arrayB) {
        if (arrayA == null || arrayB == null) {
            System.out.println("One of the arrays is null.");
            return null;
        }

        if (arrayA.length != arrayB.length) {
            System.out.println("The length of one array is not equal to length of another array.");
            return null;
        }

        int[] arrayResult = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayResult[i] = arrayA[i] + arrayB[i];
        }
        return arrayResult;
    }

    public static void printResultOfSumOfTwoArrays(int[] arrayA, int[] arrayB) {
        String exceptionString = "An exception occurred. See an explanation above.";

        System.out.println(sumOfTwoArrays(arrayA, arrayB) == null ? exceptionString :
                Arrays.toString(arrayA) + " + " + Arrays.toString(arrayB) + " = " + Arrays.toString(sumOfTwoArrays(arrayA, arrayB)));
    }
}
