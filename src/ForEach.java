//for each loop goes through each element in the array
public class ForEach {

    public static void main(String[] args) {
        int [] arr = {1,5,7,3,5,5};

        //use loop to check for element and index for each

        int count = 0; //counter to keep track of index

        for (int element:arr) {
            System.out.println(element + " is at index: " + count);
            count++;
        }
    }

}
