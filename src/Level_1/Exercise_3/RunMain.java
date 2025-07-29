package Level_1.Exercise_3;

import Level_1.Exercise_3.model.FileExplorer;
import Level_1.Exercise_3.model.FileExporter;

import java.io.File;
import java.util.List;

public class RunMain {

    public static void start(){

        FileExplorer fileExplorer = new FileExplorer();
        FileExporter fileExporter = new FileExporter();

        try {
            File filepath = new File("C:" + File.separator + "Users" + File.separator + "dcs19" + File.separator +
                    "IdeaProjects" + File.separator + "S105_Utils" + File.separator + "src");

            List<String> directoryContentsLines = fileExplorer.listDirectoryContents(filepath);
            fileExporter.exportFile(directoryContentsLines);
        } catch (IllegalArgumentException iae) {
            System.err.println("Error: " + iae.getMessage());
        }
    }
}