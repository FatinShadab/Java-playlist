public class Mark2025 {
    // 🔹 Instance Variables (object-specific)
    int version;
    String model;

    // 🔹 Static Variable (class-level)
    static String creator = "Tony Stark";

    // 🔹 Static Block (runs once when class is loaded)
    static {
        System.out.println("<i> Static block: Loading IronManSuit system...");
    }

    // 🔹 Instance Initializer Block (runs before constructor every time an object is created)
    {
        System.out.println("[i] Instance block: Initializing suit settings...");
    }

    // 🔹 Constructor (called during object creation)
    public Mark2025() {
        this.version = 2025;
        this.model = "Mark-2025";
        System.out.println("[i] Constructor: Mark2025 suit constructed.");
    }

    // 🔹 Instance Method (belongs to object)
    public void info() {
        System.out.println("[i] Suit Info:");
        System.out.println("Model: " + model);
        System.out.println("Version: " + version);
        System.out.println("Creator: " + creator); // static variable can be accessed here too
    }

    // 🔹 Static Method (belongs to class)
    public static void displayCreator() {
        System.out.println("<i> Static method: All suits are built by " + creator);
        // Cannot access instance variables like `model` or `version` here directly
    }
}
