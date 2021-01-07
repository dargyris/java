import java.util.ArrayList;

public class GroceryList {
    // The private ArrayList variable groceryList REFERENCE is initialized.
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println("Item already in the list.");
            return;
        }
        groceryList.add(item);
        System.out.println("Successfully added " + item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        if (groceryList.contains(newItem)) {
            System.out.println("Item already there.");
            printGroceryList();
            return;
        } else {
            if (groceryList.contains(oldItem)) {
                int position = groceryList.indexOf(oldItem);
                groceryList.set(position, newItem);
                System.out.println(oldItem + " has been modified.");
                return;
            }
        }
        System.out.println("Bad input.");
    }

    public void removeGroceryItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Successfully removed " + item);
        } else {
            System.out.println(item + " not found in the list.");
        }
    }

    public void findItem(String item) {
        int position = groceryList.indexOf(item);
        if (position >= 0) {
            System.out.println(item + " was found in the list. (position: "
                    + position + ")");
            return;
        }
        System.out.println(item + " was not found in the list.");
    }

    public static void main(String[] args) {

    }
}
