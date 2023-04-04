package section10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OriginalArray {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("List: " + originalList);
        System.out.println("array : " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

        //originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "monday","tuesday");
        System.out.println(newList);




    }
}
