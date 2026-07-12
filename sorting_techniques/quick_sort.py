def partition(arr,low,high):
    index= low-1
    pivot = arr[high]
    
    for j in range(low,high):
        if arr[j]<=pivot:
            index+=1
            arr[index],arr[j]=arr[j],arr[index]
        
    index+=1
    arr[index],arr[high]=arr[high],arr[index]
    return index


def QuickSort(arr,low,high):
    if low<high:
        pi=partition(arr,low,high)
        
        
        QuickSort(arr,low,pi-1)## left part
        QuickSort(arr,pi+1,high)## right part

##main

arr=[1023,2398,1983,498,94782,1,42,3]
QuickSort(arr,0,len(arr)-1)
print(arr)