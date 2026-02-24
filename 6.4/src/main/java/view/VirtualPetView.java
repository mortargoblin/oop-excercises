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
  private final int CANVAS_SIZE = 600;
  private GraphicsContext gc;
  private Canvas canvas;
  private Image image;
  private VirtualPetController controller;
  private Pet pet;

  @Override
  public void start(Stage window) {
    window.setTitle("Virtual pet");

    Group root = new Group();
    canvas = new Canvas(CANVAS_SIZE, CANVAS_SIZE);

    gc = canvas.getGraphicsContext2D();

    root.getChildren().add(canvas);
    
    pet = new Pet(100, 100);
    controller = new VirtualPetController();
    canvas.setOnMouseMoved(event -> {
      System.out.printf("X: %f, Y: %f\n", event.getX(), event.getY());
      // controller.setPet(pet, (int) event.getX(), (int) event.getY());
      controller.movePet(
          pet, (int)(event.getX() - pet.x), 
          (int)(event.getY() - pet.y)
          );
      updateCanvas();
    });

    image = new Image("majava.png");
    updateCanvas();

    Scene scene = new Scene(root);
    scene.setFill(Color.BLACK);

    window.setScene(scene);
    window.show();
  }

  private void updateCanvas() {
    System.out.printf("PET X: %d, Y: %d\n", pet.x, pet.y);
    gc.clearRect(0,0, CANVAS_SIZE, CANVAS_SIZE);
    gc.drawImage(image, pet.x, pet.y);
  }
}
