package session03classesobjects;

public class Robot {

    // 1. Instance variables (properties of each robot)
    private String robotName;
    private int batteryLevel;
    private int wheels;

    // 2. Constructor: initializes a new Robot object
    public Robot(String name, int battery, int wheelCount) {
        robotName = name;
        batteryLevel = battery;
        wheels = wheelCount;
    }

    // 3. Method to display robot information
    public void displayInfo() {
        System.out.println("Robot Name: " + robotName);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Number of Wheels: " + wheels);
    }

    // 4. Method to simulate moving forward
    public void moveForward() {
        System.out.println(robotName + " is moving forward!");
    }

    // 5. Method to simulate turning
    public void turnRight() {
        System.out.println(robotName + " is turning right!");
    }

    // 6. Method to stop the robot
    public void stop() {
        System.out.println(robotName + " has stopped.");
    }

    // 7. Getter: allows other classes to read the battery level
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // 8. Method to use battery power safely
    public void useBattery(int amount) {
        if (amount > 0 && amount <= batteryLevel) {
            batteryLevel -= amount;
            System.out.println(amount + "% battery used.");
        } else {
            System.out.println("Invalid amount or insufficient battery!");
        }
    }
}