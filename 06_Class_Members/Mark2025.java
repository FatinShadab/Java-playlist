public class Mark2025 {
    public double version = 1.0; // class member field/variable
    public static double __version = 1.0; // static class member field/variable
    

    { // instance initializer block
        System.out.println("Instance initializer block executed. Initializing version to: " + version);
    }

    static { // static initializer block
        __version = 2.0; // Initialize the static variable
        System.out.println("Static initializer block executed. Setting version to: " + __version);
    }

    public Mark2025() {
        // Constructor
        System.out.println("Mark2025 instance created with version: " + version);
    }

    public static void classMethod() {
        System.out.println("This is a static method in Mark2025." + __version);
    }

    public void displayVersion() {
        System.out.println("Mark2025 Version: " + version);
    }
}
