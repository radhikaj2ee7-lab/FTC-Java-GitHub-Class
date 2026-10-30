package session01javabasics;

public class GlobalVariable {

    // Class-level variable
    static int batteryLevel = 90;

    public static void main(String[] args) {

        System.out.println("Starting battery: " + batteryLevel + "%");

        checkBattery();

        moveRobot();
    }

    public static void checkBattery() {
        System.out.println("Checking battery: " + batteryLevel + "%");
    }

    public static void moveRobot() {
        System.out.println("Robot moving with battery at "
                + batteryLevel + "%");
    }
}