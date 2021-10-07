package Class15.Constructor_Inheritance;

public class PClass extends GClass{

    public PClass (){
        System.out.println("Inside PClass Constructor");
    }

    String parentName = "Parent";

    public void printParentName(){
        System.out.println("Name : " + parentName);
    }

    public void myParentMethod(){
        System.out.println("Inside Parent Method");
    }

    public void sayHello(){System.out.println("Hello from Parent class");}

}