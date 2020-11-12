package com.yulghun;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Set;

public class MyJson {

    public Object findValue(String key, String jsonString) throws IOException {
//        String key = "MemberAddress1";
//        String key = "StatusMessage";

        Object value = null;

        JSONObject jsonObj = new JSONObject((jsonString.trim()));
        Object jObj = jsonObj.get("Response");
        Set<String> keySet = ((JSONObject)jObj).keySet();
        for (String keyStr: keySet) {
            Object keyValue = ((JSONObject)jObj).get(keyStr);
            if (keyStr.equals(key) && !(keyValue instanceof JSONObject)) {
                value = keyValue.toString();
            }

            if (keyValue instanceof JSONObject)
                value = findFromResponse((JSONObject)keyValue, key);
        }

        if (value != null) {
            System.out.println(String.format("%s => %s", key, value));

        } else {
            System.out.println("Value not found for key: " + key);
        }
        return value;
    }

    private static Object findFromResponse(JSONObject jsonObj, String key) {

        Set<String> keySet = jsonObj.keySet();
        for ( String keyStr : keySet) {
            Object keyValue = jsonObj.get(keyStr);
            if (keyStr.equals(key) && !(keyValue instanceof JSONObject)) {
                return keyValue.toString();
            }

            if (keySet.contains(key)) continue;

            if (keyValue instanceof JSONObject)
                return findFromResponse((JSONObject)keyValue, key);
        }
        return null;
    }
}
