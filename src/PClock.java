import java.util.ArrayList;

import Appearance.ClearTerminalScreen;
import TimeHandle.Timer;
import Appearance.Alarm;
import Appearance.PrintCenter;

public class PClock {
    public static void main(String[] args) {

        // Variables that will receive CL arguments
        int sessionDuration;
        int breakDuration;
        int sessionAmount;
        
        // List to receive converted ints
        ArrayList<Integer> intList = new ArrayList<Integer>();

        // Checking if there are enough arguments
        if (args.length < 3 || args.length > 3) {
            System.out.println("Usage: java App (sessionDuration) (breakDuration) (numberOfSessions)");
            System.exit(1);  
        } 
        
        // Converting Strings to ints
        for (String strConverter : args) {
            intList.add(Integer.parseInt(strConverter));
        }

        // Storing converted ints to variables
        sessionDuration = intList.get(0);
        breakDuration = intList.get(1);
        sessionAmount = intList.get(2);

        // Running timers
        try {
            for (int i = 1; i <= sessionAmount; i++) {
                // Session timer
                Timer.start(sessionDuration, breakDuration, "Session" + " " + i + "/" + sessionAmount); // Session timer

                // Break timer
                if (i < sessionAmount) {
                    new Alarm();
                    Timer.start(breakDuration, 0, "Break"); // Break timer
                    new Alarm();
                // Sessions finished
                } else {
                    ClearTerminalScreen.clear();
                    PrintCenter.printStatusCenter("Sessions finished!");
                    new Alarm();
                    ClearTerminalScreen.clear();
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}