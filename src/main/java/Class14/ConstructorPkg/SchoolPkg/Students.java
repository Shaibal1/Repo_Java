package Class14.ConstructorPkg.SchoolPkg;

public class Students {

    private String name = "", city = "";
    private int age = 0;


    // method

    /* takeAdmission
            name, age, city,
            name. age
    */
    public Students (String sName,int sAge, String sCity)
    {
        name = sName;
        age = sAge;
        city = sCity;
    }

    public Students (String sName,int sAge)
    {
        name = sName;
        age = sAge;
    }

    public Students ()
    {
        System.out.println("Ghost student");
    }

    public void enroll (String sName,int sAge, String sCity)
    {
        name = sName;
        age = sAge;
        city = sCity;
    }

    public void enroll (String sName,int sAge)
    {
        name = sName;
        age = sAge;
    }

    /* updateCity
           newCityName
     */
    public void updateCity(String newCity)
    {
        city = newCity;
    }

   /* updateName
           newName
     */

    public void updateName(String newName)
    {
        name = newName;
    }

    /*
       showProfile
            Name: ABCD
            Age: xx
            if present, City: YYYY
    */

    public void showProfile()
    {
        System.out.println("Name : "  + name);
        System.out.println("Age : " + age);

        if (city.length() > 0)
        {
            System.out.println("City : " + city);
        }

    }

}
