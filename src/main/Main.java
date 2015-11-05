package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application{

    public Stage stage;
    public HomeController HC;
    Button projectViewButton;

    Scene projectViewScene;



    @Override
    public void start(Stage primaryStage) throws IOException
    {
        stage = primaryStage;
        stage.setTitle("PMT 3000");
        primaryStage.setScene(homeScene());
        primaryStage.setMaxWidth(600);
        primaryStage.setMaxHeight(400);


        primaryStage.show();

        HC = new HomeController();
      /*  if (HC.viewProjectButton.isPressed())
        {
            primaryStage.setScene(projectViewScene());
        }*/


    }

    public Scene homeScene () throws IOException
    {
        Pane root = FXMLLoader.load(getClass().getResource("../res/page_home.fxml"));
        return new Scene(root);
    }

    public void projectViewScene () throws IOException
    {
        Pane root = FXMLLoader.load(getClass().getResource("page_project_view.fxml"));
        stage.setScene(new Scene(root));
    }

    public static void main(String[] args) {
        launch(args);
    }



}
/*

primaryStage.setTitle("PMT 3000");
FXMLLoader homeLoader = new FXMLLoader(getClass().getResource("../res/page_home.fxml"));
Parent root = FXMLLoader.load(getClass().getResource("../res/page_home.fxml"));
primaryStage.setScene(mainScreen);
primaryStage.show();
*/

/*
         stage = primaryStage;
        primaryStage.setTitle("PMT 3000");

        FXMLLoader homeLoader = new FXMLLoader(getClass().getResource("../res/page_home.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("../res/page_home.fxml"));

        Pane homePane = homeLoader.load();

        HomeController homeController = homeLoader.getController();

        homeController.setPrevStage(primaryStage);

       // Parent projectViewSc = FXMLLoader.load(getClass().getResource("../res/page_project_view.fxml"));
        Scene mainScreen = new Scene(homePane);

        primaryStage.setScene(mainScreen);
        primaryStage.show();
 */