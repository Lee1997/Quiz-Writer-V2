package main;

import javafx.application.Application;
import javafx.stage.Stage;

public class QuizWriterV2 extends Application{
	
	public static QuizWriterV2 qw;
	public StartScene startScene;
	public Stage window;
	
	public static final int WIDTH = 800, HEIGHT = 800;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		startScene = new StartScene(window);
		window.setTitle("Lee's Quiz Writer V2");
		window.setScene(startScene.initScene);
		
		window.show();
	}
}
