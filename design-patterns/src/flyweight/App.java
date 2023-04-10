package flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FlowPane pane = new FlowPane();

			pane.setBorder(BorderFactory.INSTANCE.getBorder());

			pane.setVgap(6);
			pane.setHgap(5);
			pane.setPrefWrapLength(2);
			pane.getChildren().add(new Button("Start"));
			pane.getChildren().add(new Button("Stop"));

			Button reset = new Button("Reset");
			reset.setBorder(BorderFactory.INSTANCE.getBorder());

			pane.getChildren().add(reset);
			pane.getChildren().add(new Text("Samat kehykset = " + (pane.getBorder() == reset.getBorder())));

			Scene scene = new Scene(pane, 400, 400);

			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void startApplication(String[] args) {
		launch(args);
	}
}
