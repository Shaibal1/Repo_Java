package Class14.ConstructorPkg;

public class MyMain
{
    public static void main(String[] args)
    {
     MyConstructor mc = new MyConstructor();
     MyConstructor mc2 = new MyConstructor(5);
     MyConstructor mc3 = new MyConstructor("hello");


     /*
      * During the run time:
      * 1. Java checks if MyConstructor has a Constructor method
      * 2. If Constructor method is present, runs it
      *    else, create a default Constructor method and runs it
      *
      * Default Constructor --> constructor with no parameter and no code
      *
      *
      *
      * */

        // MyConstructor.sayHello();

        // MyConstructor.sayHello("abcd");




    }
}
