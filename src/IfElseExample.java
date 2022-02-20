public class IfElseExample {

    public static void main(String[] args) {

        int number = 5;

        if (number % 2 == 0) //block of logic that if true
            System.out.println("The number " + number + " is even"); //will execute the statement & skip
            //the else block
        else
            System.out.println("The number " + number + " is odd"); //if it is false it will jump to
        //the next statement
    }
}