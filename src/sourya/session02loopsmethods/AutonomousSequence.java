

public class AutonomousSequence {
    shipPosition = 300
    enemy = 765

    public void EnemyDistance() {
        while enemy > shipPosition:
            print("you are safing")

        print("NOT SAFING ENEMY HEREING")
    }



    public void BatteryCheckng(int batteryLevel) {
        if (batteryLevel >= 50) {
            print("Aight you bettery lookin good keep goin");
        }
        else
            print(" Charge the ship gang dock fast")
        }
    }

    public void getShipCurrentPostion() {
    shipPosition = shipPosition + 1
            print(shipPosition)

    }



    public void TrackPosition() {
        for i in range(10):
            getShipCurrentPosition()





    }

    public static void main() {
        getShipCurrentPostion()
        BatteryCheckng()
        EnemyDistance()
        TrackPosition()


    }

}