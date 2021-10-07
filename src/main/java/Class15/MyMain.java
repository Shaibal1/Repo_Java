package Class15;

import Class15.AbstractPkg.ChildClass;
import Class15.InterfacePkg.InterfaceTheory;
import Class15.InterfacePkg.MyClass;

public class MyMain
{
    public static void main(String[] args)
    {

        //Execute sayHello() from AbstractTheory class

        /*
        * 1. create object of AbstractTheory class
        * 2. use object to execute sayHello()
        */

        ChildClass cc = new ChildClass();

        InterfaceTheory it = new MyClass();

        InterfaceTheory its = new MyClass();

        InterfaceTheory.sayBye();







    }

}
