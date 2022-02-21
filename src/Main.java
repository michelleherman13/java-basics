//used for dog & cat Class and Inheritance examples

public class Main {

    public static void main(String[] args) {
        Dog Hank = new Dog("Hank", 9);
        Hank.speak();

        Dog Bronson = new Dog("Bronson", 8);
        Bronson.speak();

        Cat Harry = new Cat("Harry", 18, 100);
        Harry.speak();//although no speak method was written out in the Cat Class, it was inherited through the Dog Class


    }
}
