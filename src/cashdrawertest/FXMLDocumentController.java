/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashdrawertest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 *
 * @author ObinnaAsuzu
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private ComboBox<Command> combo;

    @FXML
    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        combo.getItems().add(new Command("Citizen iDP-3310", new byte[]{7}));
        combo.getItems().add(new Command("Epson TM-88IV", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("Epson TM-88V", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("Epson M188D", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("Epson TM-T20", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("Epson TM-T60", new byte[]{27,112,32,25}));
        combo.getItems().add(new Command("Epson TM-T70", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("Epson TM-U295", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("Epson M665A", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("Epson TM-H6000", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("IBM 4610", new byte[]{7}));
        combo.getItems().add(new Command("Ithaca 150", new byte[]{27,120,1}));
        combo.getItems().add(new Command("NCR 7167", new byte[]{27,112,0,55}));
        combo.getItems().add(new Command("Samsung 220", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("Samsung SRP 270AP", new byte[]{27,112,48,55,121}));
        combo.getItems().add(new Command("Star", new byte[]{27,7,11,55,7}));
        combo.getItems().add(new Command("Star TSP-100", new byte[]{7}));
        combo.getItems().add(new Command("Star TSP-600", new byte[]{7}));
        combo.getItems().add(new Command("Star TSP-700", new byte[]{27,07,11,55,07}));
        combo.getItems().add(new Command("Wasp WPT-100", new byte[]{27,112,49,48,48}));
    }

}
