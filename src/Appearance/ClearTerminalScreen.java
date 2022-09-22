package Appearance;

public class ClearTerminalScreen {

    public static void clear() {
        // Declaring string array to use commands with bash
        // Using -c, otherwise it would display "cannot execute binary file"
        String[] clearCommand = new String[] {"/bin/bash", "-c", "clear"};

        // Executing command and handling errors
        try {
            new ProcessBuilder(clearCommand).inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
