package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import model.Pet;
import controller.VirtualPetController;

public class VirtualPetView extends Application {

  @Override
  public void start(Stage window) {
    window.setTitle("Virtual pet");

    Group root = new Group();
    Canvas canvas = new Canvas(480, 640);

    // gc != garbage collector :DD
    GraphicsContext gc = canvas.getGraphicsContext2D();

    root.getChildren().add(canvas);

    canvas.setOnKeyPressed(event -> {
      // lambda
    });
    canvas.setOnMouseMoved(event -> {
      // lambda
    });

    updateCanvas();
    Image petPic = new Image("hamsteri.png");

    Scene scene = new Scene(root);
    scene.setFill(Color.BLACK);

    window.setScene(scene);
    window.show();
  }

  private void updateCanvas() {
  }
}
