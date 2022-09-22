package TimeHandle;

import Appearance.ClearTerminalScreen;
import Appearance.FormatTime;
import Appearance.PrintCenter;

public class Timer {

    public static void start(int sessionDuration, int breakDuration, String status) throws InterruptedException {

        int minutes = sessionDuration;
       
        minutes = sessionDuration;
        int seconds = 59;
        int firstMinute = sessionDuration;

        // Minutes
        for (int i = minutes; i >= 0; i--) {

            for (int j = seconds; j >= 0; j--) {
                ClearTerminalScreen.clear();
                PrintCenter.printStatusCenter(status);

                if (firstMinute == sessionDuration) {
                    j = 0;
                    FormatTime.printFormattedTime(i, j);
                    Thread.sleep(1000);
                    j = 60;
                    firstMinute--;
                    i--;
                } else {
                    FormatTime.printFormattedTime(i, j);
                    Thread.sleep(1000);
                }
            }
        }
    }
}