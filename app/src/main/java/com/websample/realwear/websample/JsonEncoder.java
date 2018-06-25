package com.websample.realwear.websample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Type;

/**
 * Created by Luke on 17/05/2017.
 */
public class JsonEncoder {

    private static final Gson mGson = new GsonBuilder().serializeNulls().excludeFieldsWithoutExposeAnnotation().create();

    public static String toJson(Object packet, Type packetType) {

        return mGson.toJson(packet, packetType);
    }

    public static <T> Object fromJson(String json, Type packetType) {
        Object ret = null;
        try {
            ret = mGson.fromJson(json, packetType);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return ret;
    }

}