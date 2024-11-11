numbers = [1, 2, 3, 4, 5]
sum_values = 0
i = 0

while i < len(numbers):
    sum_values += numbers[i]
    i += 1

average = sum_values / len(numbers)
print("The average value is:", average)
