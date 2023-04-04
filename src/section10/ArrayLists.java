package section10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name,"DAIRY", 1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s", count,name.toUpperCase(), type);
    }

}
public class ArrayLists {

    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk"); // När jag använder .set så kan jag ersätta det som finns på i listan på den platsen i arrayen.
        groceryArray[1] = new GroceryItem("apples","PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yoghurt");


        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("oranges","PRODUCE",5));
        System.out.println(groceryList);
        groceryList.set(0,
                new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);

        System.out.println(groceryList);

    }
}

