import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // madlib stories
        String madlib = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        // madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        // madlib = "The <adjective> <noun> <verb>.";

        // Warn users because the third prompt in the first madlib doesn't pass legalityChecker
        System.out.println("If you are prompted for a number, write it out as a word (e.g. five instead of 5)");

        // While "less than" angle brackets still exist in the madlib string:
        while (madlib.indexOf("<") != -1) {
            String prompt = madlib.substring(madlib.indexOf("<") + 1, madlib.indexOf(">"));
            String toReplace = madlib.substring(madlib.indexOf("<"), madlib.indexOf(">") + 1);

            System.out.println("Please give me a(n) " + prompt + ".");
            String answer = sc.nextLine();

            // Check if the input is legal
            while (true) {
                if (!legalityChecker(answer)) {
                    System.out.println("\nAnswers to the prompt have to contain only letters.");
                    System.out.println("Please give me a(n) " + prompt + ".");
                    answer = sc.nextLine();
                } else {
                    break;
                }
            }

            madlib = madlib.replace(toReplace, answer);
        }
        System.out.println(madlib);
    }
    
    // Checks if the string passed to it has only letters
    public static boolean legalityChecker(String str) {
        for (int i = 0; i < str.length(); i++) {
            // Checks if the character at the index is a letter; if not returns false
            if ((Character.isLetter(str.charAt(i)) == false)) {
               return false;
            }
        }
        return true; // If all characters in the string are a letter, return true
    }
}
