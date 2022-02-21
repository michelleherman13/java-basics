import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int [] x = { -23, 77, 28, 37, 29, 1, 4, 0, 10069};

        Arrays.sort(x); //can take 3 arguments: array, (and index positions if you don't want to sort all of it)
        //Arrays.sort(x, 3,6); if you only want to sort from index positions 3 to 6.

        for(int i:x) //for int i in x print i
        {
            System.out.print(i + ",");
        }

    }
}
