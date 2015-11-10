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

    public SoftwareProject newSoftwareProject(String name, String manager, String numOfTeam, String current, String Hours, String start, String expected,
                                              String actual)
    {
        SoftwareProject sp = new SoftwareProject(projectNameTextField.getText(),projectManagerTextField.getText(),projectNumberOfTeamMembersTextField.getText(),
                projectCurrentStatusTextField.getText(),projectHoursTextField.getText(),projectStartDateTextField.getText(),projectExpectedDateTextField.getText(),
                projectActualDateTextField.getText());

        return sp;
    }
    
    @FXML
    public void addProjectButtonAction(ActionEvent event) throws IOException
    {
        hc = new HomeController();
        hc.addNewProject(new SoftwareProject(projectNameTextField.getText(),projectManagerTextField.getText(),projectNumberOfTeamMembersTextField.getText(),
                projectCurrentStatusTextField.getText(),projectHoursTextField.getText(),projectStartDateTextField.getText(),projectExpectedDateTextField.getText(),
                projectActualDateTextField.getText()));


        Stage stage;
        Parent root;
        if(event.getSource()== addProjectButton)
        {
            stage=(Stage) addProjectButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../res/page_home.fxml"));

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


