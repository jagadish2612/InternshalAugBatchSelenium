package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Testing Workshop\\TestRegistration\\src\\main\\resources\\config.properties");
        prop = new Properties();
        prop.load(fis);
    }

    public String getProperty(String key)
    {
        return prop.getProperty(key);
    }
}
