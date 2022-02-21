// Demo to learn more about Classes

public class Dog {
    // declaration of attributes

    private String name; // private so it is only accessible within the class
    private int age;

    //constructor method typically only create one-(will run automatically whenever we call dog class)

    public Dog(String name, int age) { //parameters within parentheses for whenever we create dog object (ok to be blank)
    this.name = name; //"this" keyword references the attributes in the class above
    this.age = age;
    }
public void speak() {
        System.out.println("I am  " + this.name + " and I am " + this.age + " years old!");
}

}
