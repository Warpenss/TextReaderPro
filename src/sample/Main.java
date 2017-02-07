package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("TextReader");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

    static int countWords(String s){

        int wordCount = 0;

        boolean word = false;

        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            // if the char is a letter, word = true.
            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;
                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }

        return wordCount;
    }

    static char countChar(String text) {
        text = text.replaceAll("\\s+", "");

        char commChar = ' ';

        int maxChar = 0;

        int[] charCount = new int[Character.MAX_VALUE + 1];

        for (int i = text.length() - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            if (++charCount[ch] >= maxChar) {
                maxChar = charCount[ch];
                commChar = ch;
            }
        }

        return commChar;
    }
}
