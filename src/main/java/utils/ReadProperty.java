package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

    public static String getPropertyFromFile(String fileName, String property) {
        FileReader reader= null;
        try {
            reader = new FileReader(fileName+".properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Properties p=new Properties();

        try {
            p.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return p.getProperty(property);
    }
}
