package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.text.Position;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ProjectViewController {

    @FXML
    private HBox projectNameHBox;
    @FXML
    private HBox projectNumberOfTeamHBox;
    @FXML
    private HBox projectNameOfTeamMHBox;
    @FXML
    private HBox projectCurrentStatusHBox;
    @FXML
    private HBox projectAddEditHoursHBox;
    @FXML
    private HBox projectStartDateHBox;
    @FXML
    private HBox projectExpectedDateHBox;
    @FXML
    private HBox projectActualDateHBox;



    public void setPage ()
    {

        projectNameHBox = new HBox();
        projectNumberOfTeamHBox = new HBox();
        projectNameOfTeamMHBox = new HBox();
        projectCurrentStatusHBox = new HBox();
        projectAddEditHoursHBox = new HBox();
        projectStartDateHBox = new HBox();
        projectExpectedDateHBox = new HBox();
        projectActualDateHBox = new HBox();

        VBox projectViewMainContainer = new VBox();
        projectViewMainContainer.setMinWidth(600);
        projectViewMainContainer.setMinHeight(400);

        Label projectViewHeader = new Label("Porject View");
        projectViewHeader.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        projectViewHeader.setTextFill(Color.BLUE);
        projectViewMainContainer.getChildren().addAll(projectViewHeader);
        projectViewMainContainer.setAlignment(Pos.CENTER);


        projectNameHBox.setMinHeight(36.0);
        projectNameHBox.setMinWidth(230.0);
        Label projectNameLabel = new Label("Name:");
        projectNameLabel.setTextAlignment(TextAlignment.CENTER);
        final TextField projectNameTextField = new TextField();
        projectNameTextField.setPrefWidth(360);
        projectNameTextField.setPrefHeight(36);
        projectNameTextField.getText();
        projectNameHBox.getChildren().addAll(projectNameLabel);
        projectNameHBox.getChildren().add(projectNameTextField);
        projectViewMainContainer.getChildren().addAll(projectNameHBox);

        projectNumberOfTeamHBox.setMinHeight(36);
        projectNumberOfTeamHBox.setMinWidth(230);
        Label proNumofTeam = new Label("Number of Team Members:");
        proNumofTeam.setTextAlignment(TextAlignment.CENTER);
        final TextField proNumofTeamTx = new TextField();
        proNumofTeamTx.setPrefWidth(230);
        proNumofTeamTx.setPrefHeight(36);
        proNumofTeamTx.getText();
        projectNumberOfTeamHBox.getChildren().addAll(proNumofTeam);
        projectNumberOfTeamHBox.getChildren().add(proNumofTeamTx);
        projectViewMainContainer.getChildren().addAll(projectNumberOfTeamHBox);

        projectNameOfTeamMHBox.setMinHeight(36);
        projectNameOfTeamMHBox.setMinWidth(230);
        Label projectNameOfTeamLabel = new Label("Team Members Name:");
        projectNameOfTeamLabel.setTextAlignment(TextAlignment.CENTER);
        final TextField projectNameOfTeamTextField = new TextField();
        projectNameOfTeamTextField.setPrefWidth(366);
        projectNameOfTeamTextField.setPrefHeight(36);
        projectNameOfTeamTextField.getText();
        projectNameOfTeamMHBox.getChildren().addAll(projectNameOfTeamLabel);
        projectNameOfTeamMHBox.getChildren().add(projectNameOfTeamTextField);
        projectViewMainContainer.getChildren().addAll(projectNameOfTeamMHBox);

        projectCurrentStatusHBox.setMinHeight(36);
        projectCurrentStatusHBox.setMinWidth(230);
        Label projectCurrentStatusLabel = new Label ("Current Status:");
        projectCurrentStatusLabel.setTextAlignment(TextAlignment.CENTER);
        final TextField projectCurrentStatusTextField = new TextField();
        projectCurrentStatusTextField.setPrefHeight(200);
        projectCurrentStatusTextField.setPrefWidth(200);
        projectCurrentStatusTextField.getText();
        projectCurrentStatusHBox.getChildren().addAll(projectCurrentStatusLabel);
        projectCurrentStatusHBox.getChildren().add(projectCurrentStatusTextField);
        projectViewMainContainer.getChildren().addAll(projectCurrentStatusHBox);

        projectAddEditHoursHBox.setPrefWidth(230);
        projectAddEditHoursHBox.setPrefHeight(36);
        Label projectAddEditHoursLabel = new Label("Add/Edit Hours Used:");
        projectAddEditHoursLabel.setTextAlignment(TextAlignment.CENTER);
        final TextField projectAddEditHoursTextField = new TextField();
        projectAddEditHoursTextField.setPrefHeight(36);
        projectAddEditHoursTextField.setPrefWidth(70);
        projectAddEditHoursTextField.getText();
        projectAddEditHoursHBox.getChildren().addAll(projectCurrentStatusLabel);
        projectAddEditHoursHBox.getChildren().add(projectCurrentStatusTextField);
        projectViewMainContainer.getChildren().addAll(projectAddEditHoursHBox);

        projectStartDateHBox.setPrefWidth(230);
        projectStartDateHBox.setPrefHeight(36);
        Label projectStartDateLabel = new Label("Start Date:");
        projectStartDateLabel.setTextAlignment(TextAlignment.CENTER);
        final TextField projectStartDateTextField = new TextField();
        projectStartDateTextField.setPrefHeight(100);
        projectStartDateTextField.setPrefWidth(100);
        projectStartDateTextField.getText();
        projectStartDateHBox.getChildren().addAll(projectStartDateLabel);
        projectStartDateHBox.getChildren().add(projectStartDateTextField);
        projectViewMainContainer.getChildren().addAll(projectStartDateHBox);

        projectExpectedDateHBox.setPrefWidth(230);
        projectExpectedDateHBox.setPrefHeight(36);
        Label projectExpectedDateLabel = new Label("Expected Date:");
        projectExpectedDateLabel.setTextAlignment(TextAlignment.CENTER);
        final TextField projectExpectedDateTextField = new TextField();
        projectExpectedDateTextField.setPrefHeight(100);
        projectExpectedDateTextField.setPrefWidth(100);
        projectExpectedDateTextField.getText();
        projectExpectedDateHBox.getChildren().addAll(projectExpectedDateLabel);
        projectExpectedDateHBox.getChildren().add(projectStartDateTextField);
        projectViewMainContainer.getChildren().addAll(projectExpectedDateHBox);

        projectActualDateHBox.setPrefWidth(230);
        projectActualDateHBox.setPrefHeight(36);
        Label projectActualDateLabel = new Label("Actual Date:");
        projectActualDateLabel.setTextAlignment(TextAlignment.CENTER);
        final TextField projectActualDateTextField = new TextField();
        projectActualDateTextField.setPrefHeight(36);
        projectActualDateTextField.setPrefWidth(100);
        projectActualDateTextField.getText();
        projectActualDateHBox.getChildren().addAll(projectActualDateLabel);
        projectActualDateHBox.getChildren().add(projectActualDateTextField);
        projectViewMainContainer.getChildren().addAll(projectActualDateHBox);

    }
}

