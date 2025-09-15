package Level_1.Exercise_3;

import Level_1.Exercise_3.model.FileExplorer;
import Level_1.Exercise_3.model.FileExporter;
import java.io.File;
import java.util.ArrayList;

public class RunMain {

    public static void start(String[] args){

        FileExplorer fileExplorer = new FileExplorer();
        FileExporter fileExporter = new FileExporter();

        if (args.length < 2){
            System.out.println("Usage: java -cp bin Level_1.Exercise_3.Main <inputDir> <outputDir>");
            return;
        }

        String inputDir = args[0];
        String outputDir = args[1];

        try {
            ArrayList<String> directoryContentsLines = fileExplorer.listDirectoryContents(new File(args[0]));

            for (String line : directoryContentsLines){
                System.out.println(line);
            }

            fileExporter.exportFile(directoryContentsLines, outputDir);
        } catch (IllegalArgumentException iae) {
            System.err.println("Error: " + iae.getMessage());
        }
    }
}