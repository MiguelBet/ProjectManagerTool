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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import main.Main;
import javafx.application.Application;

public class HomeController implements Initializable
{

    @FXML
    private VBox projectNameVbox;
    @FXML
    private VBox projectManagerVbox;
    @FXML
    private VBox viewButtonsVbox;

    public final static double CELL_MIN_HEIGHT = 40;

    Stage prevStage;
/*
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException
    {
        Parent viewProjectParent = FXMLLoader.load(getClass().getResource("../res/page_project_view.fxml"));
        Scene viewProjectScene = new Scene(viewProjectParent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    }*/



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setHeader();
    }
    @FXML
    private Button viewProjectButton;

    private Main main;

    public void setHeader() {
        HBox projectNameContainer = new HBox();
        HBox projectManagerContainer = new HBox();
        HBox viewProjectContainer = new HBox();
        main = new Main();

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
        viewProjectButton.setOnAction(event -> addNewProject(new SoftwareProject("Test", "Test")));

        //viewProjectButton.setOnAction(event -> main.projectViewScene());
        /*if (viewProjectButton.isPressed())
        {
            main.stage.setScene(projectViewScene());
        }*/


        projectNameVbox.getChildren().add(projectNameContainer);
        projectManagerVbox.getChildren().add(projectManagerContainer);
        viewButtonsVbox.getChildren().add(viewProjectContainer);

        Separator separator = new Separator();
        Separator separator2 = new Separator();
        Separator separator3 = new Separator();

        projectNameVbox.getChildren().add(separator);
        projectManagerVbox.getChildren().add(separator2);
        viewButtonsVbox.getChildren().add(separator3);
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

        projectNameVbox.getChildren().add(projectNameContainer);
        projectManagerVbox.getChildren().add(projectManagerContainer);
        viewButtonsVbox.getChildren().add(viewProjectContainer);

        projectNameVbox.getChildren().add(separator);
        projectManagerVbox.getChildren().add(separator2);
        viewButtonsVbox.getChildren().add(separator3);
    }


/*
    public scene ViewProjectScene () throws IOException
    {
        Stage stage = new Stage();
        stage.setTitle("PMT 3000");
        Pane projectViewPane = null;
        projectViewPane = FXMLLoader.load(getClass().getResource(".../res/page_project_view.fxml"));
        Scene scene = new Scene (projectViewPane);
        stage.setScene(scene);

        prevStage.close();

        stage.show();

    }*/

   /* public Scene viewProjectScene ()
    {
        Parent root = null;

        root = FXMLLoader.load(getClass().getResource("../res/page_project_view.fxml"));

        return new Scene(root);
    }*/
    public void setPrevStage (Stage stage)
    {
        this.prevStage = stage;
    }

    public void setMain (Main myMain)
    {
        this.main = myMain;
    }

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

}
