package day7;
import java.util.Arrays;

public class Arraysorting {


        public static void main(String[] args) {
            int[] array = {11,57, 12, 8, 1, 9};


            Arrays.sort(array);

            System.out.println(Arrays.toString(array));
            System.out.println(array[0]);
            System.out.println(array[array.length-1]);


        }


}
