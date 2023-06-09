package day8;
import java.util.Scanner;


    public class VowelCount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            int numVowels = countVowels(inputString);
            System.out.println("Number of vowels: " + numVowels);
        }

        public static int countVowels(String str) {
            int count = 0;
            String vowels = "aeiouAEIOU";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }

            return count;
        }
    }


