package Level_1.Exercise_2.model;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileExplorer {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public void listDirectoryContents(File directoryPath){
        if (!directoryPath.exists() || !directoryPath.isDirectory()) {
            throw new IllegalArgumentException("Invalid directory: " + directoryPath);
        }

        System.out.println("[DIR]  " + directoryPath.getName() + "   Last Modified: " + DATE_FORMAT.format(new Date(directoryPath.lastModified())));

        listDirectoryContents(directoryPath, "  ");
    }

    public void listDirectoryContents(File directoryPath, String indent) {

        File[] contentsArray = getContents(directoryPath);

        Arrays.sort(contentsArray, (f1, f2) -> {
            if (f1.isFile() && f2.isDirectory()) return -1;
            if (f1.isDirectory() && f2.isFile()) return 1;
            return f1.getName().compareToIgnoreCase(f2.getName());
        });

        for (File contentUnit : contentsArray) {
            String prefix = contentUnit.isDirectory() ? "[DIR]  " : "[FILE] ";
            String lastModified = "Last Modified: " + DATE_FORMAT.format(new Date(contentUnit.lastModified()));
            System.out.println(indent + "|__" + prefix + contentUnit.getName() + "   " + lastModified);

            if (contentUnit.isDirectory()) {
                listDirectoryContents(contentUnit, indent + "     ");
            }
        }
    }

    private static File[] getContents(File directoryPath) {

        if (!directoryPath.exists()) {
            throw new IllegalArgumentException("The directory does not exist: " + directoryPath);
        }

        if (!directoryPath.isDirectory()) {
            throw new IllegalArgumentException("Path is not a directory: " + directoryPath);
        }

        File[] contentsArray = directoryPath.listFiles();

        if (contentsArray == null) {
            throw new IllegalArgumentException("Cannot access directory contents: " + directoryPath);
        }
        return contentsArray;
    }
}