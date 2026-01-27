import java.util.ArrayList;

public class GroceryListManager {
  private ArrayList<String> groceryList = new ArrayList<>();

  public void addItem(String item) {
    groceryList.add(item);
  }

  public void removeItem(String item) {
    groceryList.remove(item);
  }

  public void displayList() {
    for (int i = 0; i < groceryList.size(); i++) {
      System.out.printf("%d. %s\n", i+1, groceryList.get(i));
    }
  }

  public boolean checkItem(String item) {
    if (groceryList.contains(item)) {
      return true;
    } else {
      return false;
    }
  }

  public void main(String[] args) {
    addItem("Apples");
    addItem("Oranges");
    addItem("Milk");

    System.out.printf("GROCERY LIST:\n");
    displayList();

    System.out.printf("\nIs \"Milk\" in the grocery list? %b\n", checkItem("Milk"));

    System.out.printf("\nRemoving \"Milk\"... \n\n");
    removeItem("Milk");

    System.out.printf("Updated list:\n");
    displayList();
  }
}
