
/**
 * Write a description of class FuelCar here.
 *
 * @author (Anisha)
 * @version (a version number or a date)
 */
public class FuelCar extends Car
{
   //declaration of attribute
   private String DistributorName;
   private String FuelType;
   private int NumberOfSeats;
   private String PurchaseDate;
   private String BookedDate;
   private int mileage;
   private String TransmissionType;
   private boolean isPurchased;
   //setting up the constructor.
   public FuelCar(int CarID, String CarName, String CarBrand, String
   CarPrice, String FuelType, int NumberOfSeats,int mileage)
   {
       super(CarID,CarName,CarBrand,CarPrice);
       this.FuelType = FuelType;
       this.NumberOfSeats = NumberOfSeats;
       this.mileage = mileage;
       
       DistributorName="";
       BookedDate = "";
       PurchaseDate ="";
       TransmissionType = "" ;
       isPurchased = false;
    }
    public String getDistributorName()
    {
        return DistributorName;
    }
    public String getFuelType()
    {
        return FuelType;
    }
    public int getNumberOfSeats()
    {
        return NumberOfSeats;
    }
    public String getBookedDate()
    {
        return BookedDate;
    }
    public String getPurchaseDate()
    {
        return PurchaseDate;
    }
    public int getmileage()
    {
        return mileage;
    }
    public String getTransmissionType()
    {
        return TransmissionType;
    }
    public boolean getisPurchased()
    {
        return isPurchased;
    }
    public void setDistributorName(String DistributorName)
    {
        this.DistributorName = DistributorName;
    }
    public void setTransmissionType(String TransmissionType)
    {
        this.TransmissionType = TransmissionType;
    }
    //to purchase a particular fuel car
    public void purchase (String BookedDate,String PurchaseDate,String DistributorName)
    
    {
        if(!isPurchased==true)
        {
            this.DistributorName = DistributorName;
            this.PurchaseDate = PurchaseDate;
            this.BookedDate = BookedDate;
            
            isPurchased = true;
        }
        else
        {
            System.out.println("the fuelcar has already been purchased with:");
            System.out.println("DistributorName: "+this.DistributorName);
            System.out.println("PurchaseDate:"+this.PurchaseDate);
            System.out.println("BookedDate:"+this.BookedDate);
            System.out.println();
        }
    }
    //to display the attribute values.
    @Override
    public void display()
    {
        super.display();
        if(isPurchased)
        {
            System.out.println("the DistributorName is "+DistributorName+".");
            System.out.println("the FuelType is "+FuelType+".");
            System.out.println("the PurchaseDate is "+PurchaseDate+".");
            System.out.println("The BookedDate is" +BookedDate+".");
            System.out.println("the mileagae is"+mileage+".");
            System.out.println("the NumberOfSeats is "+ NumberOfSeats+".");
            System.out.println("the TransmissionType is" +TransmissionType+".");
            System.out.println();
        }
    }   
}
