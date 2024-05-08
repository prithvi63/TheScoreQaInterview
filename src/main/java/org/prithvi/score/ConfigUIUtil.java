package org.prithvi.score;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUIUtil {

    private static Properties properties;

    private ConfigUIUtil(String path) {
        try (InputStream inputStream = new FileInputStream(path)) {
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigUIUtil init(String path) {
        return new ConfigUIUtil(path);
    }

    public static String getValue(String propertyName) {
        return String.valueOf(properties.get(propertyName));
    }
}
