package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable
{

    @FXML
    private VBox projectNameVBox;
    @FXML
    private VBox projectManagerVBox;
    @FXML
    private VBox viewButtonsVBox;
    @FXML
    private Button viewProjectButton;

    public final static double CELL_MIN_HEIGHT = 40;

    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        if(event.getSource()==viewProjectButton){
            //get reference to the button's stage
            stage=(Stage) viewProjectButton.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getResource("../res/page_project_view.fxml"));
        }
        else{
            stage=(Stage) viewProjectButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../res/page_project_view.fxml"));
        }
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        //setHeader();
    }

    public void setHeader() {
        HBox projectNameContainer = new HBox();
        HBox projectManagerContainer = new HBox();
        HBox viewProjectContainer = new HBox();

        projectNameContainer.setMinHeight(CELL_MIN_HEIGHT);
        projectManagerContainer.setMinHeight(CELL_MIN_HEIGHT);
        viewProjectContainer.setMinHeight(CELL_MIN_HEIGHT);

        Label projectName = new Label("Project Name");
        projectName.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        projectName.setTextFill(Color.BLUE);
        projectNameContainer.getChildren().addAll(projectName);
        projectNameContainer.setAlignment(Pos.CENTER_LEFT);
        projectNameContainer.setPadding(new Insets(0,0,0,20));

        Label projectManager = new Label("Project Manager");
        projectManager.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        projectManager.setTextFill(Color.BLUE);
        projectManagerContainer.setAlignment(Pos.CENTER);
        projectManagerContainer.getChildren().addAll(projectManager);

        viewProjectButton = new Button("Add Project");
        viewProjectContainer.getChildren().addAll(viewProjectButton);
        viewProjectContainer.setAlignment(Pos.CENTER_RIGHT);
        viewProjectContainer.setPadding(new Insets(0, 20, 0, 0));
        viewProjectButton.setOnAction(event -> addNewProject(new SoftwareProject("Test", "Test", 52)));

        projectNameVBox.getChildren().add(projectNameContainer);
        projectManagerVBox.getChildren().add(projectManagerContainer);
        viewButtonsVBox.getChildren().add(viewProjectContainer);

        Separator separator = new Separator();
        Separator separator2 = new Separator();
        Separator separator3 = new Separator();

        projectNameVBox.getChildren().add(separator);
        projectManagerVBox.getChildren().add(separator2);
        viewButtonsVBox.getChildren().add(separator3);
    }


    public void addNewProject(SoftwareProject softwareProject) {
        HBox projectNameContainer = new HBox();
        HBox projectManagerContainer = new HBox();
        HBox viewProjectContainer = new HBox();

        projectNameContainer.setMinHeight(CELL_MIN_HEIGHT);
        projectManagerContainer.setMinHeight(CELL_MIN_HEIGHT);
        viewProjectContainer.setMinHeight(CELL_MIN_HEIGHT);

        Label projectName = new Label(softwareProject.projectName);
        Label projectManager = new Label(softwareProject.projectManager);
        Button viewProject = new Button("View");

        projectNameContainer.getChildren().addAll(projectName);
        projectNameContainer.setAlignment(Pos.CENTER_LEFT);
        projectNameContainer.setPadding(new Insets(0, 0, 0, 20));

        projectManagerContainer.getChildren().addAll(projectManager);
        projectManagerContainer.setAlignment(Pos.CENTER);

        viewProjectContainer.getChildren().addAll(viewProject);
        viewProjectContainer.setAlignment(Pos.CENTER_RIGHT);
        viewProjectContainer.setPadding(new Insets(0, 20, 0, 0));

        Separator separator = new Separator();
        Separator separator2 = new Separator();
        Separator separator3 = new Separator();

        projectNameVBox.getChildren().add(projectNameContainer);
        projectManagerVBox.getChildren().add(projectManagerContainer);
        viewButtonsVBox.getChildren().add(viewProjectContainer);

        projectNameVBox.getChildren().add(separator);
        projectManagerVBox.getChildren().add(separator2);
        viewButtonsVBox.getChildren().add(separator3);
    }
}
