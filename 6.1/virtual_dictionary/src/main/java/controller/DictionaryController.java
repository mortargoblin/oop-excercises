package controller;

import model.Dictionary;

public class DictionaryController {
  private Dictionary dictionary = new Dictionary();

  public String getDefinition(String word) {
    String result = dictionary.getDefinition(word);
    if (result != null) {
      return result;
    } else {
      return "not found";
    }
  }
  public void addEntry(String word, String definition) {
    dictionary.addEntry(word, definition);
  }
}
