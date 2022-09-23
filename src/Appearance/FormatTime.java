package Appearance;

import java.util.ArrayList;

public class FormatTime {
    public static void printFormattedTime (int minutes, int seconds) {
        // Converting integers to String
        String stringMinutes = Integer.toString(minutes);
        String stringSeconds = Integer.toString(seconds);

        // Formatting minutes and seconds on the format "mm:ss" or "hh:mm:ss"
        if (minutes < 10) {
            stringMinutes = "0" + minutes;
        } else if (minutes == 60) {
            stringMinutes = "01" + " " + ":" + " " + "00";
        }

        if (seconds < 10 || seconds == 0) {
            stringSeconds = "0" + seconds;
        }

        // Storing minutes and seconds on list
        ArrayList<String> formattedTimes = new ArrayList<String>();

        formattedTimes.add(stringMinutes);
        formattedTimes.add(stringSeconds);

        // Creating string array to execute command on terminal
        String[] center = new String[]{"/bin/bash", "-c", "LINES=$(tput lines); MIDDLE=$((LINES/3)); tput cup $MIDDLE;"};
        String[] figlet = new String[]{"figlet", "-tc", formattedTimes.get(0) + " " + ":" + " " + formattedTimes.get(1)};

        // Executing command and handling exceptions
        try {
            new ProcessBuilder(center).inheritIO().start().waitFor();
            new ProcessBuilder(figlet).inheritIO().start().waitFor();
        } catch (Exception e){}

    }
}
