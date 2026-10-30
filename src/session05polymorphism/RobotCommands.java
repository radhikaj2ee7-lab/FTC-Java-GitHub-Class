package session05polymorphism;

abstract class Robot {

    protected String robotName;

    // Constructor
    public Robot(String name) {
        robotName = name;
    }

    // Concrete method: shared by all robot types
    public void displayName() {
        System.out.println("Robot Name: " + robotName);
    }

    // Abstract method: each child must implement this
    public abstract void performAction();

}


// Child class 1
class CompetitionRobot extends Robot {

    public CompetitionRobot(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(
                robotName + " moves forward quickly to score points!"
        );
    }
}


// Child class 2
class PracticeRobot extends Robot {

    public PracticeRobot(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(
                robotName + " moves forward slowly for practice."
        );
    }
}


// Child class 3
class TestRobot extends Robot {

    public TestRobot(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(
                robotName + " simulates moving forward without hardware."
        );
    }
}


// Main class
public class RobotCommands {

    public static void main(String[] args) {

        // Parent-class references pointing to child-class objects
        Robot robot1 = new CompetitionRobot("Falcon");
        Robot robot2 = new PracticeRobot("Eagle");
        Robot robot3 = new TestRobot("Tiger");

        System.out.println("=== Robot Information ===");
        robot1.displayName();
        robot2.displayName();
        robot3.displayName();

        System.out.println();

        System.out.println("=== Performing Robot Actions ===");

        // Same method call, different behavior
        robot1.performAction();
        robot2.performAction();
        robot3.performAction();
    }
}