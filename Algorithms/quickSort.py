def quickSort(A,p,r):
    if(p<r):
        q = partition(A,p,r)
        quickSort(A,q+1,r)
        quickSort(A,p,q-1)

def partition(A,p,r):
    x=A[r]
    i=p-1
    for j in range(p,r):
        if(A[j]<=x):
            i=i+1
            A[i],A[j] = A[j],A[i]

    A[i+1],A[r]=A[r],A[i+1]
    return (i+1)


A=[]
for v in range(1,6):
    A.append(int(input("Enter a number : ")))

print("Priginal array ",A)
quickSort(A,0,len(A)-1)
print("Sorted array ", A)
