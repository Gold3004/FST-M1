package activities;
import java.io.File;
        import java.io.IOException;
        import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:/Users/02003C744/Desktop/input.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }
            //get the file Object
            File fileUtil = FileUtils.getFile("C:/Users/02003C744/Desktop/input.txt");
            //Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF-8"));

            //Create directory
            File destDir = new File("resources");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "input.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF-8");
            //Print it
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}