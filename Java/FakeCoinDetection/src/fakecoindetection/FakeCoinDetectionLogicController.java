/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakecoindetection;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Akshay
 */
public class FakeCoinDetectionLogicController implements Initializable {

    @FXML
    private Label title;
    @FXML
    private Label lable_size;
    @FXML
    private TextField size;
    @FXML
    private Label lable_weight;
    @FXML
    private Label lable_coins;
    @FXML
    private TextField weight;
    @FXML
    private TextField coins;
    @FXML
    private Label lable_output;
    @FXML
    private TextArea output;
    @FXML
    private Button submit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void SubmitButton(ActionEvent event) {
        int count = 0;
        Coin2 ob = new Coin2();
        int arraySize = Integer.parseInt(size.getText());
        int coin = Integer.parseInt(weight.getText());
        String str = coins.getText();
        String[] tempStr = str.split(",");
        output.appendText("Entered Coins : \n");
        output.appendText(str+"\t");
        output.appendText("\n");

        int Array[] = new int[arraySize];
        int n=Array.length;
        for (int i = 0; i < arraySize; i++) {
            int integer = Integer.parseInt(tempStr[i]);
            Array[i] = integer;
        }
        
        if (Array[0] != Array[1]) {
            output.appendText("Weighings required are one");
        } else {
            int result = ob.divide(Array, count, coin);
            output.appendText("The number of weighings required are : \n");
            output.appendText(result+"\n");
        }
}

    
}
