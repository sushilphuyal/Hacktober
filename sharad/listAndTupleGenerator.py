inputString = input("Enter the value seperated by comma seperation: ")
list = list((inputString.split(",")))

intList = []
for i in (list):
    intList.append(int(i))
    
intTuple = tuple(intList)

print(intList)
print(intTuple)




