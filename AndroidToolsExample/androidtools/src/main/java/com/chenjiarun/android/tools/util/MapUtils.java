package com.chenjiarun.android.tools.util;

import android.text.TextUtils;

import java.util.Map;

/**
 * 功能：Map工具类
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/3/16
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class MapUtils {

    /**
     * 向Map添加参数,key和value不能为空,如果为空则自动略过
     *
     * @param map
     * @param key
     * @param value
     */
    public static void add(Map map, String key, Object value) {

        String strValue = CastUtils.castString(value);

        if (TextUtils.isEmpty(strValue)) {
            return;
        }

        if (TextUtils.isEmpty(key)) {
            return;
        }

        map.put(key, strValue);
    }


}
