
/**
 * Write a description of class GuiCar here.
 *
 * @author (Milenee Pakhrin Tamang)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;
public class GuiCar 

{   private JFrame mainFrame;
    private JPanel panelCar;
    
    private JTextField txt_carID, txt_carName, txt_carBrand, txt_carColor, txt_carPrice, txt_distributorName, txt_fuelType, 
    txt_numberofSeats,txt_bookedDate, txt_purchaseDate,txt_Mileage, txt_transmissionType, txt_customerName, txt_batteryCapacity, txt_batteryWarranty, 
    txt_Range, txt_rechargeTime;
    
    private JLabel lbl_carID, lbl_carName, lbl_carBrand, lbl_carColor, lbl_carPrice, lbl_distributorName, lbl_fuelType, 
    lbl_numberofSeats, lbl_Mileage, lbl_transmissionType, lbl_customerName, lbl_batteryCapacity, lbl_batteryWarranty, 
    lbl_Range, lbl_rechargeTime, lbl_fuelCar,lbl_electricCar, lbl_purchaseDate, lbl_bookedDate;
    
    private JButton btnDisplay, btnAdd, btnClear, btnBuy, btnPurchased, btnSell, btnfuelCar, btnElectricCar;
    
    private JComboBox purchaseDay,purchaseMonth,purchaseYear, bookedDay,bookedMonth,bookedYear;
    
    private Font flbl1,ff,ftxt,fBtn;
    
    
    public static FuelCar fc;
    public static ElectricCar ec;
    //creating reference object of ArrayList of Car class type 
    public ArrayList<Car>fuelCarList = new ArrayList<Car>();
    public ArrayList<Car>electricCarList = new ArrayList<Car>();

    
    
    public GuiCar()
    {   
        mainFrame = new JFrame();//initializing JFrame 

        panelCar = new JPanel();
        panelCar.setLayout(null);
        panelCar.setBackground(Color.white);
        panelCar.setFocusable(true);//sets foucs of mouse to panel when frame is loaded
        panelCar.setSize(1650,1080);
        
        
        flbl1 = new Font("Bookman Old Style",Font.BOLD,40);
        ff = new Font("Arial",Font.BOLD,18);
        ftxt = new Font("Calibri (Body)",Font.PLAIN,14);
        fBtn = new Font("Arial Rounded MT Bold",Font.BOLD,20);
        
        btnfuelCar = new JButton("For Fuel Car");
        btnfuelCar.setBounds(780,100,420,36);
        btnfuelCar.setBorder(null);
        btnfuelCar.setFont(fBtn);
        btnfuelCar.setBackground(Color.red);
        btnfuelCar.setForeground(Color.WHITE);
        btnfuelCar.setVisible(false);
        
        
        btnfuelCar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fuelCarComponent();//calling method for fuel car component
            }
        });
        

        
        btnElectricCar= new JButton(" For  Electric Car ");
        btnElectricCar.setBounds(780,100,420,36);
        btnElectricCar.setBorder(null);
        btnElectricCar.setFont(fBtn);
        btnElectricCar.setBackground(Color.red);
        btnElectricCar.setForeground(Color.WHITE);
        
        
        
        btnElectricCar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                electricCarComponent();//calling method for electric car component
            }
        });
        
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(780,640,210,35);
        btnDisplay.setBorder(null);
        btnDisplay.setBackground(Color.red);
        btnDisplay.setForeground(Color.WHITE);
        btnDisplay.setFont(fBtn);
        
        
        btnAdd = new JButton("Add");
        btnAdd.setBounds(70,365,210,35);
        btnAdd.setBorder(null);
        btnAdd.setBackground(Color.red);
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setFont(fBtn);
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(lbl_fuelCar.isVisible() == true || btnElectricCar.isVisible() == true){
                   if(txt_carID.getText().equals("Enter The Car ID.........")
                    ||txt_carName.getText().equals("Enter The Car Name.........")
                    ||txt_carBrand.getText().equals("Enter The Brand.........")
                    ||txt_numberofSeats.getText().equals("Enter The Number of Seats.........")
                    ||txt_Mileage.getText().equals("Enter Mileage.........")
                    ||txt_fuelType.getText().equals("Enter The Fuel Type.........")){
                        
                        JOptionPane.showMessageDialog(null,"Please, \nFill all the required text field present....","Alert",JOptionPane.WARNING_MESSAGE);
                    
                    
                    }
                    else{
                         int CarID = 0;
                         String CarName =  txt_carName.getText();
                         String CarBrand = txt_carBrand.getText();
                         String CarPrice = txt_carPrice.getText();
                         String FuelType = txt_fuelType.getText();
                         int  NumberOfSeats = 0;
                         int Mileage = 0;
                         
                         try{CarID= Integer.parseInt(txt_carID.getText()); }//chaning string datatype to integer datatype
                         catch(NumberFormatException d){
                             JOptionPane.showMessageDialog(null,"Please, \n give valid user input...","Invalid carID datatype",JOptionPane.ERROR_MESSAGE); 
                             return;
                         } 
                         try{Mileage= Integer.parseInt(txt_Mileage.getText()); }//chaning string datatype to integer datatype
                         catch(NumberFormatException m){
                             JOptionPane.showMessageDialog(null,"Please, \n give valid user input...","Invalid mileage datatype",JOptionPane.ERROR_MESSAGE); 
                             return;
                         }
                         try{NumberOfSeats= Integer.parseInt(txt_numberofSeats.getText()); }//chaning string datatype to integer datatype
                         catch(NumberFormatException n){
                             JOptionPane.showMessageDialog(null,"Please, \n give valid user input...","Invalid numberofSeats datatype",JOptionPane.ERROR_MESSAGE); 
                             return;
                         }
                         for(Car c : fuelCarList){
                             //checks if user entered car id is already in arraylist
                             if(c.getCarID() == CarID){
                                  //displays message dialog if conditon is met
                                  JOptionPane.showMessageDialog(null," Entered Car ID already exist. ","Alert",JOptionPane.INFORMATION_MESSAGE);
                                  return;
                             }

                            }
                    
                            
                        fc = new FuelCar( CarID, CarName,CarBrand,CarPrice,FuelType, NumberOfSeats, Mileage);//passing value to parameter of fuelcar constructor
                        fuelCarList.add(fc);//adding fuelCar object in arraylist
                        JOptionPane.showMessageDialog(null,"Fuel Car is successfully added.","Alert",JOptionPane.INFORMATION_MESSAGE);
                    }
                
                }
                else{ 
                    if(lbl_electricCar.isVisible() == true || btnfuelCar.isVisible() == true){
                        if(txt_carID.getText().equals("Enter The Car ID.........")
                        ||txt_carName.getText().equals("Enter The Car Name.........")
                        ||txt_carBrand.getText().equals("Enter The Brand.........")
                        ||txt_carPrice.getText().equals("Enter The Car Price.........")
                        ||txt_batteryCapacity.getText().equals("Enter Battery Capacity.........")
                        ||txt_Mileage.getText().equals("Enter Mileage.........")
                        ||txt_fuelType.getText().equals("Enter The Fuel Type.........")){
                        
                           JOptionPane.showMessageDialog(null,"Please, \nFill all the required text field present....","Alert",JOptionPane.WARNING_MESSAGE);
                    
                    
                        }
                        else{
                             int CarID = 0;
                             String CarName =  txt_carName.getText();
                             String CarBrand = txt_carBrand.getText();
                             String CarPrice = txt_carPrice.getText();
                             int BatteryCapacity = 0;
                             
                             try{CarID= Integer.parseInt(txt_carID.getText()); }//chaning string datatype to integer datatype
                             catch(NumberFormatException d){
                             JOptionPane.showMessageDialog(null,"Please, \n give valid user input...","Invalid carID datatype",JOptionPane.ERROR_MESSAGE); 
                             return;
                             } 
                             try{BatteryCapacity= Integer.parseInt(txt_batteryCapacity.getText()); }//chaning string datatype to integer datatype
                             catch(NumberFormatException b){
                             JOptionPane.showMessageDialog(null,"Please, \n give valid user input...","Invalid Battery Capacity datatype",JOptionPane.ERROR_MESSAGE); 
                             return;
                              } 
                              
                             for(Car c : electricCarList){
                             //checks if user entered car id is already in arraylist
                                     if(c.getCarID() == CarID){
                                          //displays message dialog if conditon is met
                                          JOptionPane.showMessageDialog(null," Entered Car ID already exist. ","Alert",JOptionPane.INFORMATION_MESSAGE);
                                          return;
                                       }
                                       

                             }
                              
                              ec = new ElectricCar( CarID, CarName, CarBrand,CarPrice, BatteryCapacity);//passing value to parameter of electric car constructor
                              electricCarList.add(ec);//adding ElectricCar object in arraylist
                              JOptionPane.showMessageDialog(null,"electric Car is successfully added.","Alert",JOptionPane.INFORMATION_MESSAGE);
                            
                             
                           
                        
                        }
                        
                    
                
                
                }
                
            }
        }
    });
        
        
        
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(1000,640,210,35);
        btnClear.setBorder(null);
        btnClear.setBackground(Color.red);
        btnClear.setForeground(Color.WHITE);
        btnClear.setFont(fBtn);
        btnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int response = JOptionPane.showConfirmDialog(null," Are you sure, do you want to clear all text field? ", "Warning",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(response == JOptionPane.YES_OPTION){
                    txt_distributorName.setText("Enter The Distributor Name.........");
                    txt_distributorName.setForeground(Color.black);
                    txt_distributorName.setBackground(Color.gray);
                    txt_fuelType.setText("Enter The Fuel Type.........");
                    txt_fuelType.setForeground(Color.black);
                    txt_fuelType.setBackground(Color.gray);
                    txt_Mileage.setText("Enter Mileage.........");
                    txt_Mileage.setForeground(Color.black);
                    txt_Mileage.setBackground(Color.gray);
                    txt_transmissionType.setText("Enter Transmission Type.........");
                    txt_transmissionType.setForeground(Color.black);
                    txt_transmissionType.setBackground(Color.gray);
                    txt_numberofSeats.setText("Enter The Number of Seats.........");
                    txt_numberofSeats.setForeground(Color.black);
                    txt_numberofSeats.setBackground(Color.gray);
                    txt_bookedDate.setText("Enter Booked Date........");
                    txt_bookedDate.setForeground(Color.black);
                    txt_bookedDate.setBackground(Color.gray);
                    txt_batteryCapacity.setText("Enter Battery Capacity.........");
                    txt_batteryCapacity.setForeground(Color.black);
                    txt_batteryCapacity.setBackground(Color.gray);
                    txt_rechargeTime.setText("Enter Recharge Time.........");
                    txt_rechargeTime.setForeground(Color.black);
                    txt_rechargeTime.setBackground(Color.gray);
                    txt_batteryWarranty.setText("Enter Battery Warranty.........");
                    txt_batteryWarranty.setForeground(Color.black);
                    txt_batteryWarranty.setBackground(Color.gray);
                    txt_Range.setText("Enter Range .........");
                    txt_Range.setForeground(Color.black);
                    txt_Range.setBackground(Color.gray);
                    txt_carID.setText("Enter The Car ID.........");
                    txt_carID.setForeground(Color.black);
                    txt_carID.setBackground(Color.gray);
                    txt_carName.setText("Enter The Car Name.........");
                    txt_carName.setForeground(Color.black);
                    txt_carName.setBackground(Color.gray);
                    txt_carBrand.setText("Enter The Brand.........");
                    txt_carBrand.setForeground(Color.black);
                    txt_carBrand.setBackground(Color.gray);
                    txt_carColor.setText("Enter The Color.........");
                    txt_carColor.setForeground(Color.black);
                    txt_carColor.setBackground(Color.gray);
                    txt_carPrice.setText("Enter The Car Price.........");
                    txt_carPrice.setForeground(Color.black);
                    txt_carPrice.setBackground(Color.gray);
                    txt_purchaseDate .setText("Enter The Purchase Date.........");
                    txt_purchaseDate .setForeground(Color.black);
                    txt_purchaseDate .setBackground(Color.gray);
                    txt_customerName.setText("Enter The Customer Name.........");
                    txt_customerName.setForeground(Color.black);
                    txt_customerName.setBackground(Color.gray);
                    
                    JOptionPane.showMessageDialog(null,"All Text Field are succcessfully Cleared.","Alert",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        btnBuy = new JButton("Buy");
        btnBuy.setBounds(290,640,210,35);
        btnBuy.setBorder(null);
        btnBuy.setBackground(Color.red);
        btnBuy.setForeground(Color.WHITE);
        btnBuy.setFont(fBtn);
        btnBuy.setVisible(false);
        
        
        btnSell = new JButton("Sell");
        btnSell.setBounds(70,640,210,35);
        btnSell.setBackground(Color.red);
        btnSell.setBorder(null);
        btnSell.setForeground(Color.WHITE);
        btnSell.setFont(fBtn);
        btnSell.setVisible(false);
        
        
        btnPurchased = new JButton("Purchase");
        btnPurchased.setBounds(70,640,210,35);
        btnPurchased.setBackground(Color.red);
        btnPurchased.setBorder(null);
        btnPurchased.setForeground(Color.WHITE);
        btnPurchased.setFont(fBtn);
        btnPurchased.setVisible(false);
        
        btnPurchased.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    if(txt_carID.getText().equals("Enter The Car ID.........")
                    ||txt_carName.getText().equals("Enter The Car Name.........")
                    ||txt_carBrand.getText().equals("Enter The Brand.........")
                    ||txt_carColor.getText().equals("Enter The Color.........")
                    ||txt_transmissionType.getText().equals("Enter Transmission Type.........")
                    ||txt_distributorName.getText().equals("Enter The Distributor Name.........")
                    
                    ){
                        JOptionPane.showMessageDialog(null,"Please, \nFill all the required text field present....","Alert",JOptionPane.WARNING_MESSAGE); 
                    
                    }
                    else{
                         int CarID = 0;
                         String CarName =  txt_carName.getText();
                         String CarBrand = txt_carBrand.getText();
                         String CarColor = txt_carColor.getText();
                         String TransmissionType = txt_transmissionType.getText();
                         String DistributorName = txt_distributorName.getText();
                         String PurchaseDate = purchaseDay.getSelectedItem().toString() + "/"+purchaseMonth.getSelectedItem().toString() +"/"+purchaseYear.getSelectedItem().toString(); 
                         String BookedDate = bookedDay.getSelectedItem().toString() + "/"+bookedMonth.getSelectedItem().toString() +"/"+bookedYear.getSelectedItem().toString();
                        
                         
                        try{CarID= Integer.parseInt(txt_carID.getText()); }//chaning string datatype to integer datatype
                         catch(NumberFormatException d){
                             JOptionPane.showMessageDialog(null,"Please, \n give valid user input...","Invalid carID datatype",JOptionPane.ERROR_MESSAGE); 
                             return;
                         } 
                         for(int i = 0; i < fuelCarList.size(); i++){
                            //checks if user entered course id is already in arraylist
                            if(fuelCarList.get(i).getCarID() == CarID){
                                FuelCar f = (FuelCar)fuelCarList.get(i);//downcasting from Course to fuel car type for accessing child class method
                                if(fc.getisPurchased() == false){
                                    fc.purchase(PurchaseDate,BookedDate, BookedDate);//passing value to parameter of register method
                                    JOptionPane.showMessageDialog(null,"The Car with CarID" + CarID + "has been successfully purchased!!!.","Alert",JOptionPane.INFORMATION_MESSAGE);
                                    return;  
                                   
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"The Car with CarID" + CarID + "is already registered","Alert",JOptionPane.INFORMATION_MESSAGE);
                                    return;
                                }
                                
                            }
                           
                        }
                        JOptionPane.showMessageDialog(null,"The CarID doesnot exist","Alert",JOptionPane.ERROR_MESSAGE);
                        return;  
                    }
            }
             
            
        });
        
        
        //for label______
        lbl_fuelCar = new JLabel("Fuel Car");
        lbl_fuelCar.setBounds(500,30,500,30);
        lbl_fuelCar.setFont(flbl1);
        lbl_fuelCar.setForeground(Color.WHITE);
       
        lbl_electricCar= new JLabel("Electric Car");
        lbl_electricCar.setBounds(490,30,600,30);
        lbl_electricCar.setFont(flbl1);
        lbl_electricCar.setForeground(Color.WHITE);
        lbl_electricCar.setVisible(false);
        
        lbl_carID= new JLabel("Car ID : ");
        lbl_carID.setBounds(70,185,200,20);
        lbl_carID.setFont(ff);
        lbl_carID.setForeground(Color.WHITE);
        
        lbl_carName = new JLabel("Car Name : ");
        lbl_carName.setBounds(70,235,300,20);
        lbl_carName.setFont(ff);
        lbl_carName.setForeground(Color.WHITE);
        
        lbl_carColor= new JLabel("Car Color: ");
        lbl_carColor.setBounds(780,185,100,20);
        lbl_carColor.setFont(ff);
        lbl_carColor.setForeground(Color.WHITE);
        
        lbl_carPrice = new JLabel("Car Price : ");
        lbl_carPrice.setBounds(780,235,130,20);
        lbl_carPrice.setFont(ff);
        lbl_carPrice.setForeground(Color.WHITE);
        
        lbl_carBrand = new JLabel("Car Brand : ");
        lbl_carBrand.setBounds(70,285,130,20);
        lbl_carBrand.setFont(ff);
        lbl_carBrand.setForeground(Color.WHITE);
        
        lbl_distributorName = new JLabel("Distributor Name : ");
        lbl_distributorName.setBounds(780,285,180,20);
        lbl_distributorName.setFont(ff);
        lbl_distributorName.setForeground(Color.WHITE);
        
        lbl_customerName= new JLabel("Customer Name : ");
        lbl_customerName.setBounds(780,285,180,20);
        lbl_customerName.setFont(ff);
        lbl_customerName.setForeground(Color.WHITE);
        lbl_customerName.setVisible(false);
        
        lbl_fuelType = new JLabel("Fuel Type : ");
        lbl_fuelType.setBounds(70,450,200,20);
        lbl_fuelType.setFont(ff);
        lbl_fuelType.setForeground(Color.WHITE);
        
        lbl_Mileage = new JLabel("Mileage : ");
        lbl_Mileage.setBounds(70,500,200,20);
        lbl_Mileage.setFont(ff);
        lbl_Mileage.setForeground(Color.WHITE);
        
        lbl_transmissionType = new JLabel("Transmission Type : ");
        lbl_transmissionType.setBounds(70,550,200,20);
        lbl_transmissionType.setFont(ff);
        lbl_transmissionType.setForeground(Color.WHITE);
        
        lbl_numberofSeats = new JLabel("Number of Seats : ");
        lbl_numberofSeats.setBounds(780,450,200,20);
        lbl_numberofSeats.setFont(ff);
        lbl_numberofSeats.setForeground(Color.WHITE);
        
        lbl_bookedDate = new JLabel("Booked Date : ");
        lbl_bookedDate.setBounds(780,550,200,20);
        lbl_bookedDate.setFont(ff);
        lbl_bookedDate.setForeground(Color.WHITE);
        
        lbl_purchaseDate = new JLabel("Purchase Date : ");
        lbl_purchaseDate.setBounds(780,500,200,20);
        lbl_purchaseDate.setFont(ff);
        lbl_purchaseDate.setForeground(Color.WHITE);
        
        lbl_batteryCapacity = new JLabel("Battery Capacity : ");
        lbl_batteryCapacity.setBounds(70,450,200,20);
        lbl_batteryCapacity.setFont(ff);
        lbl_batteryCapacity.setForeground(Color.WHITE);
        lbl_batteryCapacity.setVisible(false);
        
        lbl_rechargeTime = new JLabel("Recharge Time : ");
        lbl_rechargeTime.setBounds(70,500,200,20);
        lbl_rechargeTime.setFont(ff);
        lbl_rechargeTime.setForeground(Color.WHITE);
        lbl_rechargeTime.setVisible(false);
        
        lbl_batteryWarranty = new JLabel("Battery Warranty : ");
        lbl_batteryWarranty.setBounds(70,550,200,20);
        lbl_batteryWarranty.setFont(ff);
        lbl_batteryWarranty.setForeground(Color.WHITE);
        lbl_batteryWarranty.setVisible(false);
        
        lbl_Range = new JLabel("Range : ");
        lbl_Range.setBounds(780,450,200,20);
        lbl_Range.setFont(ff);
        lbl_Range.setForeground(Color.WHITE);
        lbl_Range.setVisible(false);
        
        
        
        
        //___for text field____///
        txt_carID = new JTextField(20);
        txt_carID.setText("Enter The Car ID.........");
        txt_carID.setBounds(250,180,250,30);
        txt_carID.setFont(ftxt);
        txt_carID.setForeground(Color.black);
        txt_carID.setBackground(Color.gray);
        
        txt_carName = new JTextField(20);
        txt_carName.setText("Enter The Car Name.........");
        txt_carName.setBounds(250,230,250,30);
        txt_carName.setFont(ftxt);
        txt_carName.setForeground(Color.black);
        txt_carName.setBackground(Color.gray);
        
        txt_carBrand = new JTextField(20);
        txt_carBrand.setText("Enter The Brand.........");
        txt_carBrand.setBounds(250,280,250,30);
        txt_carBrand.setFont(ftxt);
        txt_carBrand.setForeground(Color.black);
        txt_carBrand.setBackground(Color.gray);
        
        txt_carColor = new JTextField(20);
        txt_carColor.setText("Enter The Color.........");
        txt_carColor.setBounds(950,180,250,30);
        txt_carColor.setFont(ftxt);
        txt_carColor.setForeground(Color.black);
        txt_carColor.setBackground(Color.gray);
        
        txt_carPrice = new JTextField(20);
        txt_carPrice.setText("Enter The Car Price.........");
        txt_carPrice.setBounds(950,230,250,30);
        txt_carPrice.setFont(ftxt);
        txt_carPrice.setForeground(Color.black);
        txt_carPrice.setBackground(Color.gray);
        
        txt_distributorName = new JTextField(20);
        txt_distributorName.setText("Enter The Distributor Name.........");
        txt_distributorName.setBounds(950,280,250,30);
        txt_distributorName.setFont(ftxt);
        txt_distributorName.setForeground(Color.black);
        txt_distributorName.setBackground(Color.gray);
        
        txt_customerName = new JTextField(20);
        txt_customerName.setText("Enter The Customer Name.........");
        txt_customerName.setBounds(950,280,250,30);
        txt_customerName.setFont(ftxt);
        txt_customerName.setForeground(Color.black);
        txt_customerName.setBackground(Color.gray);
        txt_customerName.setVisible(false);
        
        txt_fuelType = new JTextField(20);
        txt_fuelType.setText("Enter The Fuel Type.........");
        txt_fuelType.setBounds(250,445,250,30);
        txt_fuelType.setFont(ftxt);
        txt_fuelType.setForeground(Color.black);
        txt_fuelType.setBackground(Color.gray);
        
        txt_Mileage = new JTextField(20);
        txt_Mileage.setText("Enter Mileage.........");
        txt_Mileage.setBounds(250,495,250,30);
        txt_Mileage.setFont(ftxt);
        txt_Mileage.setForeground(Color.black);
        txt_Mileage.setBackground(Color.gray);
        
        txt_transmissionType = new JTextField(20);
        txt_transmissionType.setText("Enter Transmission Type.........");
        txt_transmissionType.setBounds(250,545,250,30);
        txt_transmissionType.setFont(ftxt);
        txt_transmissionType.setForeground(Color.black);
        txt_transmissionType.setBackground(Color.gray);
        
        
        txt_numberofSeats = new JTextField(20);
        txt_numberofSeats.setText("Enter The Number of Seats.........");
        txt_numberofSeats.setBounds(950,445,250,30);
        txt_numberofSeats.setFont(ftxt);
        txt_numberofSeats.setForeground(Color.black);
        txt_numberofSeats.setBackground(Color.gray);
        
        //txt_bookedDate = new JTextField(20);
        //txt_bookedDate.setText("Enter Booked Date........");
        //txt_bookedDate.setBounds(950,545,250,30);
        //txt_bookedDate.setFont(ftxt);
        //txt_bookedDate.setForeground(Color.black);
        //txt_bookedDate.setBackground(Color.gray);
        
        //txt_purchaseDate = new JTextField(20);
        //txt_purchaseDate .setText("Enter The Purchase Date.........");
        //txt_purchaseDate .setBounds(950,495,250,30);
        //txt_purchaseDate .setFont(ftxt);
        //txt_purchaseDate .setForeground(Color.black);
        //txt_purchaseDate .setBackground(Color.gray);
        
        txt_batteryCapacity = new JTextField(20);
        txt_batteryCapacity.setText("Enter Battery Capacity.........");
        txt_batteryCapacity.setBounds(250,445,250,30);
        txt_batteryCapacity.setFont(ftxt);
        txt_batteryCapacity.setForeground(Color.black);
        txt_batteryCapacity.setBackground(Color.gray);
        txt_batteryCapacity.setVisible(false);
        
        txt_rechargeTime= new JTextField(20);
        txt_rechargeTime.setText("Enter Recharge Time.........");
        txt_rechargeTime.setBounds(250,495,250,30);
        txt_rechargeTime.setFont(ftxt);
        txt_rechargeTime.setForeground(Color.black);
        txt_rechargeTime.setBackground(Color.gray);
        txt_rechargeTime.setVisible(false);
        
        txt_batteryWarranty = new JTextField(20);
        txt_batteryWarranty.setText("Enter Battery Warranty.........");
        txt_batteryWarranty.setBounds(250,545,250,30);
        txt_batteryWarranty.setFont(ftxt);
        txt_batteryWarranty.setForeground(Color.black);
        txt_batteryWarranty.setBackground(Color.gray);
        txt_batteryWarranty.setVisible(false);
        
        txt_Range = new JTextField(20);
        txt_Range.setText("Enter Range .........");
        txt_Range.setBounds(950,445,250,30);
        txt_Range.setFont(ftxt);
        txt_Range.setForeground(Color.black);
        txt_Range.setBackground(Color.gray);
        
        //_____for ComboBox______//
        String day[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String month[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
        String year[]={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        purchaseDay = new JComboBox(day);  
        purchaseMonth = new JComboBox(month);
        purchaseYear = new JComboBox(year);
        purchaseDay.setBounds(950, 495,70,30);    
        purchaseMonth.setBounds(1021, 495,79,30);    
        purchaseYear.setBounds(1099, 495,80,30);
        
         
        
        
        
        
        //_____adding botton to the panel__//
        panelCar.add(btnfuelCar);
        panelCar.add(btnElectricCar);
        panelCar.add( btnDisplay);
        panelCar.add(btnAdd);
        panelCar.add(btnClear);
        panelCar.add(btnBuy);
        panelCar.add(btnSell);
        panelCar.add(btnPurchased);
        panelCar.add(txt_fuelType);
        
        //adding JCombobox to the panel//
        panelCar.add( purchaseDay);
        panelCar.add( purchaseMonth);
        panelCar.add( purchaseYear);
        
        panelCar.add( bookedDay);
        panelCar.add( bookedMonth);
        panelCar.add( bookedYear);
        
        //___adding label to the panel___//
        panelCar.add(lbl_fuelCar);
        panelCar.add(lbl_electricCar);
        panelCar.add(lbl_carID);
        panelCar.add(lbl_carName);
        panelCar.add(lbl_carColor);
        panelCar.add(lbl_carPrice);
        panelCar.add(lbl_carBrand);
        panelCar.add(lbl_distributorName);
        panelCar.add(lbl_customerName);
        panelCar.add(lbl_fuelType);
        panelCar.add(lbl_Mileage);
        panelCar.add(lbl_transmissionType);
        panelCar.add(lbl_numberofSeats);   
        panelCar.add(lbl_bookedDate);
        panelCar.add(lbl_purchaseDate);
        panelCar.add(lbl_batteryCapacity);
        panelCar.add(lbl_rechargeTime);
        panelCar.add(lbl_batteryWarranty);
        panelCar.add(lbl_Range);
        
        
        //___adding text field to the panel___//
        panelCar.add(txt_carID);
        panelCar.add(txt_carName);
        panelCar.add(txt_carBrand);
        panelCar.add(txt_carColor);
        panelCar.add(txt_carPrice);
        panelCar.add(txt_distributorName);
        panelCar.add(txt_customerName );
        panelCar.add(txt_Mileage);
        panelCar.add(txt_transmissionType);
        panelCar.add(txt_numberofSeats);
        //panelCar.add(txt_bookedDate);
        //panelCar.add(txt_purchaseDate);
        panelCar.add(txt_batteryCapacity);
        panelCar.add(txt_rechargeTime);
        panelCar.add(txt_batteryWarranty);
        panelCar.add(txt_Range);
        
        mainFrame.add(panelCar);//adding Jpanel  to JFrame
        mainFrame.setSize(1650,1080);
        //mainFrame.setLocationRelativeTo(null);//centers the Freame location 
        mainFrame.setTitle("Car");
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        
       
        
    }
    //----method for setting visibility of fuelCar panel component----//
    public void fuelCarComponent(){
        panelCar.setFocusable(true);//sets foucs of mouse to panel when frame is loaded
        lbl_electricCar.setVisible(false);
        btnfuelCar.setVisible(false); 
        btnSell.setVisible(false);
        btnBuy.setVisible(false);
        lbl_electricCar.setVisible(false);
        lbl_customerName.setVisible(false);
        lbl_batteryCapacity.setVisible(false);
        lbl_rechargeTime.setVisible(false);
        lbl_Range.setVisible(false);
        
        lbl_batteryWarranty.setVisible(false);
        txt_customerName.setVisible(false);
        txt_batteryCapacity.setVisible(false);
        txt_rechargeTime.setVisible(false);
        txt_batteryWarranty.setVisible(false);
        txt_Range.setVisible(false);
        
        
        btnPurchased.setVisible(true);
        lbl_fuelCar.setVisible(true);
        lbl_distributorName.setVisible(true);
        lbl_fuelType.setVisible(true);
        lbl_Mileage.setVisible(true);
        lbl_transmissionType.setVisible(true);
        lbl_numberofSeats.setVisible(true);
        lbl_bookedDate.setVisible(true);
        txt_distributorName.setVisible(true);
        txt_fuelType.setVisible(true);
        txt_Mileage.setVisible(true);
        txt_transmissionType.setVisible(true);
        txt_numberofSeats.setVisible(true);
        //txt_bookedDate.setVisible(true);
        bookedDay.setVisible(true);
        bookedMonth.setVisible(true);
        bookedYear.setVisible(true);
        
        
        
        txt_distributorName.setText("Enter The Distributor Name.........");
        txt_distributorName.setForeground(Color.black);
        txt_distributorName.setBackground(Color.gray);
        txt_fuelType.setText("Enter The Fuel Type.........");
        txt_fuelType.setForeground(Color.black);
        txt_fuelType.setBackground(Color.gray);
        txt_Mileage.setText("Enter Mileage.........");
        txt_Mileage.setForeground(Color.black);
        txt_Mileage.setBackground(Color.gray);
        txt_transmissionType.setText("Enter Transmission Type.........");
        txt_transmissionType.setForeground(Color.black);
        txt_transmissionType.setBackground(Color.gray);
        txt_numberofSeats.setText("Enter The Number of Seats.........");
        txt_numberofSeats.setForeground(Color.black);
        txt_numberofSeats.setBackground(Color.gray);
        txt_bookedDate.setText("Enter Booked date........");
        txt_bookedDate.setForeground(Color.black);
        txt_bookedDate.setBackground(Color.gray);
  
          
    
    }
    //----method for setting visibility of electricCar panel component----//
    public void electricCarComponent(){
        panelCar.setFocusable(true);//sets foucs of mouse to panel when frame is loaded
        lbl_electricCar.setVisible(true);
        btnfuelCar.setVisible(true); 
        btnSell.setVisible(true);
        btnBuy.setVisible(true);
        lbl_electricCar.setVisible(true);
        lbl_customerName.setVisible(true);
        lbl_batteryCapacity.setVisible(true);
        lbl_rechargeTime.setVisible(true);
        lbl_batteryWarranty.setVisible(true);
        lbl_Range.setVisible(true);
        
        
        txt_customerName.setVisible(true);
        txt_batteryCapacity.setVisible(true);
        txt_rechargeTime.setVisible(true);
        txt_batteryWarranty.setVisible(true);
        txt_Range.setVisible(true);
        
        btnPurchased.setVisible(false);
        lbl_fuelCar.setVisible(false);
        lbl_distributorName.setVisible(false);
        lbl_fuelType.setVisible(false);
        lbl_Mileage.setVisible(false);
        lbl_transmissionType.setVisible(false);
        lbl_numberofSeats.setVisible(false);
        lbl_bookedDate.setVisible(false);
        txt_distributorName.setVisible(false);
        txt_fuelType.setVisible(false);
        txt_Mileage.setVisible(false);
        txt_transmissionType.setVisible(false);
        txt_numberofSeats.setVisible(false);
        //txt_bookedDate.setVisible(false);
        bookedDay.setVisible(false);
        bookedMonth.setVisible(false);
        bookedYear.setVisible(false);
        
        txt_batteryCapacity.setText("Enter Battery Capacity.........");
        txt_batteryCapacity.setForeground(Color.black);
        txt_batteryCapacity.setBackground(Color.gray);
        txt_rechargeTime.setText("Enter Recharge Time.........");
        txt_rechargeTime.setForeground(Color.black);
        txt_rechargeTime.setBackground(Color.gray);
        txt_batteryWarranty.setText("Enter Battery Warranty.........");
        txt_batteryWarranty.setForeground(Color.black);
        txt_batteryWarranty.setBackground(Color.gray);
        txt_Range.setText("Enter Range .........");
        txt_Range.setForeground(Color.black);
        txt_Range.setBackground(Color.gray);

    
    
    }
    

    public static void main(String[]args){
        new GuiCar();//calling contructor of GuiCar class
    } 
    
    
}
