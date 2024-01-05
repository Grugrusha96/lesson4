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
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 12, 14, 16, 18};
        System.out.print("Массив изначально: ");
        System.out.println(Arrays.toString(array));

        System.out.print("\nчисло которое хотим удалить: ");
        int target = scanner.nextInt();

        if (!searcher(array, target)) {
            System.out.println("Такого числа нет!");
        } else {
            removeElement(array, target);

            System.out.println(Arrays.toString(array));
        }

    }




    private static boolean searcher(int array[], int target){
        for (int number : array) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }
    private static int[] removeElement(int array[], int target) {
        int number = 0;
        for (int readNumber = 0; readNumber < array.length; readNumber++) {
            if (array[readNumber] != target) {
                array[number++] = array[readNumber];
            }
        }
        while (number < array.length) {
            array[number++] = 0;
        }
        return array;

    }
}




