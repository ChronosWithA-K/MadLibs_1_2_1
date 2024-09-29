import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scammer = new Scanner(System.in);

        // MadLib stories
        String madLib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        // madLib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        // madLib = "The <adjective> <noun> <verb>";

        int firstLeftBracket = madLib.indexOf("<");
        int firstRightBracket = madLib.indexOf(">");

        // String firstPrompt = madLib.substring((firstLeftBracket + 1), firstRightBracket);

        // System.out.println("Give me a " + firstPrompt);
        // String firstAnswer = scammer.nextLine();

        for (int i = 0; i < madLib.length(); i++) {
            if (madLib.charAt(i) == ) {

            }
        }
    }
}