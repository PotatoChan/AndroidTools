package com.chenjiarun.android.tools.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 功能：时间相关的工具类
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/8/25
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class TimeUtils {

    /**
     * 获取当前时间 格式为 05-27 15:20
     *
     * @return String 时间
     */
    public static String getTime() {
        return new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA).format(new Date());
    }

}
