package commons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileUtils {

    public static List<String> readFromFile(String fileName) {
        File file = new File(fileName);
        List<String> readLines = new ArrayList<String>();
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String tempStr = scan.nextLine();
                readLines.add(tempStr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readLines;
    }
}
