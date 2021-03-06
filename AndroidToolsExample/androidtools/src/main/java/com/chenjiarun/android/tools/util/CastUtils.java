package com.chenjiarun.android.tools.util;

/**
 * 功能：类型 转化工具
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：15/10/15
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class CastUtils {


    /**
     * cast to string with default value
     *
     * @param obj
     * @param defalutValue
     * @return
     */
    public static String castString(Object obj, String defalutValue) {
        return obj == null ? defalutValue : String.valueOf(obj);
    }

    /**
     * cast to string
     *
     * @param obj
     * @return
     */
    public static String castString(Object obj) {
        return castString(obj, "");
    }

    /**
     * cast to int
     *
     * @param obj
     * @return
     */
    public static int castInt(Object obj) {
        String value = castString(obj, "0");
        return Integer.parseInt(value);
    }

    /**
     * cast to int with default value
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static int castInt(Object obj, int defaultValue) {


        int target = defaultValue;

        if (obj == null) {
            String value = castString(obj);

            if (StringUtils.isNoEmpty(value)) {
                try {
                    target = Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }


        }

        return target;
    }

    /**
     * cast to double with default value
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object obj, double defaultValue) {

        double target = defaultValue;

        if (obj == null) {
            String value = castString(obj);
            if (StringUtils.isNoEmpty(value)) {
                try {
                    target = Double.parseDouble(value);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }

        return target;
    }

    /**
     * cast to double
     *
     * @param obj
     * @return
     */
    public static double castDouble(Object obj) {
        return castDouble(obj, 0.f);
    }

    /**
     * cast to boolean with default value
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {

        boolean target = defaultValue;

        if (obj != null) {
            String value = castString(obj);
            if (StringUtils.isNoEmpty(value)) {
                try {
                    target = Boolean.parseBoolean(castString(value));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return target;
    }

    /**
     * cast to boolean
     *
     * @param value
     * @return
     */
    public static boolean castBoolean(Object value) {
        return castBoolean(value, false);
    }


}
