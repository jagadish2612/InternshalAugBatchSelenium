package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderUtil {

    public static String getPropertyValue(String filepath,String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(filepath);
        prop.load(fis);
        return prop.getProperty(key);
    }
}
