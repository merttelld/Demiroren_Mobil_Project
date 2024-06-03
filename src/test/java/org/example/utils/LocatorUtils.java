package org.example.utils;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class LocatorUtils {
    private static Map<String, Map<String, String>> locators;

    static {
        try {
            FileReader reader = new FileReader("src/test/resources/elementValues.json");
            Gson gson = new Gson();
            locators = gson.fromJson(reader, new TypeToken<Map<String, Map<String, String>>>(){}.getType());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getLocator(String page, String element){
        return locators.get(page).get(element);
    }
}
