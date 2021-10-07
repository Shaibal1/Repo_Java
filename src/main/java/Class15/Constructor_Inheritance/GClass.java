package Class15.Constructor_Inheritance;

public class GClass
{
    String gParentName = "Parent";

    public GClass () { System.out.println("Inside GClass Constructor"); }

    public void printParentName(){
        System.out.println("Name : " + gParentName);
    }

}
