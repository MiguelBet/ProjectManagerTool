package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProjectViewController implements Initializable {

    @FXML public TextField projectNameTextField;
    @FXML public TextField projectManagerTextField;
    @FXML public TextField projectNumberOfTeamMembersTextField;
    @FXML public TextField projectNameOfTeamMembersTextField;
    @FXML public TextField projectCurrentStatusTextField;
    @FXML public TextField projectHoursTextField;
    @FXML public TextField projectStartDateTextField;
    @FXML public TextField projectExpectedDateTextField;
    @FXML public TextField projectActualDateTextField;
    @FXML private Button addProjectButton;
    public HomeController hc;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }

    public SoftwareProject createSoftwareProject()
    {
        SoftwareProject sp = new SoftwareProject(projectNameTextField.getText(),projectManagerTextField.getText(),projectNumberOfTeamMembersTextField.getText(),
                projectCurrentStatusTextField.getText(),projectHoursTextField.getText(),projectStartDateTextField.getText(),projectExpectedDateTextField.getText(),
                projectActualDateTextField.getText());

        return sp;
    }
    
    @FXML
    public void addProjectButtonAction(ActionEvent event) throws IOException
    {
        Stage stage;
        Parent root;
        if(event.getSource()== addProjectButton)
        {
            stage=(Stage) addProjectButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../res/page_home.fxml"));
            hc.addNewProject(createSoftwareProject());
            //I'm having trouble with this line working,
            //It's suppose to add a new row to the first screen with project name, manager and a button to edit it (a button at first is fine)
        }
        else{
            stage=(Stage) addProjectButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../res/page_home.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}


