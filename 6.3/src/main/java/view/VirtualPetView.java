package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import model.Pet;
import controller.VirtualPetController;

public class VirtualPetView extends Application {
  // gc != garbage collector :DD
  private GraphicsContext gc;
  private Canvas canvas;
  private Image petPic;
  private VirtualPetController controller;
  private Pet pet;

  @Override
  public void start(Stage window) {
    window.setTitle("Virtual pet");

    Group root = new Group();
    canvas = new Canvas(640, 480);

    gc = canvas.getGraphicsContext2D();

    root.getChildren().add(canvas);

    canvas.setOnKeyPressed(event -> {
    });
    canvas.setOnMouseMoved(event -> {
      System.out.printf("X: %f, Y: %f\n", event.getX(), event.getY());
    });

    pet = new Pet(100, 100);
    petPic = new Image("majava.png");
    updateCanvas();

    Scene scene = new Scene(root);
    scene.setFill(Color.BLACK);

    window.setScene(scene);
    window.show();
  }

  private void updateCanvas() {
    gc.drawImage(petPic, pet.getX(), pet.getY());
  }
}
