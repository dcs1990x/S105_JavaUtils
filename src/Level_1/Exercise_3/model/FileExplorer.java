package Level_1.Exercise_3.model;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileExplorer {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");

    public List<String> listDirectoryContents(File directoryPath) throws IllegalArgumentException {

        List<String> directories = new ArrayList<>();
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
            String line = (file.isDirectory() ? "[DIR] " : "[FILE] ") + file.getName() + "  Last Modified: " + DATE_FORMAT.format(new Date(file.lastModified()));
            directories.add(line);
            System.out.println(line);

            if (file.isDirectory()){
                directories.addAll(listDirectoryContents(file));

            }
        }
        return directories;
    }
}