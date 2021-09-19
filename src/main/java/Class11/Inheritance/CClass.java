package Class11.Inheritance;

public class CClass extends PClass {

    String childName = "Child";

    public void printChildName() {
        System.out.println("Name : " + childName);
    }

    public void myChildMethod() {
        System.out.println("Inside Child Method");
    }
}