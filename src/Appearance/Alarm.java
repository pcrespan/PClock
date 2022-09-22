package Appearance;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class Alarm extends JFrame {
    
    // Creating constructor
    public Alarm() {
        // Defining JFrame characteristics
        this.setVisible(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Handling errors
        try {
            // URL to .wav file
            URL url = this.getClass().getClassLoader().getResource("analog_watch.wav");

            // Defining AudioInputStream, which will be the file on the URL
            AudioInputStream audioInpStream = AudioSystem.getAudioInputStream(url);

            // Storing audio format
            AudioFormat audioFileFormat = audioInpStream.getFormat();

            // Calculating duration of audio file
            String audioDuration = String.valueOf(Math.round((audioInpStream.getFrameLength() / audioFileFormat.getFrameRate()) * Math.pow(10, 3)));
            int audioDurationSec = Integer.parseInt(audioDuration);

            // Creating clip object to play 
            Clip clip = AudioSystem.getClip();

            // Opening input stream and playing it using JFrame
            clip.open(audioInpStream);
            clip.start();

            // Sleeping the amount of time needed for the alarm to finish
            Thread.sleep(audioDurationSec);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
