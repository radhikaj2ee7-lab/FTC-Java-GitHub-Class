package session02loopsmethods;

public class AnayAutonomousSequence {

    // Method to check if the robot is moving
    public static void checkRacecarDriving(boolean RacecarDriving) {
        System.out.println("Is racecar driving?");

        if (robotMoving == true) {
            System.out.println("Racecar is driving");
        } else {
            System.out.println("Racecar is not driving");
        }
    }

    // While loop
    public static void driveRacecar() {
        int movement = 1;

        while (movement <= 3) {
            System.out.println("Racecar driving - movement " + movement);
            movement++;
        }
    }

    // For loop
    public static void driveForward(int movement) {
        for (int i = 1; i <= movement; i++) {
            System.out.println("Racecat driving forward - movement " + i);
        }
    }

    // Turning robot
    public static void turnRight() {
        System.out.println("Turn right");
    }

    public static void turnLeft() {
        System.out.println("Turn left");
    }

    // Stopping the robot
    public static void racecarBrake() {
        System.out.println("Braking racecar.");
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("Start");

        boolean racecarDriving = true;

        checkRacecarDriving(racecarDriving);

        driveRacecar();

        driveForward(3);

        turnRight();

        driveForward(2);

        turnLeft();

        racecarBrake();

        checkRacecarDriving(false);

        System.out.println("Completed");
    }
}
