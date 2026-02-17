package model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
  private HashMap<String, String> dictionary = new HashMap<>();

  // arbitrary entries
  public Dictionary() {
    HashMap<String, String> entries = new HashMap<>(Map.of(
            "car", "a four-wheeled road vehicle that is powered by an engine and is able to carry a small number of people",
            "airplane", "a powered flying vehicle with fixed wings and a weight greater than that of the air it displaces; an aeroplane",
            "boat", "a small vessel for travelling over water, propelled by oars, sails, or an engine",
            "bicycle", "a vehicle consisting of two wheels held in a frame one behind the other, propelled by pedals and steered with handlebars attached to the front wheel"
          ));
    for (Map.Entry<String, String> entry : entries.entrySet()) {
      addEntry(entry.getKey(), entry.getValue());
    }
  }

  public void addEntry(String word, String meaning) {
    dictionary.put(word, meaning);
  }

  public String getDefinition(String word) {
    return dictionary.get(word);
  }
}
