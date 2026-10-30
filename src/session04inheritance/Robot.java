package session04inheritance;

class Robot {

    // Properties shared by all robots
    protected String robotName;
    protected int batteryLevel;

    // Constructor for the parent class
    public Robot(String name, int battery) {
        robotName = name;
        batteryLevel = battery;
    }

    // Common behavior shared by all robots
    public void displayInfo() {
        System.out.println("Robot Name: " + robotName);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    public void moveForward() {
        System.out.println(robotName + " is moving forward.");
    }

    public void stop() {
        System.out.println(robotName + " has stopped.");
    }
}


// Child class 1: CompetitionRobot inherits from Robot
class CompetitionRobot extends Robot {

    private int autonomousPoints;

    public CompetitionRobot(String name, int battery, int points) {
        super(name, battery);  // Call the parent constructor
        autonomousPoints = points;
    }

    // Specialized behavior
    public void prepareForCompetition() {
        System.out.println(robotName + " is preparing for competition!");
    }

    // Override the parent's displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Autonomous Points: " + autonomousPoints);
    }
}


// Child class 2: PracticeRobot inherits from Robot
class PracticeRobot extends Robot {

    public PracticeRobot(String name, int battery) {
        super(name, battery);
    }

    // Specialized behavior
    public void practiceDriving() {
        System.out.println(robotName + " is practicing driving.");
    }

    // Override the parent's moveForward() method
    @Override
    public void moveForward() {
        System.out.println(robotName + " is moving forward slowly for practice.");
    }
}


