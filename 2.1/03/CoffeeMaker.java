public class CoffeeMaker {
  private String type;
  private int amount; // amount in ml
  private boolean on = false;

  public String getType() { return type; }
  public int getAmount() { return amount; }
  public boolean getOnOffState() { return on; }
  public void toggleOnOffState() { on = !on; }

  public void setType(String typeSelection) {
    if (on) {
      type = typeSelection;
    }
  }

  public void setAmount(int amountSelection) {
    if (on && amountSelection >= 10 && amountSelection <= 80) {
      amount = amountSelection;
    }
  }
}
