package Level_1.Exercise_2;

import Level_1.Exercise_2.model.FileExplorer;

import java.io.File;

public class RunMain {

    public static void start(String[] args){

        FileExplorer fileExplorer = new FileExplorer();

        if (args.length < 1){
            System.out.println("Please provide a directory path: ");
            return;
        }

        try {
            String filepath = args[0];
            fileExplorer.listDirectoryContents(new File(filepath));
        } catch (IllegalArgumentException iae) {
            System.err.println("Error: " + iae.getMessage());
        }
    }
}