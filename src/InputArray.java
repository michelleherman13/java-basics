import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i < names.length; i++) {
            System.out.print("User Input Here: ");
            String input = sc.nextLine();
            names[i]=input;
        }
        for (String n:names) {
            System.out.println(n);
        }
    }
}
