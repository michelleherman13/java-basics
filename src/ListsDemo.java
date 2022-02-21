import java.util.ArrayList;

// Array List is similar to a normal array but elements can be added; it is dynamic but slower than array
// it is similar to a set in the way that elements can be added to it
// can be indexed
//does not need to be unique
//Linked lists are similar


public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList <Integer>();
        t.add(1); //add element to array list
        t.add(2);
        t.add(4);
        t.add(1);
        t.add(3);
        t.get(0); //grab item at the index's position (1 in this example)
        t.set(1,5);// Change index// t.set(index, element)//element 5 will be at index 1
        t.subList(1,3); //will retrieve from index range of arguments// t.subList(0,0)

        System.out.println(t.size()); //prints size of Array List
        System.out.println(t.isEmpty()); //prints if Array List is empty or not
        System.out.println(t); //prints entire Array List
        System.out.println(t.subList(1,3)); //retrieves from index 1 to index 3
    }

}
