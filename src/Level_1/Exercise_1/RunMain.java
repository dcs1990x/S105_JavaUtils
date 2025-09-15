package Level_1.Exercise_1;

import Level_1.Exercise_1.model.FileExplorer;

public class RunMain {

    public static void start(String[] args){

        FileExplorer fileExplorer = new FileExplorer();

        if (args.length < 1){
            System.out.println("Please provide a directory path: ");
            return;
        }

        try {
            String filepath = args[0];
            fileExplorer.listDirectoryContents(filepath);
        } catch (IllegalArgumentException iae) {
            System.err.println("Error: " + iae.getMessage());
        }
    }
}