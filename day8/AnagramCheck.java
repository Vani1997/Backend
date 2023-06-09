package day8;


    import java.util.Arrays;

    public class AnagramCheck {
        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            boolean isAnagram = checkAnagram(str1, str2);

            if (isAnagram) {
                System.out.println("The strings are anagrams is written vaani.");
            } else {
                System.out.println("The strings are not anagrams is written vaani.");
            }
        }

        public static boolean checkAnagram(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }
    }


