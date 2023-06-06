package day6;


    public class ReverseNumber {
        public static void main(String[] args) {
            int number = 12345;
            int reversedNumber = reverseNumber(number);
            System.out.println("Reversed number: " + reversedNumber);
        }

        public static int reverseNumber(int number) {
            int reversedNumber = 0;
            while (number != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }
            return reversedNumber;
        }
    }

