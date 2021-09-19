package Class11.Inheritance;

public class MyMainClass {
    public static void main(String[] args) {


        //run my parentMethod
        PClass p = new PClass();
        p.myParentMethod();

        //run myChildMethod
        CClass c1 = new CClass();

        c1.printParentName();

        c1.printChildName();



    }
}
