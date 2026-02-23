package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import controller.CurrencyConverterController;

public class CurrencyConverterView extends Application {
  private Label resultField = new Label("result");
  private CurrencyConverterController controller = new CurrencyConverterController();

  @Override
  public void start(Stage window) {

    resultField.setMinWidth(40);

    TextField inputField = new TextField();
    Button modeToggle = new Button("euro to dollar");
    Button convert = new Button("convert");

    VBox layout = new VBox();

    layout.getChildren().add(inputField);
    layout.getChildren().add(resultField);
    layout.getChildren().add(modeToggle);
    layout.getChildren().add(convert);

    window.setTitle("Currency converter");
    modeToggle.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent envent) {
        controller.toggleMode();
        if (controller.getMode()) {
          modeToggle.setText("dollar to euro");
        } else {
          modeToggle.setText("euro to dollar");
        }
      }
    });

    convert.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent envent) {
        try {
          double result = controller.convert(Double.parseDouble(inputField.getText()));
          resultField.setText(String.valueOf(result));
        } catch (Exception e) { // :DDD
          resultField.setText("invalid input");
        }
      }
    });

    Scene view = new Scene(layout);

    view.getStylesheets().add("style.css");
    window.setScene(view); 
    window.show();
  }
}
