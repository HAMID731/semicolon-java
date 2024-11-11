arr = [10, 20, 30, 40, 50]
target = int(input("Enter the element to find its index: "))
index = -1
i = 0

while i < len(arr):
    if arr[i] == target:
        index = i
        break
    i += 1

if index != -1:
    print(f"Index of {target} is: {index}")
else:
    print(f"{target} is not in the array.")
