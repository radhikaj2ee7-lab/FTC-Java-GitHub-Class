package session03classesobjects;

public class RobotMain {

    public static void main(String[] args) {

        // Create the first Robot object
        Robot robot1 = new Robot("Falcon", 100, 4);

        // Create the second Robot object
        Robot robot2 = new Robot("Eagle", 80, 6);

        // Display information about both robots
        System.out.println("=== Robot 1 ===");
        robot1.displayInfo();

        System.out.println();

        System.out.println("=== Robot 2 ===");
        robot2.displayInfo();

        System.out.println();

        // Make the robots perform actions
        robot1.moveForward();
        robot1.turnRight();

        robot2.moveForward();
        robot2.stop();

        System.out.println();

        // Demonstrate encapsulation
        robot1.useBattery(20);

        System.out.println(
                "Falcon battery remaining: " +
                        robot1.getBatteryLevel() + "%"
        );
    }
}