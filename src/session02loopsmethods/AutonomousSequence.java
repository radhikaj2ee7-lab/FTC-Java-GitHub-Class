package session02loopsmethods;

public class AutonomousSequence {

    // Method to simulate moving the robot forward
    public static void moveForward(int steps) {
        for (int i = 1; i <= steps; i++) {
            System.out.println("Robot moving forward - Step " + i);
        }
    }

    // Method to simulate turning the robot
    public static void turnRight() {
        System.out.println("Robot turning right!");
    }

    // Method to simulate stopping the robot
    public static void stopRobot() {
        System.out.println("Robot stopped.");
    }

    // Method to check the battery level
    public static void checkBattery(int batteryLevel) {
        System.out.println("Checking battery...");

        if (batteryLevel >= 50) {
            System.out.println("Battery OK. Ready to run!");
        } else {
            System.out.println("Battery low! Please charge before running.");
        }
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        System.out.println("=== FTC Autonomous Sequence Started ===");

        int batteryLevel = 80;

        // Step 1: Check the battery
        checkBattery(batteryLevel);

        // Step 2: Run the autonomous sequence only if the battery is sufficient
        if (batteryLevel >= 50) {

            // Step 3: Move forward 3 steps
            moveForward(3);

            // Step 4: Turn right
            turnRight();

            // Step 5: Move forward 2 steps
            moveForward(2);

            // Step 6: Stop the robot
            stopRobot();

        } else {
            System.out.println("Autonomous sequence cancelled.");
        }

        System.out.println("=== FTC Autonomous Sequence Finished ===");
    }
}