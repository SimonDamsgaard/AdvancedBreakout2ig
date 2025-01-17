package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Set;
import javafx.stage.Screen;

public class OptionsModel {
    private static double sceneWidth = Screen.getPrimary().getBounds().getWidth();
    private static double sceneHeight = Screen.getPrimary().getBounds().getHeight();
    private static LinkedHashMap<String, Double> optionsMap;
    private static String filePath = System.getProperty("user.dir")+"/options.txt";
    
    private static LinkedHashMap<String, Double> defaultSettings() {
        LinkedHashMap<String, Double> optionsMap = new LinkedHashMap<>();
        optionsMap.put("MusicVolume", 0.2);
        optionsMap.put("SoundVolume", 1.0);
        return optionsMap;
    }

    public static void loadOptions() throws IOException {
        File file = new File(filePath);
        if (!file.isFile()) {
            optionsMap = defaultSettings();
            return;
        }
        optionsMap = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader lineReader = new BufferedReader(fileReader);
        String line = lineReader.readLine();

        while (line != null) {
            String[] parts = line.split("=", 2);
            optionsMap.put(parts[0].trim(), Double.valueOf(parts[1].trim()));
            line = lineReader.readLine();
        }

        lineReader.close();
    }

    public static void updateOptions() throws IOException {
        File file = new File(filePath);
        if (!file.isFile()) {
            file.createNewFile();
        }
        PrintWriter writer = new PrintWriter(file);
        Set<String> keys = optionsMap.keySet();
        for (String key : keys) {
            writer.println(key+"="+optionsMap.get(key));
        }
        writer.close();
    }

    public static double getSceneWidth() {
        return sceneWidth;
    }
    public static double getSceneHeight() {
        return sceneHeight;
    }
    public static double getMusicVolume() {
        return optionsMap.get("MusicVolume");
    }
    public static double getSoundVolume() {
        return optionsMap.get("SoundVolume");
    }

    public static void setMusicVolume(double volume) {
        optionsMap.put("MusicVolume", volume);
    }

    public static void setSoundVolume(double volume) {
        optionsMap.put("SoundVolume", volume);
    }
}