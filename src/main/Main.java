package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application{

    public Stage stage;

    public HomeController HC;

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        stage = primaryStage;
        stage.setTitle("PMT 3000");
        primaryStage.setScene(homeScene());
        primaryStage.setMaxWidth(750);
        primaryStage.setMaxHeight(450);
        primaryStage.show();
        HC = new HomeController();
    }

    public Scene homeScene () throws IOException
    {
        Pane root = FXMLLoader.load(getClass().getResource("../res/page_home.fxml"));
        return new Scene(root);
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}