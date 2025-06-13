public class Driver {
    public static void main(String[] args) {
        // Calling static method before any object creation
        Mark2025.displayCreator();

        System.out.println("*# Creating first suit...");
        Mark2025 suit1 = new Mark2025(); // constructor + instance block will run
        suit1.info();

        System.out.println("\n*# Creating second suit...");
        Mark2025 suit2 = new Mark2025(); // constructor + instance block will run again
        suit2.model = "Mark-2025X";      // modifying object-specific data
        suit2.version = 2026;
        suit2.info();
    }
}
