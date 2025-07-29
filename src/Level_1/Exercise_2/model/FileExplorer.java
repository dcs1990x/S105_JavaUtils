package Level_1.Exercise_2.model;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExplorer {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");

    public File[] listDirectoryContents(File directoryPath) throws IllegalArgumentException {

        File directory = new File(String.valueOf(directoryPath));

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
            System.out.println((file.isDirectory() ? "[DIR] " : "[FILE] ") + file.getName() + "  Last Modified: " + DATE_FORMAT.format(new Date(file.lastModified())));

            if (file.isDirectory()){
                listDirectoryContents(file);
            }
        }
        return filesArray;
    }
}
