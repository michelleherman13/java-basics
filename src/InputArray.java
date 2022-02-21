import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i < names.length; i++) {
            System.out.print("Enter Name Here: ");
            String input = sc.nextLine();
            names[i]=input;
        }
        for (String n:names) {
            System.out.println(n);
            if (n.equals("name")) { //this example shows how to exit the loop once you meet a condition
                break;              //for example, if the user inputs "name", then nothing else will be printed
                                    //after the first time name is printed out (loop exited).

            }
        }
    }
}
