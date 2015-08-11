package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;

import javax.xml.soap.Text;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable
{
    @FXML //  fx:id="myButton"
    private Button run;
    @FXML
    private Button browsApp;
    @FXML
    private Button browsEtalon;

    @FXML
    private TextField browsAppTextField;
    @FXML
    private TextField batchXmlTextField;
    @FXML
    private TextField etalonPathTextField;
    @FXML
    private TextField targetPathTextField;
    @FXML
    private TextField prjDirTextField;
    @FXML
    private TextField prjGbAppTextField;

    @FXML
    private TextArea allowListArea;
    @FXML
    private TextArea etalonArea;
    @FXML
    private TextArea targetArea;
    @FXML
    private ChoiceBox deepSearch;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        run.setOnAction((event) -> {
            System.out.println("run");
        });
        browsApp.setOnAction((event) -> {
            System.out.println("browsApp");
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Console File");
            File path = fileChooser.showOpenDialog(null);
            browsAppTextField.textProperty().setValue(path.toString());
        });
        browsEtalon.setOnAction((event) -> {
            System.out.println("browsEtalon");
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Etalon File");
            File path = fileChooser.showOpenDialog(null);
            etalonPathTextField.textProperty().setValue(path.toString());
        });

        //browsAppTextField.textProperty().setValue("browsAppTextField");
        batchXmlTextField.textProperty().setValue("batchXmlTextField");
        etalonPathTextField.textProperty().setValue("etalonPathTextField");
        targetPathTextField.textProperty().setValue("targetPathTextField");
        prjDirTextField.textProperty().setValue("prjDirTextField");
        prjGbAppTextField.textProperty().setValue("prjGbAppTextField");

        allowListArea.textProperty().setValue("allowListArea");
        etalonArea.textProperty().setValue("etalonArea");
        targetArea.textProperty().setValue("targetArea");

        System.out.println(deepSearch.getValue());

    }
}