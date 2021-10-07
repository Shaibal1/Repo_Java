package Class15.Constructor_Inheritance;

public class CClass extends PClass {

    public CClass (){
        System.out.println("Inside CClass Constructor");
    }

    String childName = "Child";

    public void printChildName() {
        System.out.println("Name : " + childName);
    }

    public void myChildMethod() {
        System.out.println("Inside Child Method");
    }
}