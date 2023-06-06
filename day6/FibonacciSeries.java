package day6;


    public class FibonacciSeries {
        public static void main(String[] args) {
            int N = 10;
            System.out.println("Fibonacci Series up to " + N + " terms:");
            printFibonacciSeries(N);
        }

        public static void printFibonacciSeries(int N) {
            int firstTerm = 0;
            int secondTerm = 1;

            if (N >= 1) {
                System.out.print(firstTerm + " ");
            }

            if (N >= 2) {
                System.out.print(secondTerm + " ");
            }

            for (int i = 3; i <= N; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(nextTerm + " ");

                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }


