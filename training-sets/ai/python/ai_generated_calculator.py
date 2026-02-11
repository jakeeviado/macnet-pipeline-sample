"""
Calculator Module - AI Generated Sample
This module provides basic arithmetic operations
"""

def add(a, b):
    """
    Add two numbers together
    
    Args:
        a: First number
        b: Second number
    
    Returns:
        Sum of a and b
    """
    result = a + b
    return result

def subtract(a, b):
    """
    Subtract second number from first number
    
    Args:
        a: First number
        b: Second number
    
    Returns:
        Difference of a and b
    """
    result = a - b
    return result

def multiply(a, b):
    """
    Multiply two numbers together
    
    Args:
        a: First number
        b: Second number
    
    Returns:
        Product of a and b
    """
    result = a * b
    return result

def divide(a, b):
    """
    Divide first number by second number
    
    Args:
        a: First number (numerator)
        b: Second number (denominator)
    
    Returns:
        Quotient of a and b
    
    Raises:
        ValueError: If b is zero
    """
    if b == 0:
        raise ValueError("Cannot divide by zero")
    result = a / b
    return result

# Example usage:
if __name__ == "__main__":
    # Initialize variables
    num1 = 10
    num2 = 5
    
    # Perform operations
    print(f"Addition: {add(num1, num2)}")
    print(f"Subtraction: {subtract(num1, num2)}")
    print(f"Multiplication: {multiply(num1, num2)}")
    print(f"Division: {divide(num1, num2)}")
