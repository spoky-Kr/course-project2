package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class regController {
	@FXML
	private Button registr;
	 @FXML
	 private Button Vhod;
	 
	// Event Listener on Button[#registr].onAction
	@FXML
	public void onREGIST(ActionEvent event) {
		// TODO Autogenerated
		 try {
			 
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("AddUser.fxml"));
				Scene scene = new Scene(root,220,230);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.stage.setScene(scene);
				Main.stage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	// Event Listener on Button[#exit].onAction
	 @FXML
	    void onVhod(ActionEvent event) {
		 try {
			 
				BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("glTable.fxml"));
				Scene scene = new Scene(root,700,500);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.stage.setScene(scene);
				Main.stage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		 
		}

	    }



