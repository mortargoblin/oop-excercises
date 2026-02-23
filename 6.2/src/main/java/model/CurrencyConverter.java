package model;

public class CurrencyConverter {
  private boolean mode = false;

  public void toggleMode() {
    mode = !mode;
  }
  public boolean getMode() {
    return mode;
  }
  private double euroToDollar(double euro) {
    return euro * 1.18; // rate as of 23.2.26 :D
  }
  private double dollarToEuro(double dollar) {
    return dollar * 0.85; // rate as of 23.2.26 :D
  }
  public double convert(double money) {
    if (mode == false) {
      return euroToDollar(money);
    } else {
      return dollarToEuro(money);
    }
  }

}
