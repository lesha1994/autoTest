import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class testsFast {

    @Test
    public void testReadPropertyFile() {
        String idWithText = "Receipt #64365";

        String id = idWithText.replace("Receipt #", "")
                ;
        System.out.println(id);
    }

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
