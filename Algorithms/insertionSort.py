A=[]
for v in range(1,6):
    A.append(int(input("Enter a number : ")))

print(A)

def insertionSort(A):
    length = len(A)
    for j in range(1,length):
        key = A[j]
        i = j-1
        while(i>=0 and A[i]>key):
            A[i+1] = A[i]
            i = i-1
        A[i+1] = key


insertionSort(A)

print("Sorted one : ", A)
