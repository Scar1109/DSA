A=[]
for v in range(1,6):
    A.append(int(input("Enter a number : ")))

print(A)

def newInsertionSort(A):
    length = len(A)
    for j in range(1,length):
        i=0
        while(A[j]>A[i]):
            i=i+1
        key = A[j]
        for k in range(0,j-i-1):
            A[j-k] = A[j-k-1]
        A[i]=key
