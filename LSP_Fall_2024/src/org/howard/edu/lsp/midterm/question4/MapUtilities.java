package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * Utility class for working with HashMaps.
 * Provides methods to find common key/value pairs between two maps.
 * 
 * @author Matthew Getachew
 * @version 1.0
 */
public class MapUtilities {

    /**
     * Counts the number of common key/value pairs between two HashMaps.
     * 
     * @param map1 The first HashMap.
     * @param map2 The second HashMap.
     * @return The number of key/value pairs that are common to both maps.
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                count++;
            }
        }
        return count;
    }
}
