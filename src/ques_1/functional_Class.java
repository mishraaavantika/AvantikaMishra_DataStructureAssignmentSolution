package ques_1;

import java.util.Collections;
import java.util.LinkedList;

public class functional_Class {

    // to store the list in another list and
    // calling the inbuilt sorting function to sort the
    // list in descending order

    LinkedList<Integer> descendingOrder(LinkedList<Integer> floors) {
        int n = floors.size();
        LinkedList<Integer> desc_array = new LinkedList<>();
        desc_array = (LinkedList<Integer>) floors.clone();
        desc_array.sort(null);
        Collections.reverse(desc_array);
        return desc_array;
    }


    void floorConstruction(LinkedList<Integer> floors) {
        LinkedList<Integer> array = descendingOrder(floors);
        int day = 1, j = 0;
        System.out.println("The order of construction is as follows");

        // a temporary list to store the already traversed elements
        // after the comparison
        LinkedList<Object> temp_list = new LinkedList<>();


        //working function
        while (!floors.isEmpty()) {
            if (floors.peek() == array.get(j)) {
                System.out.print("Day " + day + " : \n" + floors.peek());
                j++;
                day++;
                floors.removeFirst();

                if (!temp_list.isEmpty()) {
                    temp_list.sort(null);
                    Collections.reverse(temp_list);
                }

                while (!temp_list.isEmpty() && (array.get(j) == temp_list.peek())) {
                    System.out.print(" " + array.get(j));
                    j++;
                    temp_list.removeFirst();
                }
                System.out.println();
            } else {
                temp_list.add(floors.peek());
                System.out.println("Day " + (day) + ":    ");
                floors.removeFirst();
                day++;
            }
        }
    }

}
