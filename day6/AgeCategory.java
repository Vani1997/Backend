package day6;


    public class AgeCategory {
        public static void main(String[] args) {
            int age = 25;
            printAgeCategory(age);
        }

        public static void printAgeCategory(int age) {
            if (age < 13) {
                System.out.println("Kid");
            } else if (age >= 13 && age <= 19) {
                System.out.println("Teen");
            } else {
                System.out.println("Adult");
            }
        }
    }



