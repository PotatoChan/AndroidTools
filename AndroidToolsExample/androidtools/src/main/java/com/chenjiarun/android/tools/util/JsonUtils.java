package com.chenjiarun.android.tools.util;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;


/**
 * 功能：Json操作工具类
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/3/23
 * -------------------------------------------------------------------------------------------------
 * 更新历史:
 * <p/>
 * 16/05/21 陈佳润 增加了通过gson转换对象的方法;
 */
public class JsonUtils {


    public static <T> T resloveObject(JSONObject jsonObject, Class cls) {

        Gson gson = new Gson();

        return (T) gson.fromJson(jsonObject.toString(), cls);
    }


    public static <T> List<T> resloveArray(JSONArray jsonArray, Class cls) {
        Gson gson = new Gson();
        return gson.fromJson(jsonArray.toString(), new TypeToken<List<T>>() {
        }.getType());
    }


    /**
     * 从 JSONObject里获取JSONArray
     *
     * @param json
     * @param key
     * @return
     */
    public static JSONArray getJSONArray(JSONObject json, String key) {

        if (json == null || TextUtils.isEmpty(key)) {
            return new JSONArray();
        }

        if (!json.has(key)) {
            return new JSONArray();
        }

        JSONArray array = null;

        try {
            array = json.getJSONArray(key);
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONArray();
        }

        return array;
    }

    /**
     * 从JSONObject里获取JSONObject
     *
     * @param json
     * @param key
     * @return
     */
    public static JSONObject getJSONObject(JSONObject json, String key) {

        if (json == null || TextUtils.isEmpty(key)) {
            return new JSONObject();
        }

        if (!json.has(key)) {
            return new JSONObject();
        }

        JSONObject obj = null;

        try {
            obj = json.getJSONObject(key);
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }

        return obj;
    }


}
