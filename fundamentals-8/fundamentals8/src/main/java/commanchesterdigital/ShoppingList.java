package commanchesterdigital;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingList {

    public ArrayList<String> shoppingListArr = new ArrayList<>();

    public void addItem (String itemToAdd){
        shoppingListArr.add(itemToAdd);

    }

    public void removeItem(String itemToRemove){
        shoppingListArr.remove("Apples");

    }

    public void updateItem(int index, String newValue){
        shoppingListArr.set(0, "Strawberries");
    }

    public void retrieveItem(){

    }
}


