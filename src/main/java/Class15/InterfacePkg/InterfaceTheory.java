package Class15.InterfacePkg;

public interface InterfaceTheory
{
    /*
    * 1. Interface looks like a class
    *
    * 2. All methods inside the Interface are abstract by default.
    *
    * 3. We can create variable of an Interface, but CANNOT create object an Interface.
    *       eg: InterfaceTheory it; <-- Allowed
    *           new InterfaceTheory(); <-- Not Allowed
    *
    * 4. A class can implement an interface using 'implements' Keyword
    *    then class has to give body to all abstract methods of Interface.
    *
    * 5. A class can implement one or more interfaces.
    *
    * 6. In the Interface variable, we can store the object of
    *    related class (directly, indirectly)
    *
    * 7. An Interface can extend another Interface
    *
    * 8. We can have normal methods in Interface, it has to be static
    *           (because, we cannot create object of an interface)
    *
    * class <--> class (Inheritance using extends keywords)
    *
    * Interface <--> Interface (Inheritance using extends keywords)
    *
    * Class <-->  Interface (using implements keyword)

                        Abstract Class vs Interface

      1. Class implements the interface, whereas Class extends Abstract class.

      2. Interface is not a class, whereas abstract-class is a class.

      3. Interface, all methods are abstract by default

      4. In Interface, to create method with body,, we have to make it static,
         whereas in Abstract-Class, we can create method with Body with/without making it static.

      */

    public void sayHello();

    public static void  sayBye()
    {
        System.out.println("Bye Bye");
    }

}
