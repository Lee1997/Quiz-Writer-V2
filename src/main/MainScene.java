package main;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainScene {
	
	public Scene scene;
	public Stage window;
	public String topic, difficulty;
	public int length;
	
	public String title, diff;
	
	public GridPane overall;
	
	public MainScene(Stage window, String topic, int length, String difficulty){
		this.window = window;
		this.topic = topic;
		this.length = length;
		this.difficulty = difficulty;
		init();
	}
	
	public void init(){
		title = topic + " Quiz!";
		diff = "Difficulty: " + difficulty;
		
		String[] questions = new String[length];
		String[] answers = new String[length * 4];
		
		drawScene();
	}
	
	public void drawScene(){
		
		Label Title = new Label(title);
		Label Difficulty = new Label(diff);
		Title.setPadding(new Insets(25, 0, 0, 50));
		Difficulty.setPadding(new Insets(5, 10, 50, 50));
		
		
		overall = new GridPane();
		overall.getChildren().addAll(Title, Difficulty);
		overall.setStyle("-fx-background-color: #ffc299");
		GridPane.setConstraints(Title, 0, 0);
		GridPane.setConstraints(Difficulty, 1, 0);
		Title.setStyle("-fx-font-size: 40px;");
		Difficulty.setStyle("-fx-font-size: 30px; -fx-float: right");
		
		arrays();
		
		scene = new Scene(overall, QuizWriterV2.WIDTH, QuizWriterV2.HEIGHT);
		
	}
	
	public void arrays(){
		
		VBox cells[] = new VBox[length];
		Label questionLabels[] = new Label[length];
		TextField questionField[] = new TextField[length];
		
		TextField answerField[] = new TextField[length*4];
		Menu answerMenu[] = new Menu[length];
		/*
		ToggleGroup[] answerToggle = new ToggleGroup[length];
		RadioMenuItem[] radioArray = new RadioMenuItem[length*4];
		int counter = 0;
		for(int i=0; i<length; i++){
			//RadioMenuItem[counter] = 
		}
		*/
		
		
		
	}
	
	
}

