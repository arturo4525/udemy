package section10;

import java.util.LinkedList;
import java.util.List;

public class ArralistAndLinkedlist {

    public static void main(String[] args) {

        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.add("Darwin");
        list.add("Hobart");

        //Queue methods.
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " Was removed");

        String s2 = list.remove(); // removes first element
        System.out.println(s2 + " Was removed");

        String s3 = list.remove(); // removes first element
        System.out.println(s3 + " Was removed");

        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " Was removed");

        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " Was removed");

        String p3 = list.pollLast(); // removes first element
        System.out.println(p3 + " Was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed");

    }
}
