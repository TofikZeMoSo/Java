import java.util.HashSet;
import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {


        Scanner S = new Scanner(System.in);

        System.out.println("Enter The String");
        String inputString = S.nextLine();

        boolean checker = checkString(inputString);

        if (checker) {
            System.out.println("It contains all a to z alphabets");
        } else
            System.out.println("It does not contains all a to z alphabets");
        }

        private static boolean checkString (String inputString){
            HashSet<Character> characters = new HashSet<>();
            if (inputString.length() >= 25) {
                for ( int i = 0; i < inputString.length(); i++) {
                    char tempChar = inputString.charAt(i);

                    if ((tempChar >= 'a' && tempChar <= 'z' || tempChar >= 'A' && tempChar <= 'Z') && (characters.size() <= 25)) {
                        characters.add(Character.toUpperCase(tempChar));

                    }
                }
                return characters.size() == 26;
            } else
                return false;


        }
    }

    

