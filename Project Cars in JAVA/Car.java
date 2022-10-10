
/**
 * Write a description of class Car here.
 *
 * @author (Anisha Rana)
 * @version ()
 */
public class Car
{
    // Declaring the attributes.
    private int CarID;
    private String CarName;
    private String CarColor;
    private String CarPrice;
    private String CarBrand;
 //Setting the constructor.    
public Car (int ID , String Name,String price,String brand){
    
this.CarID =ID;
this.CarName = Name;
this.CarPrice = price;
this.CarBrand = brand;
CarColor = "";
}
public String getCarName(){
    return CarName;
}
public String getCarPrice(){
    return CarPrice;
}
public String getCarBrand(){
    return CarBrand;
}
public int getCarID(){
    return this.CarID;
    }
    // SETTING THE CarColor.
    public void setColor (String CarColor)
    {
        this.CarColor = CarColor;
    }
    //to display the attribute values.
public void display()
{
    System.out.println("The name: "+CarName);
    System.out.println("The price: "+CarPrice);
    System.out.println("The brand:"+CarBrand);
    System.out.println("The ID:"+CarID);
    // Displays info if color is not an empty string.
    if(!CarColor.equals(""))
    {
        System.out.println("The color:"+CarColor+".");
    }
    System.out.println();
}
    
}
