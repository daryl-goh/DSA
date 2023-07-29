n = int(input("Enter a number: "))
sumList = []
for i in range(n):
    if i % 3 == 0 or i % 5 == 0:
        sumList.append(i)
        
# return sum(sumList)
print (sum(sumList))