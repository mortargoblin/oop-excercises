package controller;

import model.CurrencyConverter;

public class CurrencyConverterController {
  private CurrencyConverter converter = new CurrencyConverter();

  // stupid boilerplate
  public void toggleMode() {
    converter.toggleMode();
  }
  public boolean getMode() {
    return converter.getMode();
  }

  public double convert(double money) {
    return converter.convert(money);
  }

}
