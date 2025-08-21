package utillities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

    private static Properties properties;

    public ConfigDataProvider() {
        String projectLocation = System.getProperty("user.dir");
        String confFile = projectLocation + "/config/config.properties";
        try {
            File conf = new File(confFile);
            FileInputStream fileInputStream = new FileInputStream(conf);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public String getBrowser() {
        return properties.getProperty("Browser");
    }

    public String getURL() {
        String URL = properties.getProperty("URL");
        return URL;
    }
    public static String getAPI_key(){

        return properties.getProperty("API_key");
    }
}
