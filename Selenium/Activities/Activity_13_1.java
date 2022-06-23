//Activity_13_1
//Creating a Java class with the main method.
//Creating an object for the OpenCSV Class with the file path of the CSV as its parameter.
//Using the readAll() method to read the contents of the CSV file.
//Using the size() method to count the number of rows in the CSV file.
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Activity_13_1{
    public static void main(String[] args) throws IOException, CsvException {
        //Loading CSV file
        CSVReader reader = new CSVReader(new FileReader("src/test/java/tests/sample.csv"));
        //Loading content into list
        List<String[]> list = reader.readAll();
        System.out.println("Total number of rows are: " + list.size());
        //Creating Iterator reference
        Iterator<String[]> itr = list.iterator();
        //Iterating all values
        while(itr.hasNext()) {
            String[] str = itr.next();
            System.out.print("Values are: ");
            for(int i=0;i<str.length;i++) {
                System.out.print(" " + str[i]);
            }
            System.out.println(" ");
        }
        reader.close();
    }
}