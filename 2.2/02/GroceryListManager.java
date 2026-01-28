import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
  // private ArrayList<String> groceryList = new ArrayList<>();
  private Map<String, Double> groceryList = new HashMap<>();

  public void addItem(String item, double price) {
    groceryList.put(item, price);
  }

  public void removeItem(String item) {
    groceryList.remove(item);
  }

  public void displayList() {
    for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
      System.out.printf("%s - %.2f\n", entry.getKey(), entry.getValue());
    }
  }

  public boolean checkItem(String item) {
    if (groceryList.containsKey(item)) {
      return true;
    } else {
      return false;
    }
  }
  
  public double calculateTotalCost() {
    double total = 0;
    for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
      total += entry.getValue();
    }
    return total;
  }

  public void main(String[] args) {
    addItem("Apples", 0.3);
    addItem("Oranges", 0.67);
    addItem("Milk", 2.2);

    System.out.printf("GROCERY LIST:\n");
    displayList();

    System.out.printf("\nIs \"Milk\" in the grocery list? %b\n", checkItem("Milk"));

    System.out.printf("\nRemoving \"Milk\"... \n\n");
    removeItem("Milk");

    System.out.printf("Updated list:\n");
    displayList();

    System.out.printf(
        "TOTAL COST: %.2f\n",
        calculateTotalCost()
        );
  }
}
