
package session02loopsmethods;

public class AutonomousSequence2 {
    static boolean rain = false;
    static int x = 1;

public static void main(String[] args) {

    for (int i = 1; i < 10; i++) {
        System.out.println("hello");
    }
    While();
    If();
}

public static void While() {
    while ( x <10){
        System.out.println("True");
        x++;
    }
}

public static void If()

{
    if (rain != true) {
        System.out.println("Its not raining");
    }
}
}
