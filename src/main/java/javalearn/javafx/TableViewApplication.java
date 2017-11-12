package javalearn.javafx;

import java.util.ArrayList;
import java.util.Date;

import com.sun.javafx.collections.ObservableListWrapper;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ModifiableObservableListBase;
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
		
		ArrayList<Plan> plist=new ArrayList<>();
		Plan p=new Plan();
		p.setPlanItem("haha");
		p.setPlanScore(2);
		p.setTime(new Date());
		p.setIsFinished(false);
		plist.add(p);
    	ObservableList<Plan> list=FXCollections.observableArrayList(plist);
    	Pagination pagin=new Pagination();
    	pagin.setPageFactory(new Callback<Integer, Node>() {
			@Override
			public Node call(Integer param) {
				// TODO Auto-generated method stub
				System.out.println(param+"================");
				
				return null;
			}
		});
    	TableView<Plan> tabl=new TableView<Plan>(list);
    	tabl.setMaxHeight(200);
    	TableColumn pNameCol = new TableColumn("Plan Name");
        TableColumn scoreCol = new TableColumn("plan Score");
        TableColumn dateCol = new TableColumn("Date");
        pNameCol.setCellValueFactory(new PropertyValueFactory<Plan,String>("planItem"));
        scoreCol.setCellValueFactory(new PropertyValueFactory<>("planScore"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        tabl.getColumns().addAll(pNameCol,scoreCol,dateCol);
		pane.getChildren().add(tabl);
		pane.getChildren().add(pagin);
		
		for(int i=0;i<100;i++){
			Plan p2=new Plan();
			p2.setPlanItem("xxx");
			p2.setPlanScore(i);
			list.add(p2);
		}
		
		//tabl.setItems(list);
		
	}

}
