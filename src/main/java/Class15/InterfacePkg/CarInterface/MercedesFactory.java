package Class15.InterfacePkg.CarInterface;

public class MercedesFactory implements CarGuidelines, EnvGuideLines
{

    public void addSteering()
    {

    }


    public void addEngine()
    {
        System.out.println("Best Engine");
    }

    public void premiumServicing()
    {
        System.out.println("Premium Servicing");
    }


    public void zeroEmission()
    {
        System.out.println("Merc - Zero emission when driving below 10 mph");
    }
}
