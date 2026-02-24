package controller;

import model.Pet;
// import view.VirtualPetView;

public class VirtualPetController {
  private final double SPEED = 0.01;
  
  public void movePet(Pet pet, int dx, int dy) {
    pet.x += (int)(dx * SPEED);
    pet.y += (int)(dy * SPEED);
  }
  public void setPet(Pet pet, int dx, int dy) {
    pet.x = dx;
    pet.y = dy;
  }
}
