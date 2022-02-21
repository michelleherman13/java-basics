import java.util.HashSet;
import java.util.Set;

public class HashSetdemo {

    public static void main(String [] args) {

        Set<Integer> t = new HashSet<Integer>(); //Hash set stores unique values and is UNORDERED // Tree set is ORDERED
        t.add(5);
        t.add(100);
        t.add(55);
        t.add(341);
        t.add(22);
        t.add(0);
        //t.remove(element); removes element from set
        //t.clear(); removes everything from set
        //t.isEmpty(); will check if list is empty
        //t.size(); checks size of set

        boolean x = t.contains(55); //check to see if set contains 55

        System.out.println(x); //will print true if the set contains x
    }
}

