public class Driver {
    public static void main(String[] args) {
        // Create an instance of Mark2025
        Mark2025 mark = new Mark2025();
        Mark2025 mark2 = new Mark2025();
        
        // Display the version of Mark2025
        mark.displayVersion();
        
        // Modify the version and display it again
        mark.version = 2.0;
        mark.displayVersion();
    }
}
