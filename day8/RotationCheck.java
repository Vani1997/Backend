package day8;

public class RotationCheck {

        public static void main(String[] args) {
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";

            boolean isRotation = checkRotation(str1, str2);

            if (isRotation) {
                System.out.println("The strings are rotations of each other.");
            } else {
                System.out.println("The strings are not rotations of each other.");
            }
        }

        public static boolean checkRotation(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            String concatenatedString = str1 + str1;

            return concatenatedString.contains(str2);
        }
    }


