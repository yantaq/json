package com.yulghun;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyJson {

    private Map<Object, Object> keyValues = new HashMap<>();
    private Object currentKey;
    private Object currentValue;

    public Object findValue(String key, String jsonString) {
        JSONObject jsonObject = new JSONObject((jsonString.trim()));

        for (Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext(); ) {
            String keyStr = (String) iterator.next();
            Object keyValue = jsonObject.get(keyStr);
            handleValue(keyValue);
        }

        if (keyValues.containsKey(key)) {
            return keyValues.get(key);
        }

        return null;
    }

    private void handleValue(Object value) {
        if (value instanceof JSONObject) {
            handleJSONObject((JSONObject) value);
        } else if (value instanceof JSONArray) {
            handleJSONArray((JSONArray) value);
        } else {
            currentValue = value;
            keyValues.put(currentKey, currentValue);
        }
    }

    private void handleJSONObject(JSONObject jsonObject) {
        jsonObject.keys().forEachRemaining(key -> {
            Object value = jsonObject.get(key);
            currentKey = key;

            handleValue(value);
        });
    }

    private void handleJSONArray(JSONArray jsonArray) {
        jsonArray.iterator().forEachRemaining(element -> handleValue(element));
    }


    /**
     * This method is just for debugging and printing the JSON to Map values
     * @param jsonString
     */
    public void printJsonKeys(String jsonString) {
        JSONObject jsonObject = new JSONObject((jsonString.trim()));

        for (Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext(); ) {
            String keyStr = (String) iterator.next();
            Object keyValue = jsonObject.get(keyStr);
            handleValue(keyValue);
        }

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Object, Object> entry : keyValues.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}
