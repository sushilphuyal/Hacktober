
/**
 * Write a description of class ElectricCar here.
 *
 * @author (Anisha Rana)
 * @version (a version number or a date)
 */
public class  ElectricCar extends Car
{
    //declaring the attributes.
     private String CustomerName;
     private int BatteryCapacity;
     private int BatteryWarranty;
     private String PurchaseDate;
     private String Range;
     private int RechargeTime;
     private boolean isBought;
     private boolean isSold;
     // Setting up the constructor.
    public ElectricCar(int CarID, String CarName, String CarBrand, String
   CarPrice,int BatteryCapacity)
   {
       super(CarID,CarName,CarBrand, CarPrice);
       this.BatteryCapacity = BatteryCapacity;
       CustomerName ="";
       BatteryWarranty =0;
       PurchaseDate = "";
       Range="";
       RechargeTime = 0;
       isBought = false;
       isSold = false;
    }
    public String getCustomerName()
    {
        return CustomerName;
    }
    public int getBatteryCapacity()
    {
        return BatteryCapacity;
    }
    public int getBatteryWarranty()
    {
        return BatteryWarranty;
    }
    public String getPurchaseDate()
    {
        return PurchaseDate;
    }
    public String getRange()
    {
        return Range;
    }
    public int getRechargeTime()
    {
        return RechargeTime;
    }
    public boolean getisBought()
    {
        return isBought;
    }
    public boolean getisSold()
    {
        return isSold;
    }
    public void setCustomerName(String CustomerName)
    {
        if(!isBought)
        {
            this.CustomerName = CustomerName;
        }
        else
        {
            System.out.println("the Customer is set to:"+this.CustomerName+".");
            System.out.println();
        }
    }
    public void Bought(String CustomerName,int BatteryWarranty,String PurchaseDate,String Range,int RechargeTime)
    {
        if (!isBought)
        {
            setCustomerName(CustomerName);
            this.BatteryWarranty = BatteryWarranty;
            this.PurchaseDate = PurchaseDate;
            this.Range = Range;
            this.RechargeTime = RechargeTime;
            isBought = true;
        }
        else
        {
          System.out.println("this car has already been bought with:");
          System.out.println("Customer: "+this.CustomerName);
          System.out.println("battery warrenty:"+this.BatteryWarranty);
          System.out.println("purchase date :"+this.PurchaseDate);
          System.out.println("range :"+ this.Range);
          System.out.println("recharge time:"+this.RechargeTime);
          System.out.println();
        }
    }
    //to sell the electric car.
    public void sell()
    {
        if(!isSold)
        {
            setCustomerName("");
            BatteryCapacity =0;
            BatteryWarranty=0;
            PurchaseDate = "";
            Range = "";
            RechargeTime=0;
            isBought = false;
            isSold = true;
        }
        else
        {
            System.out.println("the car has already been sold.");
            System.out.println();
        }
    }
    //to display the attribute values.
    @Override
    public void display()
    {
        super.display();
        if(isBought)
        {
            System.out.println("the customer is:"+CustomerName+".");
            System.out.println("the battery capacity is :"+BatteryCapacity+".");
            System.out.println("the battery warrranty is:"+BatteryWarranty+".");
            System.out.println("the purchase date is :"+PurchaseDate+".");
            System.out.println("the range is :"+ Range+".");
            System.out.println("the recharge time is:"+RechargeTime+".");
            System.out.println();
        }
    }   
}
