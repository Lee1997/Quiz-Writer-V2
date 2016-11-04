package main;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SetupScene {
	
	public Scene setup;
	public Stage window;
	
	public SetupScene(Stage window){
		this.window = window;
		init();
	}
	
	public void init(){
		Label quizTopic = new Label("Quiz Topic:");
		Label questionQuantity = new Label("Number of Questions:");
		Label difficultyLabel = new Label("Difficulty:");
		
		TextField topicField = new TextField();
		TextField quantityField = new TextField();
		TextField difficultyField = new TextField();
		
		topicField.setPromptText("Game of Thrones");
		quantityField.setPromptText("25");
		difficultyField.setText("Will be replaced by drop down");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(80);
		grid.setHgap(10);
		
		GridPane.setConstraints(quizTopic, 0, 0);
		GridPane.setConstraints(questionQuantity, 0, 1);
		GridPane.setConstraints(difficultyLabel, 0, 2);
		
		GridPane.setConstraints(topicField, 1, 0);
		GridPane.setConstraints(quantityField, 1, 1);
		GridPane.setConstraints(difficultyField, 1, 2);
		grid.setAlignment(Pos.CENTER);
		
		quizTopic.setStyle("-fx-font-size: 40px; -fx-margin-right: 40px;");
		questionQuantity.setStyle("-fx-font-size: 40px; -fx-margin-right: 40px;");
		difficultyLabel.setStyle("-fx-font-size: 40px; -fx-margin-right: 40px;");
		
		topicField.setStyle("-fx-min-height: 50px");
		quantityField.setStyle("-fx-min-height: 50px");
		difficultyField.setStyle("-fx-min-height: 50px");
		
		
		grid.setStyle("-fx-background-color: #d9d9d9");
		
		grid.getChildren().addAll(quizTopic, questionQuantity, difficultyLabel);
		grid.getChildren().addAll(topicField, quantityField, difficultyField);
		
		setup = new Scene(grid, QuizWriterV2.WIDTH, QuizWriterV2.HEIGHT);
	}

	
	
}
