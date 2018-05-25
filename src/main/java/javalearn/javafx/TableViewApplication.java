package javalearn.javafx;

import java.util.ArrayList;
import java.util.Date;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;

public class TableViewApplication extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Table view");
		StackPane pane=new StackPane();
		Scene scene=new Scene(pane,500,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Pagination pagin=new Pagination();
    	
		TableView<Plan> tabl=new TableView<Plan>();
		TableColumn pNameCol = new TableColumn("Plan Name");
        TableColumn scoreCol = new TableColumn("plan Score");
        TableColumn dateCol = new TableColumn("Date");
        pNameCol.setCellValueFactory(new PropertyValueFactory<Plan,String>("planItem"));
        scoreCol.setCellValueFactory(new PropertyValueFactory<>("planScore"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        tabl.getColumns().addAll(pNameCol,scoreCol,dateCol);
        
    	pagin.setPageFactory(new Callback<Integer, Node>() {
			@Override
			public Node call(Integer param) {
				// TODO Auto-generated method stub
				System.out.println(param+"================");
				ArrayList<Plan> plist=new ArrayList<>();
				Plan p=new Plan();
				p.setPlanItem("haha");
				p.setPlanScore(2);
				p.setTime(new Date());
				p.setIsFinished(false);
				plist.add(p);
		    	ObservableList<Plan> list=FXCollections.observableArrayList(plist);
		    	tabl.setItems(list);
				return tabl;
			}
		});
    	pane.getChildren().add(pagin);
    	
		
		//tabl.setItems(list);
		
	}

}
