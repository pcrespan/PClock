package Appearance;

import java.io.IOException;

public class PrintCenter {
    public static void printStatusCenter (String status) {
        
        // Executing command on array and handling errors
        try {
            String[] centerStatus = new String[]{"/bin/bash", "-c", "LINES=$(tput lines); MIDDLE=$((LINES/3 - 2)); tput cup $MIDDLE;"};
            // Figlet is in charge of centralizing the status on terminal
            String[] print = new String[]{"figlet", "-tc", status, "-f", "term"};
            new ProcessBuilder(centerStatus).inheritIO().start().waitFor();
            new ProcessBuilder(print).inheritIO().start().waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
