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
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("размер массива: ");
//        if (!scanner.hasNextInt()) {
//            System.out.println("Размер массива должен быть целым числом.");
//            return;
//        }
//
//        int size = scanner.nextInt();
//        if (size <= 0) {
//            System.out.println("Размер массива должен быть положительным числом.");
//            return;
//        }
//
//        int[] array = new int[size];
//
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(101) - 50;
//        }
//
//        System.out.println("Массив: " + Arrays.toString(array));
//
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (min > array[i]) {
//                min = array[i];
//            }
//        }
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//        }
//
//
//
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        double average = (double) sum / array.length;
//
//        System.out.println("Минимальное значение: " + min);
//        System.out.println("Максимальное значение: " + max);
//        System.out.println("Среднее значение: " + average);
//
//    }
//}
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//           int[] array1 = {10, 4, 15, 6, 14};
//           int[] array2 = {11, 3, 6, 7, 1};
//
//             System.out.print("Массив 1: ");
//             System.out.println(Arrays.toString(array1));
//
//             System.out.print("Массив 2: ");
//             System.out.println(Arrays.toString(array2));
//
//        System.out.println("Среднее значение массива 1: " + average(array1));
//        System.out.println("Среднее значение массива 2: " + average(array2));
//
//                    if (average(array1) < average(array2)) {
//            System.out.println("Среднее значение второго массива больше ");
//        } else if (average(array1) > average(array2)) {
//            System.out.println("Среднее значение первого массива больше ");
//        } else System.out.println("Средние значения равны!");
//
//
//    }
//
//    private static double average(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        double average = (double) sum / array.length;
//        return average;
//    }
//}
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива (от < 5 до 10 включительно): ");
//        int size;
//        do {
//            while (!scanner.hasNextInt()) {
//                System.out.println("от < 5 до 10 включительно... Повторите ввод!");
//                scanner.next();
//            }
//            size = scanner.nextInt();
//            if (size > 10 || size > 10) {
//                System.out.println("от < 5 до 10 включительно... Повторите ввод!");
//            }
//        } while (size > 10 || size > 10);
//
//        int[] array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100);
//        }
//        System.out.println(Arrays.toString(array));
//
//        int count = 0;
//        for (int number : array) {
//            if (number % 2 == 0) {
//                count++;
//            }
//        }
//
//        if (count == 0) {
//            System.out.println("Четных элементов нет");
//        } else {
//            int[] arrayOfEven = new int[count];
//            for (int j = 0, readNumber = 0; readNumber < array.length; readNumber++) {
//                if (array[readNumber] % 2 == 0) {
//                    arrayOfEven[j++] = array[readNumber];
//                }
//            }
//            System.out.println(Arrays.toString(arrayOfEven));
//        }
//    }
//}
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array = {6, 3, -2, 8, -10, 14, -16, -15};
//        System.out.println("Массив: " + Arrays.toString(array));
//
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                array[i] = 0;
//            }
//        }
//        System.out.println("не четные замена на 0: " + Arrays.toString(array));
//    }
//}
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        String[] array = {"Коля", "Женя", "Соня", "Митя", "Калина"};
//        Arrays.sort(array);
//        System.out.println("Массив после сортировки: " + Arrays.toString(array));
//    }
//}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 7, 10, 34, -8, -17};

        System.out.println("до сортировки: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("после сортировки: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }
}