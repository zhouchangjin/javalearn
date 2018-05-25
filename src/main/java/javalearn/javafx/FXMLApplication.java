package javalearn.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLApplication extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("plan");
	       Pane myPane = (Pane)FXMLLoader.load(getClass().getResource
	    ("Plan.fxml"));
	       Scene myScene = new Scene(myPane);
	       primaryStage.setScene(myScene);
	       primaryStage.show();
//	       toDay.setOnMouseClicked(event->{
//	    	   System.out.println("����˽���");
//	       });
//	       toDay.setOnMouseClicked(new EventHandler<Event>() {
//
//			@Override
//			public void handle(Event arg0) {
//				// TODO Auto-generated method stub
//				System.out.println("�������");
//			}
//		});
	}

}
