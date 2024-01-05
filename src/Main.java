//import java. util. Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[4];
//        for (int i = 0; 1 < 4; i++) {
//            array[i] = scanner.nextInt();
//        }
//    }
//}
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array = {10, 12, 14, 16, 18};
//        System.out.print("Массив изначально: ");
//        System.out.println(Arrays.toString(array));
//
//        System.out.print("\nчисло которое хотим удалить: ");
//        int target = scanner.nextInt();
//
//        if (!searcher(array, target)) {
//            System.out.println("Такого числа нет!");
//        } else {
//            removeElement(array, target);
//
//            System.out.println(Arrays.toString(array));
//        }
//
//    }
//
//
//
//
//    private static boolean searcher(int array[], int target){
//        for (int number : array) {
//            if (number == target) {
//                return true;
//            }
//        }
//        return false;
//    }
//    private static int[] removeElement(int array[], int target) {
//        int number = 0;
//        for (int readNumber = 0; readNumber < array.length; readNumber++) {
//            if (array[readNumber] != target) {
//                array[number++] = array[readNumber];
//            }
//        }
//        while (number < array.length) {
//            array[number++] = 0;
//        }
//        return array;
//
//    }
//}
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("размер массива: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Размер массива должен быть целым числом.");
            return;
        }

        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным числом.");
            return;
        }

        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        System.out.println("Массив: " + Arrays.toString(array));

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }



        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);

    }
}




