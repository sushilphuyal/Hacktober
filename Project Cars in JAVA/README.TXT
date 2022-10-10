------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:
//fcarAddbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name = fCarNameTxt.getText();
                String brand = fcarBrandTxt.getTxt();
                String fueltype = fcarFuelType.getText();
                String carPrice = FcarPriceTxt.getText();
                int id = 0;
                int numofseats = 0;
                int mileage = 0;
            try {
                id= Integer.parseInt(fcarIDtxt.getText);
                numofseats = Integer.parseInt(fcarNumOfSeats);
                mileage = 8;
            }catch(NumberFormatException ex){
                pane.showMessageDialog(new JFrame(),ex);
                return;
            }
        
             if(cars.isEmpty()){
                 fc= new FuelCar(id, name, brand, carPrice,fueltype,numofseats, mileage);
                   cars.add(fc);
                }else{
                    for(Car car: cars){
                        //if(car instanceof FuelCar
        }       
    }
