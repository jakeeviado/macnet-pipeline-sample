import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * DataProcessor Class - AI Generated Sample
 * Process and analyze data collections
 */
public class DataProcessor {
    
    private List<DataItem> data;
    private List<DataItem> processedData;
    
    /**
     * Constructor to initialize the DataProcessor
     */
    public DataProcessor() {
        this.data = new ArrayList<>();
        this.processedData = new ArrayList<>();
    }
    
    /**
     * Load data into the processor
     * 
     * @param items List of data items to load
     */
    public void loadData(List<DataItem> items) {
        this.data = new ArrayList<>(items);
    }
    
    /**
     * Filter data based on minimum value
     * 
     * @param minValue Minimum value threshold
     * @return Filtered list of data items
     */
    public List<DataItem> filterByMinValue(int minValue) {
        List<DataItem> result = new ArrayList<>();
        
        for (DataItem item : data) {
            if (item.getValue() >= minValue) {
                result.add(item);
            }
        }
        
        return result;
    }
    
    /**
     * Sort data by value in ascending order
     * 
     * @return Sorted list of data items
     */
    public List<DataItem> sortByValue() {
        List<DataItem> sorted = new ArrayList<>(data);
        
        Collections.sort(sorted, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem item1, DataItem item2) {
                return Integer.compare(item1.getValue(), item2.getValue());
            }
        });
        
        return sorted;
    }
    
    /**
     * Calculate the average value of all items
     * 
     * @return Average value
     */
    public double calculateAverage() {
        if (data.isEmpty()) {
            return 0.0;
        }
        
        int sum = 0;
        for (DataItem item : data) {
            sum += item.getValue();
        }
        
        double average = (double) sum / data.size();
        return average;
    }
    
    /**
     * Find the maximum value in the data
     * 
     * @return Maximum value
     */
    public int findMaxValue() {
        if (data.isEmpty()) {
            return 0;
        }
        
        int max = data.get(0).getValue();
        
        for (DataItem item : data) {
            if (item.getValue() > max) {
                max = item.getValue();
            }
        }
        
        return max;
    }
    
    /**
     * Find the minimum value in the data
     * 
     * @return Minimum value
     */
    public int findMinValue() {
        if (data.isEmpty()) {
            return 0;
        }
        
        int min = data.get(0).getValue();
        
        for (DataItem item : data) {
            if (item.getValue() < min) {
                min = item.getValue();
            }
        }
        
        return min;
    }
    
    /**
     * DataItem inner class
     */
    public static class DataItem {
        private String name;
        private int value;
        
        /**
         * Constructor for DataItem
         * 
         * @param name Name of the item
         * @param value Value of the item
         */
        public DataItem(String name, int value) {
            this.name = name;
            this.value = value;
        }
        
        /**
         * Get the name of the item
         * 
         * @return Item name
         */
        public String getName() {
            return name;
        }
        
        /**
         * Get the value of the item
         * 
         * @return Item value
         */
        public int getValue() {
            return value;
        }
        
        /**
         * String representation of DataItem
         * 
         * @return String representation
         */
        @Override
        public String toString() {
            return "DataItem{name='" + name + "', value=" + value + "}";
        }
    }
    
    /**
     * Main method - Example usage
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // TODO: Demonstrate data processor functionality
        
        // Initialize processor
        DataProcessor processor = new DataProcessor();
        
        // Create sample data
        List<DataItem> sampleData = new ArrayList<>();
        sampleData.add(new DataItem("Item1", 50));
        sampleData.add(new DataItem("Item2", 75));
        sampleData.add(new DataItem("Item3", 30));
        sampleData.add(new DataItem("Item4", 90));
        
        // Load data
        processor.loadData(sampleData);
        
        // Process data
        System.out.println("Average: " + processor.calculateAverage());
        System.out.println("Max: " + processor.findMaxValue());
        System.out.println("Min: " + processor.findMinValue());
        System.out.println("Sorted: " + processor.sortByValue());
        System.out.println("Filtered (>= 50): " + processor.filterByMinValue(50));
    }
}
