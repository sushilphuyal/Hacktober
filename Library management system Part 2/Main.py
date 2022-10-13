import borrow
import Return
import sys
    
def starting():
    print ("____________________________________________________")
    print("")
    print ("  Welcome to The Library Management System")
    print ("____________________________________________________")
    print("\n")

    print("books available in the library : \n")
    borrow.book_list()
    print("\n")
    
    while(True):
        
        print("")
        print("Enter 1 to borrow a book. ")
        print("Enter 2 to return a book.  ")
        print("Enter 3 to exit. ")
        
        num = int(input(": "))
        
        if num == 1:
            loop = True
            while loop == True:
                
                borrow.borrowBook()
                borrow.book_list()    
                break    
        elif num == 2:
            #print("You are now returning a book. \n")
            Return.return_book()
            Return.book_list()
            

        elif num == 3:
            sys.exit()
            
            

        else:
            print("\n")
            print("_______________________________________")
            print ("")
            print("please input a valid number. try again!")
            print("_______________________________________\n")

        
    
starting()
