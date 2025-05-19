
//What is?
/*
AN Object - Concrete Instance of a class - NOUN- Person, Place Thing, Idea
A Class - Blueprint/Template for an Object - Our keyword for creating an object

Encapsulation - What happen in vegas stays in vegas. Hide the internal detail
keeping private things private. Code and data together?
Inside the walls. Like a Cell in biology. Hiding the internal details.

How do we create an instance?
var myInstance = new ClassName();

What code gets called when we use new?
The *constructor* - which  we see in the class as
the same name of the class.
We can see its not a method because all methods have...
No return type.

Polymorphism ( Many Shapes? )- in Java
Signature is different i.e. method name and parameter data types.
They are said to be "overloaded"

what is "this"? What des it refer to?

what is instantiation? what keyword would create an instance? new

how do we create a subclass? what is the keyword?

what kind of methods would a utitity class that is,
a collection of self contained (do not share data) methods be?
static - means un changing immutable
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

abstract class Mammal{} //what does the word abstract restrict or prevent?
//cant be instantiated?


class Person extends Mammal{
    final int SSN; //immutable (cannot be changed) - mutation -> change
    private String name; //how can we allow reading changing name if its private?
    Person(int ssn) {
        super();//what does this do? Calls the parent/super-class
        // if the parent does not have a constructor it call the one in
        //global base class for all java classes is Object.
        SSN = ssn;
    }
    Person(int ssn, String name) {
        SSN = ssn;
        this.name = name; //This refers to the instance. Current Object.
    }

//    getArea(Square shape){}
//    getArea(Circle shape){}
}
public class Review {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.get(1));
        //how can we print Banana from the second item? Hint is its not [1]
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.getHour()); //9? current local hour

        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfMonth()); //19? day of the month locally.
    }
}
//what follows a "try" block? "catch(Error e)"