package model;

// import javafx.scene.image.Image;

public class Pet {
  // private Image image;
  private int pos_x;
  private int pos_y;

  public Pet(int pos_x, int pos_y) {
    // this.image = image;
    this.pos_x = pos_x;
    this.pos_y = pos_y;
  }

  public void move(int delta_x, int delta_y) {
    pos_x += delta_x;
    pos_y += delta_y;
  }

  public int getX() {
    return pos_x;
  }

  public int getY() {
    return pos_y;
  }
}
