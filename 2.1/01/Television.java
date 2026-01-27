public class Television {
  private boolean on = false;
  private int channel = 1;

  public void setChannel(int selection) {
    if (on) {
      if (selection > 10) {
        selection = 1;
      }
      channel = selection;
    }
  }

  public int getChannel() { return channel; }
  public boolean isOn() { return on; }

  public void pressOnOff() {
    on = !on;
  }
}
