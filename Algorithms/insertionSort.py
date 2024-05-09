A=[]
for v in range(1,6):
    temp = int(input("Enter a number : "))
    while temp <= 0 or temp >= 20:
        print("Enter numbers between 0 to 20")
        temp = int(input("Enter a number : "))
    A.append(temp)

print(A)

def insertionSort(A):
    length = len(A)
    for j in range(1,length):
        key = A[j]
        i = j-1
        while(i>=0 and A[i]<key):
            A[i+1] = A[i]
            i = i-1
        A[i+1] = key


insertionSort(A)

print("Sorted one : ", A)
