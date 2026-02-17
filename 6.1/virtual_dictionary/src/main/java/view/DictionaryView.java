package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import controller.DictionaryController;

public class DictionaryView extends Application {
  private Label result = new Label();
  private DictionaryController controller = new DictionaryController();

  public void start(Stage window) {
    FlowPane group = new FlowPane();
    TextField inputField = new TextField();
    Button searchBtn = new Button("Search");
    
    result.setMinWidth(100);

    group.getChildren().add(inputField);
    group.getChildren().add(searchBtn);
    group.getChildren().add(result);

    Scene view = new Scene(group);
    window.setTitle("My Greeting Application");
    window.setScene(view);
    window.show();

    searchBtn.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        // result.setText(inputField.getText());
        result.setText(controller.getDefinition(
              inputField.getText().toLowerCase()
              ));
      }
    });

    window.show();
  }
}
