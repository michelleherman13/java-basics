public class Cat extends Dog { //extends keyword will inherit the attributes/properties from the "super" or parent class Dog

    private int food; //newly added to Cat class only
    public Cat(String name, int age, int food) { //inherited properties from Dog class- can add more as needed
        super(name, age);
        this.food =food;
    }
    public void eat(int x) {
        this.food -=x;
    }


}

