//Imports & Packages
import java.util.Scanner;

//a package must be the first non-commented line in a .java file
// it declares the package where the class will reside

// format this way: package.name.Class to import a single class
// import package.name.*; to import the whole package

//example of importing the Scanner to get user input

//java.util is the package and Scanner is a class of that package

class ImportExample {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine(); //nextLine is a method found in the documentation
        System.out.println("Username is: " + userName);
    }
}
// https://docs.oracle.com/javase/tutorial/java/package/usepkgs.html //for package & imports
// https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html for scanner util


//************
// Constructors

// A constructor is a special method used to initialize objects.
// It is called when an object of a class is called
// can be used to set initial values for object attributes

// All Classes have constructors by default-if you do not create one, Java will create one for you
// Constructor name must match the class name, and cannot have a return type


