package day7;
import java.util.Arrays;

public class Arraysorting {
    public static void main(String[] args) {
            int[] array = {11,57, 12, 8, 1, 9};


            int smallest=array[0];
            int largest=array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("print smallest number: " + smallest);
        System.out.println("print smallest number: " + largest);

            //System.out.println(Arrays.toString(array));
            //System.out.println(array[0]);
           // System.out.println(array[array.length-1]);


        }


}






