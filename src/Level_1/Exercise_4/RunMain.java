package Level_1.Exercise_4;

import Level_1.Exercise_4.model.*;
import java.io.File;
import java.util.ArrayList;

public class RunMain {

    public static void start(String[] args) {

        if (args.length < 2){
            System.out.println("Usage: java -cp bin Level_1.Exercise_4.Main <directoryPath> <fileName>");
            return;
        }

        String dirPath = args[0];
        String fileName = args[1];

        File textFile = new File(dirPath, fileName);

        if (!textFile.exists() || !textFile.isFile()) {
            System.err.println("File not found in directory: " + textFile.getPath());
            return;
        }

        FileReaderClass fileReader = new FileReaderClass();

        try {
            ArrayList<String> fileContents = fileReader.readFile(textFile);
            fileReader.printToConsole(fileContents);
        } catch (IllegalArgumentException iae) {
            System.err.println("Error: " + iae.getMessage());
        }
    }
}