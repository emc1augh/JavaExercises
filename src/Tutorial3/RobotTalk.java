package Tutorial3;

import java.util.Random;

public class RobotTalk extends RobotMain {

    String[] u1 = { "Exterminate, Exterminate!", "I obey!", "You cannot escape.", "Robots do not feel fear.", "The Robots must survive!" };

    public void speak(){
        Random random = new Random();
        int select = random.nextInt(u1.length);
        System.out.println(u1[select] + "\n");
    }
}
