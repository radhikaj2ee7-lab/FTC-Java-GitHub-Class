package session04inheritance;

// Main class: Demonstrates inheritance
public class RobotFamily {

    public static void main(String[] args) {

        // Create a CompetitionRobot object
        CompetitionRobot robot1 =
                new CompetitionRobot("Falcon", 100, 25);

        // Create a PracticeRobot object
        PracticeRobot robot2 =
                new PracticeRobot("Eagle", 80);

        System.out.println("=== Competition Robot ===");
        robot1.displayInfo();
        robot1.prepareForCompetition();
        robot1.moveForward();
        robot1.stop();

        System.out.println();

        System.out.println("=== Practice Robot ===");
        robot2.displayInfo();
        robot2.practiceDriving();
        robot2.moveForward();
        robot2.stop();
    }
}
