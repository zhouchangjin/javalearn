package javalearn.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderLayoutApplication extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Border Layout");
		BorderPane borderpane = new BorderPane();
		Scene scene =new Scene(borderpane, 300, 200);
		primaryStage.setScene(scene);
		Label labelNorth=new Label();
		labelNorth.setText("Border North");
		borderpane.setTop(labelNorth);
		Label labelcenter=new Label();
		labelcenter.setText("Border Center");
		borderpane.setCenter(labelcenter);
		Label labelbot=new Label();
		labelbot.setText("Border Bottom");
		borderpane.setBottom(labelbot);
		Label labelwest=new Label();
		labelwest.setText("Border WEst");
		borderpane.setLeft(labelwest);
		primaryStage.show();
		Label labeleast=new Label();
		labeleast.setText("Border east");
		borderpane.setRight(labeleast);
	}

}
