package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;


public class Controller {

    @FXML
    TextArea userInput;
    @FXML
    Text wordsResult;
    @FXML
    Text charResults;

    public void buttonClicked(){
        String input = userInput.getText();
        wordsResult.setText("" + Main.countWords(input));
        charResults.setText("" + Main.countChar(input));
    }

}
