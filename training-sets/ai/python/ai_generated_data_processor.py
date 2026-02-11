"""
Data Processor Module - AI Generated Sample
Process and analyze data collections
"""

import json
from typing import List, Dict, Any

class DataProcessor:
    """
    A class to process and analyze data
    """
    
    def __init__(self):
        """
        Initialize the DataProcessor
        """
        self.data = []
        self.processed_data = []
    
    def load_data(self, data: List[Dict[str, Any]]) -> None:
        """
        Load data into the processor
        
        Args:
            data: List of dictionaries containing data
        """
        self.data = data
    
    def filter_data(self, key: str, value: Any) -> List[Dict[str, Any]]:
        """
        Filter data based on key-value pair
        
        Args:
            key: The key to filter on
            value: The value to match
        
        Returns:
            Filtered list of data items
        """
        result = []
        for item in self.data:
            if item.get(key) == value:
                result.append(item)
        return result
    
    def sort_data(self, key: str, reverse: bool = False) -> List[Dict[str, Any]]:
        """
        Sort data by specified key
        
        Args:
            key: The key to sort by
            reverse: Whether to sort in descending order
        
        Returns:
            Sorted list of data items
        """
        sorted_data = sorted(self.data, key=lambda x: x.get(key, 0), reverse=reverse)
        return sorted_data
    
    def calculate_average(self, key: str) -> float:
        """
        Calculate average value for numeric key
        
        Args:
            key: The numeric key to average
        
        Returns:
            Average value
        """
        total = 0
        count = 0
        for item in self.data:
            value = item.get(key)
            if value is not None:
                total += value
                count += 1
        
        if count == 0:
            return 0.0
        
        average = total / count
        return average
    
    def export_to_json(self, filename: str) -> None:
        """
        Export processed data to JSON file
        
        Args:
            filename: Output filename
        """
        with open(filename, 'w') as file:
            json.dump(self.processed_data, file, indent=2)

# Example usage:
if __name__ == "__main__":
    # Initialize processor
    processor = DataProcessor()
    
    # Sample data
    sample_data = [
        {"name": "Alice", "age": 30, "score": 85},
        {"name": "Bob", "age": 25, "score": 92},
        {"name": "Charlie", "age": 35, "score": 78},
    ]
    
    # Load data
    processor.load_data(sample_data)
    
    # Process data
    filtered = processor.filter_data("age", 30)
    sorted_data = processor.sort_data("score", reverse=True)
    avg_score = processor.calculate_average("score")
    
    # Display results
    print(f"Filtered data: {filtered}")
    print(f"Sorted data: {sorted_data}")
    print(f"Average score: {avg_score}")
