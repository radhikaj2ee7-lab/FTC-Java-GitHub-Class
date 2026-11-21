package sourya.session02loopsmethods;

public class AutonomousSequence {
    static int shipLocation = 300;
    static int enemy = 200;

    public static void enemyDistance() {
        while (enemy > shipLocation) {
            System.out.println("you are safe");
            System.out.println("you are not safe there is an enemy");
        }

    }




    public static void checkBattery(int batteryLevel) {
        if (batteryLevel >= 50) {
            System.out.println("Aight you looking good your bettery is good");
        }
        else{
            System.out.println(" Charge the ship dock fast");
        }
    }

    public static void getShipCurrentPosition() {
        shipLocation += 10;
        System.out.println("placeholder");

    }



    public static void trackPosition() {
        for (int i = 0; i < 76; i++){
            getShipCurrentPosition();


        }


    }

    public static void main(String[] args) {
        trackPosition();
        checkBattery(21);
        enemyDistance();


    }

}