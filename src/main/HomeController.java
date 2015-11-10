package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable
{

    @FXML public VBox allProjectsVBox;
    @FXML private Button newProjectButton;
    @FXML public Label projectNameLabel;
    @FXML public Label projectManagerLabel;

    @FXML
    public void newProjectButtonAction(ActionEvent event) throws IOException
    {
        Stage stage;
        Parent root;
        if(event.getSource()== newProjectButton)
        {
            stage=(Stage) newProjectButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../res/page_project_view.fxml"));
        }
        else{
            stage=(Stage) newProjectButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../res/page_project_view.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {


    }


    @FXML
    public void addNewProject(SoftwareProject softw) {
        projectNameLabel.setText(softw.getProjectName());
        projectManagerLabel.setText(softw.getProjectManager());
        allProjectsVBox.getChildren().addAll(projectManagerLabel,projectManagerLabel, new Button("button"));
    }
}
