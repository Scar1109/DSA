def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

def calculate_statistics(arr):
    # Average
    average = sum(arr) / len(arr)
    
    # Range
    arr_range = max(arr) - min(arr)
    
    # Min and Max
    arr_min = min(arr)
    arr_max = max(arr)
    
    # Mode
    counts = {}
    for num in arr:
        counts[num] = counts.get(num, 0) + 1
    mode = max(counts, key=counts.get)
    
    # Median
    n = len(arr)
    sorted_arr = sorted(arr)
    if n % 2 == 0:
        median = (sorted_arr[n//2 - 1] + sorted_arr[n//2]) / 2
    else:
        median = sorted_arr[n//2]
    
    # Percentiles
    percentiles = {
        '25th': sorted_arr[int(n * 0.25)],
        '50th': sorted_arr[int(n * 0.5)],
        '75th': sorted_arr[int(n * 0.75)],
    }
    
    return {
        'average': average,
        'range': arr_range,
        'min': arr_min,
        'max': arr_max,
        'mode': mode,
        'median': median,
        'percentiles': percentiles,
    }

# Example usage:
arr = [12, 6, 8, 3, 9, 2, 5]
insertion_sort(arr)
statistics = calculate_statistics(arr)
print("Sorted array:", arr)
print("Statistics:", statistics)
