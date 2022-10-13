import datetime


def lists():
    file = open("Books.txt", "r")
    listBooks = []
    dictionary = {}
    for each in file:
        line = each.replace("\n", "")
        listBooks.append(line.split(","))
        for i in range(1, len(listBooks)+1):
            each = i
            dictionary[each] = listBooks[i-1]
    file.close()
    return dictionary


def borrowBook():
    I = int(input("Enter ID of the book you want to borrow: "))
    listBooks = lists()
    if I >= 0 and I <= 5: #validation
        if int(listBooks[I][2]) > 0:
            #print("\n----------------")
            print("The book is available.")
            #print("__________________\n")
            name = input("Enter the name of the customer who wants to borrow the book: ")#for the bill
            change_quantity(I)
            
            dt = datetime.datetime.now() 
            t = dt.strftime("%H:%M:%S")
            d = dt.strftime("%d/%m/%Y")
            s = 0
            
            while(True):
                YesNo = input("enter 'Y' to continue borrowing. Enter 'N' to stop: ")
                if YesNo == "y" or YesNo == "Y":
                    s = s+1
                    ID = int(input("Enter id of the book that you want to borrow: "))
                    listBooks = lists()
                    if ID >= 0 and ID <= 5: # this is for validation
                        if int(listBooks[ID][2]) > 0:
                            #print("\n ")
                            print("Book is available.")
                            #print(" \n")
                            change_quantity(ID) #to decrease quantity ater borrowing
                            bill(name, I, ID, t, d)
                            print("\n")
                            total(I, ID)
                            #print("customers details: ")
                        else:
                            print("Sorry, the book is currently not available.")
                    else:
                        print("Please enter a valid number.")
                else:
                    #print("\n \n")
                    print("______________________________________________________")
                    print(""+name+" has successfully borrowed the book.")
                    print ("_____________________________________________________")
                    print("Thankyou for using the Library Management System.")
                    break
        else:
            print("Sorry, the book is currently not available")
    else:
        print("Please emter a valid number")
    




def book_list():
    print("___________________________________________________________________________")
    print("Book ID"+"      "+"Book Name"+"          "+" Author" +
          "              "+"Quantity"+"    "+"Price")
    print("___________________________________________________________________________")
    listBooks = lists()
    for key, value in listBooks.items():
        print("  ", key, "       ",
              value[0], " ", value[1], "      ", value[2], "      ", value[3])
    print("___________________________________________________________________________")


def change_quantity(val):
    listBooks = lists()
    quantity = int(listBooks[val][2])-1
    listBooks[val][2] = str(quantity).zfill(2)
    file = open("Books.txt", "w")
    for key, value in listBooks.items():
        file.write(value[0]+","+value[1]+","+value[2]+","+value[3]+"\n")
    file.close()
    print("_____________________________________________________________________")
    print("Book ID "+str(val) + " has been successfully borrowed.")


def total(I, val):
    listBooks = lists()
    price1 = (listBooks[I][3])
    price2 = (listBooks[val][3])
    p1 = float(price1.strip("$"))
    p2 = float(price2.strip("$"))
    total = round(p1+p2, 2)
    return str(total)

def bill(name, I, ID, t, d):
    listBooks = lists()
    year = str(datetime.datetime.now().year)
    month = str(datetime.datetime.now().month)
    day = str(datetime.datetime.now().day)
    second = str(datetime.datetime.now().second)
    
    with open("Borrow-"+name+""+year+""+month+""+day+""+second+".txt", "w+") as f:
        f.write("___________________________________ \n")
        f.write("")
        f.write("    Library Management System       \n")
        f.write("___________________________________ \n")
        f.write("The borrowed book is: "+listBooks[I][0])
        f.write(", "+listBooks[ID][0]+", ")
        f.write("\n Book is borrowed by: "+name+"\n")
        f.write("The time of borrowed book is: "+t+"\n")
        f.write("The date of borrowed book is : "+d+"\n")




