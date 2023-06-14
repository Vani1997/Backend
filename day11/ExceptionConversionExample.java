package day11;


    class CustomException extends Exception {
        public CustomException(String message) {

            super(message);
        }
    }

    public class ExceptionConversionExample {
        public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                try {

                    throw new CustomException("An error occurred: Array index out of bounds");
                } catch (CustomException ce) {
                    System.out.println("Custom Exception: " + ce.getMessage());
                }
            }
        }
    }


