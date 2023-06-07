package day7;
import java.util.Arrays;
public class ReverseArray {




        public static void main(String[] args) {

            int[] array = {5, 2, 8, 1, 9};
            int[] reversedArray = reverseArray(array);

            System.out.println(Arrays.toString(reversedArray));
        }

        public static int[] reverseArray(int[] array) {
            int[] reversedArray = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }

            return reversedArray;
        }
    }


