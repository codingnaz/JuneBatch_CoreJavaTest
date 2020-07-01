public class Answers {
    /*
What is a Class and what is an Object?

=>>class is the blueprint for the object. A class defines object properties.


What is a constructor and what are their types ?


=>> a constructor is a special type of function/method.
 It is called with the "new" keyword to create an instance of an object.

Write the code for a public default constructor for a class called " Office "
????=> What do you mean "public" default constructor?

==>
public class Office{
    //public Office(){} //this would be user-defined Constructor
    //if not user-defined Constructor exits Java compiler provides a default constructor by default
}

What does the implements keyword do?
=>> The implements keyword is used to implement an interface

What three places is the final keyword used in?

==> data (like PI), methods(cannot be overridden by subclasses) and for a class (immutable class/Objects)

Name the 4 concepts of object-oriented Programming
==>encapsulation, abstraction, inheritance and polymorphism


What is the first thing that runs when a class is instantiated?
=> these are the steps happens when a class is instantiated.
1.Memory is allocated for the object.
2. Various constructors are executed from "Object" to the actual class's
3.By this time Object should have memory for it and it's being initialized by the constructors, not created
4. until the constructors are finished executing, objects are not useable.


a) when a method is overloaded ,is it in the same class,or a different class?
==>same method name but different argument lists in the same class.
b) can it have the same Parameters
NO.
What is the different between Interface & Abstract ?
==>>
Abstract class extends but interface implements
Interface can have only abstract methods. Abstract class can have abstract and non-abstract methods.
Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
Abstract class can have final, non-final, static and non-static variables. Interface has only static and final variables.
An interface can extend another interface only, an abstract class can extend another Java class and implement multiple Java interfaces.

what does the void keyword mean? Where is it used??
=>it just indicates that the method/ function does not return any type of value. It just does things.

What is overloading? How is it done?
=>same method name but different argument lists in the same class.
How do you override a static method in java?
==>can not override static method in Java but you can use "method hiding" to define a method.

Write a for each loop(also called Enhanced for loop)Which iterates over a collection called “allVehicles” which contains objects of type “Vehicle”.

==>>
for( Vehicle x: allVehicles){
//do whatever
}

a)What are access modifiers in Java? b)What is the difference between a local variable and an instance variable?

==>>Default,Private, Protected, Public
Local variables are visible only in the method/ block
instance variables can been seen by all methods in the class

a) Differentiate between the constructors and methods in Java? b)What is the difference between this() and super() in Java?


==>Constructor are called at the time of instantiation to create the object
constructors not return type but methods does need return type even if it is void
constructors are the same name as the class
default Constructor is provided by the compiler if user Define Constructor does not exist

"this" is used for current class
"super" is use to refers the super class/ parent class

What is method overloading and method overriding?With Example Program
==>  method overloading same name but different parameter sum(int s, int t), and sum(int s, int t, int f)
overriding is used to override the existing method in the superclass
@Override
    void runVehical() {
        System.out.println("Boat is Running");
    }
24). Encapsulation : Create a package called “com.exam.encapsulation”. Create a class called student with following properties/fields with getter setters.

     */
}
