package com.chenjiarun.android.tools.util;

import android.text.TextUtils;

/**
 * 功能：字符串工具类
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/3/10
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class StringUtils {

    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {

        if (str != null) {
            str = str.trim();
        }
        return TextUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     *
     * @param str
     * @return
     */
    public static boolean isNoEmpty(String str) {
        return !isEmpty(str);
    }


}
