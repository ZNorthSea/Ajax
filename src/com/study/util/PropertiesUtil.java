package com.study.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
public class PropertiesUtil {
    private Properties properties;

    public PropertiesUtil(String path){
        properties=new Properties();
        InputStream inputStream = this.getClass().getResourceAsStream(path);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperties(String key){
        return properties.getProperty(key);
    }

}
