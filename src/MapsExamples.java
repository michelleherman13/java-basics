//this example uses a hash map and a for loop to count the characters in a string

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {

    public static void main(String[] args) {
    Map m= new HashMap();
    String str = "My name is Michelle and I have two boxer dogs";

    //looping through every letter in string
    for(char x:str.toCharArray()) { //converting to char Array
        if (m.containsKey(x)) {
            int old = (int)m.get(x);
            m.put(x, old+1);

        }
        else {
            m.put(x,1);
        }
    }
    System.out.println(m); // will print the number of characters per each letter including spaces
}

}