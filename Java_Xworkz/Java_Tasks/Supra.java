class Supra {
    
    static void startEngine() {
        System.out.println("Supra's engine is starting...");
        checkFuelLevel();
        systemDiagnostics();
        activateTurbo();
        setDefaultDriveMode();
    }

    static void checkFuelLevel() {
        System.out.println("Checking fuel level...");
    }

    static void systemDiagnostics() {
        System.out.println("Running system diagnostics...");
    }

    static void activateTurbo() {
        System.out.println("Turbo system activated...");
    }

    static void setDefaultDriveMode() {
        System.out.println("Setting drive mode to Normal...");
    }

    // Static methods to be called from another class
    static void accelerate() {
        System.out.println("Supra is accelerating...");
    }

    static void applyBrakes() {
        System.out.println("Applying brakes...");
    }

    static void playMusic() {
        System.out.println("Playing music...");
    }

    static void enableGPS() {
        System.out.println("GPS navigation enabled...");
    }

    static void turnOffEngine() {
        System.out.println("Turning off the engine...");
    }
}

public class SupraTest {
    public static void main(String[] args) {
        
        Supra.accelerate();
        Supra.applyBrakes();
        Supra.playMusic();
        Supra.enableGPS();
        Supra.turnOffEngine();
        
        
        Supra.startEngine();
    }
}
