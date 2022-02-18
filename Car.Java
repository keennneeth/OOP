
public class Car 
{

String Make;
String Model;
int Year;



public Car(String mk, String mod, int yr)
{
this.Make = mk;
this.Model = mod;
this.Year = yr;

}


public void SetMake (String mk)
{
    Make = mk;
}

public String GetMake()

{

return Make;

}

public void SetModel (String mod)
{
    Model = mod;
}

public String GetModel()
{
return Model;
}

public void SetYear(int yr)
{

    Year = yr;
}

public int GetYear()
{

    return Year;
}

}
