"""
String Utilities Module - AI Generated Sample
Provides various string manipulation functions
"""

def reverse_string(input_string: str) -> str:
    """
    Reverse a string
    
    Args:
        input_string: String to reverse
    
    Returns:
        Reversed string
    """
    result = input_string[::-1]
    return result

def is_palindrome(input_string: str) -> bool:
    """
    Check if a string is a palindrome
    
    Args:
        input_string: String to check
    
    Returns:
        True if palindrome, False otherwise
    """
    # Remove spaces and convert to lowercase
    cleaned = input_string.replace(" ", "").lower()
    
    # Check if string equals its reverse
    result = cleaned == cleaned[::-1]
    return result

def count_vowels(input_string: str) -> int:
    """
    Count the number of vowels in a string
    
    Args:
        input_string: String to analyze
    
    Returns:
        Number of vowels
    """
    vowels = "aeiouAEIOU"
    count = 0
    
    for char in input_string:
        if char in vowels:
            count += 1
    
    return count

def count_words(input_string: str) -> int:
    """
    Count the number of words in a string
    
    Args:
        input_string: String to analyze
    
    Returns:
        Number of words
    """
    words = input_string.split()
    count = len(words)
    return count

def capitalize_words(input_string: str) -> str:
    """
    Capitalize the first letter of each word
    
    Args:
        input_string: String to capitalize
    
    Returns:
        Capitalized string
    """
    words = input_string.split()
    capitalized_words = []
    
    for word in words:
        if len(word) > 0:
            capitalized = word[0].upper() + word[1:]
            capitalized_words.append(capitalized)
    
    result = " ".join(capitalized_words)
    return result

def remove_duplicates(input_string: str) -> str:
    """
    Remove duplicate characters from string
    
    Args:
        input_string: String to process
    
    Returns:
        String with duplicates removed
    """
    seen = set()
    result = []
    
    for char in input_string:
        if char not in seen:
            seen.add(char)
            result.append(char)
    
    return "".join(result)

# Example usage:
if __name__ == "__main__":
    # Test string
    test_string = "hello world"
    
    # TODO: Demonstrate all functions
    print(f"Original: {test_string}")
    print(f"Reversed: {reverse_string(test_string)}")
    print(f"Is palindrome: {is_palindrome(test_string)}")
    print(f"Vowel count: {count_vowels(test_string)}")
    print(f"Word count: {count_words(test_string)}")
    print(f"Capitalized: {capitalize_words(test_string)}")
    print(f"No duplicates: {remove_duplicates(test_string)}")
