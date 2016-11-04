package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StartScene{
	
	public Scene initScene;
	public Stage window;
	public SetupScene setupScene;
	
	public StartScene(Stage window){
		this.window = window;
		init();
		
		
	}
	
	public void init(){
		Label query = new Label("What would you like to do?");
		Button newQuizButton = new Button("New Quiz");
		Button loadQuizButton = new Button("Load Quiz");
		
		query.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-font-fill: #333333; -fx-effect: dropshadow(gaussian, rgba(255,255,255,0.5), 0,0,0,1);"); 
		query.setMaxWidth(Double.MAX_VALUE);
		query.setAlignment(Pos.CENTER);
		
		newQuizButton.setEffect(new DropShadow());
		newQuizButton.setPrefSize(300, 100);
		newQuizButton.setStyle("-fx-font-size: 40px; -fx-base: #b3ffff");
		newQuizButton.setMaxWidth(600);
		newQuizButton.setAlignment(Pos.CENTER);
		newQuizButton.setPadding(new Insets(10, 50, 10, 50));
		newQuizButton.paddingProperty();
		newQuizButton.setOnAction(e -> newQuiz());
		
		
		loadQuizButton.setEffect(new DropShadow());
		loadQuizButton.setPrefSize(300, 100);
		loadQuizButton.setStyle("-fx-font-size: 40px; -fx-base: #b3ffff");
		loadQuizButton.setMaxWidth(600);
		loadQuizButton.setAlignment(Pos.CENTER);
		loadQuizButton.setPadding(new Insets(10, 100, 10, 100));
		
		VBox layout = new VBox(20);
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().addAll(query, newQuizButton, loadQuizButton);
		layout.setStyle("-fx-background-color: #ffc299");
		initScene = new Scene(layout, QuizWriterV2.WIDTH, QuizWriterV2.HEIGHT);
		
	}
	
	public void newQuiz(){
		setupScene = new SetupScene(window);
		window.setScene(setupScene.setup);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
