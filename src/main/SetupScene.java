package main;

import java.io.IOException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SetupScene {
	
	public Scene setup;
	public Stage window;
	public MainScene mainScene;
	
	public TextField topicField, quantityField, difficultyField;
	
	
	public SetupScene(Stage window){
		this.window = window;
		init();
	}
	
	public void init(){
		Label quizTopic = new Label("Quiz Topic:");
		Label questionQuantity = new Label("Number of Questions:");
		Label difficultyLabel = new Label("Difficulty:");
		
		topicField = new TextField();
		quantityField = new TextField();
		difficultyField = new TextField();
		/*
		 * BRING THIS BACK
		topicField.setPromptText("Game of Thrones");
		quantityField.setPromptText("25");
		difficultyField.setText("Medium");
		*/
		
		topicField.setText("Game of Thrones");
		quantityField.setText("25");
		difficultyField.setText("Medium");
		//Submit Button
		Button submit = new Button("Submit!");
		submit.setStyle("-fx-min-width: 200px; -fx-min-height: 75px; -fx-font-size: 40px; -fx-base: #b3ffff");
		submit.setOnAction(e-> submitted());
		
		//Button div(StackPane)
		StackPane submitHolder = new StackPane();
		submitHolder.getChildren().add(submit);
		submitHolder.setAlignment(Pos.CENTER);
		
		//Grid Setup
		GridPane grid = new GridPane();
		grid.setVgap(50);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);
		
		//Label constraints
		GridPane.setConstraints(quizTopic, 0, 0);
		GridPane.setConstraints(questionQuantity, 0, 1);
		GridPane.setConstraints(difficultyLabel, 0, 2);
		
		//Text Field constraints
		GridPane.setConstraints(topicField, 1, 0);
		GridPane.setConstraints(quantityField, 1, 1);
		GridPane.setConstraints(difficultyField, 1, 2);
		
		//Button constraints
		GridPane.setConstraints(submit, 0, 3);
		GridPane.setConstraints(submitHolder, 1, 3);		
		
		quizTopic.setStyle("-fx-font-size: 40px; -fx-margin-right: 40px; -fx-font-style: italic;");
		questionQuantity.setStyle("-fx-font-size: 40px; -fx-margin-right: 40px; -fx-font-style: italic;");
		difficultyLabel.setStyle("-fx-font-size: 40px; -fx-margin-right: 40px; -fx-font-style: italic;");
		
		topicField.setStyle("-fx-min-height: 75px; -fx-min-width: 200px; -fx-font-size: 25px;");
		quantityField.setStyle("-fx-min-height: 75px; -fx-font-size: 25px;");
		difficultyField.setStyle("-fx-min-height: 75px; -fx-font-size: 25px;");
		
		grid.getChildren().addAll(submitHolder, quizTopic, questionQuantity, difficultyLabel);
		grid.getChildren().addAll(topicField, quantityField, difficultyField);
		
		grid.setStyle("-fx-background-color: #ffc299");
		
		setup = new Scene(grid, QuizWriterV2.WIDTH, QuizWriterV2.HEIGHT);
	}
	
	public void submitted(){
		int length = Integer.MAX_VALUE;
		if(topicField.getText().equals("") && quantityField.getText().equals("")){
			AlertBox.display("Error", "No fields correctly filled out!");
		}
		else if(topicField.getText().equals("")){
			AlertBox.display("Topic Field error", "Topic Field not correctly filled out!");
		}
		else if(quantityField.getText().equals("")){
			AlertBox.display("Quiz Length Field error", "Quiz Length Field not filled out");
		}
		else{
			try{
				length = Integer.parseInt(quantityField.getText());
			}catch(NumberFormatException e){
				AlertBox.display("Quiz Length Field error", "There's isn't a number in the quiz length field!");
				e.printStackTrace();
			}
		}
		
		if(length != Integer.MAX_VALUE){
			newMainScene(length);
		}
	}
	
	public void newMainScene(int length){
		mainScene = new MainScene(window, topicField.getText(), length, difficultyField.getText());
		window.setScene(mainScene.scene);
	}
	
	
	
	
	
	
	
	
	

	
	
}
