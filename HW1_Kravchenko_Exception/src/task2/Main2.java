package task2;

// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

//Ответ: как минимум 3
//NullPointerException
//IndexOutOfBoundsException
//NumberFormatException

public class Main2 {
    public static void main(String[] args) {
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { //NullPointerException
            for (int j = 0; j < 5; j++) { //IndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]); //NumberFormatException
                sum += val;
            }
        }
        return sum;
    }
}
