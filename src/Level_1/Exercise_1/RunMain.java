package Level_1.Exercise_1;

import Level_1.Exercise_1.model.FileExplorer;

import java.io.File;
import java.util.Arrays;

public class RunMain {

    public static void start(){

        FileExplorer fileExplorer = new FileExplorer();

        try {
            String filepath = "C:/Users/dcs19/IdeaProjects/S105_Utils/src/Level_1/Exercise_1";
            File[] files = fileExplorer.listDirectoryContents(filepath);
            Arrays.sort(files);
        } catch (IllegalArgumentException iae) {
            System.err.println("Error: " + iae.getMessage());
        }
    }
}