package com.thetestingacademy.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesReader {

    // File - data.properties -> key -> value

    public static String readKey(String key) {

        Properties p = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/data.properties");
            p = new Properties();
            p.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return p.getProperty(key);

    }
}
