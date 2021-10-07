package Class15.InterfacePkg.CarInterface;

public class FordFactory implements CarGuidelines,EnvGuideLines
{

    public void addSteering()
    {

    }

    public void addEngine()
    {
        System.out.println("Basic Engine");
    }

    public void premiumSeating()
    {
        System.out.println("Premium seats added");
    }


    public void zeroEmission()
    {
        System.out.println("Zero emission when stop");
    }
}
