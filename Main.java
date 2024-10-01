import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char charToCheck = '<';

        // MadLib stories
        String madLib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        // madLib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        // madLib = "The <adjective> <noun> <verb>";

        int iterator = countChar(madLib, '<');
        int i = 0;

        while (i <= iterator) {
            
        }

        int firstLeftBracket = madLib.indexOf("<");
        int firstRightBracket = madLib.indexOf(">");

        String firstPrompt = madLib.substring((firstLeftBracket + 1), firstRightBracket);

        System.out.println("Give me a " + firstPrompt);
        String firstAnswer = sc.nextLine();
    }

    public static int countChar(String str, char c) {
        int charCount = 0;

        for (int i=0; i < str.length(); i++) {
            if(str.charAt(i) == c)
            charCount++;
        }       

        return charCount;
    }
}