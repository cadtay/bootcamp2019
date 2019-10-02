import commanchesterdigital.ShoppingList;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.core.IsNot.not;



public class ShoppingListTest {

    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void whenRetrevingAnItemDoesNotExsistThenReturnException() {
        ShoppingList shoppingList = new ShoppingList();

        shoppingList.shoppingListArr.remove("Apples");

    }

    @Test
    public void WhenItemAddedItCanBeRetrevied() {
        ShoppingList shoppingList = new ShoppingList();

        shoppingList.addItem("Apples");

        String newItem = shoppingList.shoppingListArr.get(0);

        Assertions.assertThat("Apples").isEqualTo(newItem);

        }

    @Test
    public void whenIndex0IsUpdated() {
        ShoppingList shoppingList = new ShoppingList();

        shoppingList.shoppingListArr.add(0, "Apples");

        shoppingList.shoppingListArr.set(0 , "Strawberry");

        Assertions.assertThat(shoppingList.shoppingListArr.get(0).equals("Strawberries"));

    }
}

