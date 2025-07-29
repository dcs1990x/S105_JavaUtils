package Level_1.Exercise_1.model;

import java.io.File;

public class FileExplorer {

    public File[] listDirectoryContents(String directoryPath) throws IllegalArgumentException {

        File directory = new File(directoryPath);

        if (!directory.exists()) {
            throw new IllegalArgumentException("The directory does not exist: " + directoryPath);
        }

        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Path is not a directory: " + directoryPath);
        }

        File[] filesArray = directory.listFiles();

        if (filesArray == null) {
            throw new IllegalArgumentException("Cannot access directory contents: " + directoryPath);
        }

        for (File file : filesArray) {
            System.out.println((file.isDirectory() ? "[DIR] " : "[FILE] ") + file.getName());
        }
        return filesArray;
    }
}
