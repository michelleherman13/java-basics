import java.util.Map;
import java.util.HashMap;

//similar to dictionaries in python
//retrieval is quickly and in constant time
//unique values only

public class MapDemos {
    public static void main(String [] args) {

        Map m = new HashMap();
        m.put("Michelle", "Java");
        m.put("Tyler", "Python");
        m.put("Hannah", "SQL");
        m.put("Kathryn", "C");

        //m.containsValue("b"); // will check if this value is contained in the map somewhere
        //m.containsKey("Michelle"); //
        //m.clear();


        System.out.println(m); //prints entire map library
        //System.out.println(m.get("Michelle")); //will retrieve value based on key
       // System.out.println(m.values()); //prints only map values


    }
}
