
def get_even(number):
    return number % 2 == 0

def get_prime_number(number):
    if number <= 1:
        return False
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            return False
    return True

def get_subtraction(number1, number2):
    return abs(number1 - number2)

def get_quotient(num1, num2):
    return 0 if num2 == 0 else num1 / num2

def count_factors(number):
    count = 0
    for i in range(1, number + 1):
        if number % i == 0:
            count += 1
    return count

def get_square(number):
    if number < 0:
        return False
    sqrt = int(number**0.5)
    return sqrt * sqrt == number

def get_palindrome(number):
    return str(number) == str(number)[::-1]

def calculate_factorial(number):
    factorial = 1
    for i in range(2, number + 1):
        factorial *= i
    return factorial

def square(number):
    return number * number

# Testing the functions
print(get_even(3))                 # False
print(get_prime_number(29))        # True
print(get_subtraction(3, 7))       # 4
print(get_quotient(5, 4))          # 1.25
print(count_factors(10))           # 4
print(get_square(25))              # True
print(get_palindrome(12321))       # True
print(calculate_factorial(5))      # 120
print(square(10))                  # 100
