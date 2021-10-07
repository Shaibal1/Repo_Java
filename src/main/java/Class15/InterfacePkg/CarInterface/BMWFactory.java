package Class15.InterfacePkg.CarInterface;

public class BMWFactory implements CarGuidelines
{
    public void addSteering()
    {
        System.out.println("BMW Special Steering");
    }


    public void addEngine()
    {
        System.out.println("Sport Engine");
    }


    public void premiumEngine()
    {
        System.out.println("Premium Engine Added");
    }


}
