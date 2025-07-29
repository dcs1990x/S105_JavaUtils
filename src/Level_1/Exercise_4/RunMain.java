package Level_1.Exercise_4;

import Level_1.Exercise_4.model.FileReaderClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class RunMain {

    public static void start() {

        File filepath = new File("C:" + File.separator + "Users" + File.separator + "dcs19" + File.separator +
                "IdeaProjects" + File.separator + "S105_Utils" + File.separator + "src" + File.separator + "Level_1" + File.separator +
                "Exercise_4" + File.separator + "resources" + File.separator + "animals.txt");

        try {
            FileReaderClass fileReader = new FileReaderClass();

            ArrayList<String> fileContents = fileReader.readFile(filepath);
            fileReader.printToConsole(fileContents);

        } catch(IOException ioe){
            System.err.println("An error occurred reading the file. " + ioe.getMessage());
        }
    }
}