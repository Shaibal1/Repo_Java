package HomeWork;
import java.util.Scanner;
public class HW2 {
    /**
     * Convert Temperatures and display the respective results.
     * eg;
     * <p>
     * fT = cT  x 9/5 + 32
     * <p>
     * double cTemp = 21.11;
     * double fTemp = cTemp * 9/5 + 32;
     * System.out.println(cTemp + "°C = " + fTemp + "°F");
     * <p>
     * HW 2:    C ---> F    | F ---> C   | C ---> K  | K ---> C   |  F ---> K|   K ---> F   |   //fT = cT  x 9/5 + 32
     */

    public static void main(String arg[])
    {
        System.out.println("Temperature Conversion for:\n");
        double tCelsius = 21;
        double tFahrenheit = tCelsius *9/5+32;

        System.out.println(tCelsius + "°C = " + tFahrenheit + "°F\n");

        double tempFahrenheit = 100;
        double tempCelsius = (tempFahrenheit-32)*5/9;
        System.out.println(tempFahrenheit + "°F = " + tempCelsius + "°C\n");

        double temperatureCelsius = 55;
        double temperatureKelvin =  temperatureCelsius + 273.15;
        System.out.println(temperatureCelsius + "°C = " + temperatureKelvin + "°K\n" );

        double tmpKelvin = 300;
        double tmpCelsius = tmpKelvin - 273.15;
        System.out.println(tmpKelvin + "°K = " + tmpCelsius + "°C\n");

        double tmpFAHRENHEIT = 10;
        double tKELVIN = (tmpFAHRENHEIT - 32) * 5/9 + 273.15;
        System.out.println(tmpFAHRENHEIT + "°F = " + tKELVIN + "°K\n");

        double tEMPKelvin = 555;
        double tEMPFahrenheit = (tEMPKelvin - 273.15) * 9/5 + 32;
        System.out.println(tEMPKelvin + "°K = " + tEMPFahrenheit + "°F\n");








    }
}







