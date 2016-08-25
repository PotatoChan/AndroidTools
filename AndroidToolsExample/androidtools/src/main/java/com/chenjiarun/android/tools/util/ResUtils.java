package com.chenjiarun.android.tools.util;

import android.util.TypedValue;

import com.chenjiarun.android.tools.app.App;

/**
 * 功能：获取资源的快捷方式，根据资源id直接获取
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/8/25
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class ResUtils {

    /**
     * 获取字符串
     *
     * @param resId
     * @return
     */
    public static String getString(int resId) {
        return App.getContext().getResources().getString(resId);
    }

    /**
     * 获取字符串 带属性
     *
     * @param id
     * @param args
     * @return
     */
    public static String getString(int id, Object... args) {
        return String.format(App.getContext().getResources().getString(id), args);
    }

    /**
     * 获取颜色
     *
     * @param resId
     * @return
     */
    public static int getColor(int resId) {
        return App.getContext().getResources().getColor(resId);
    }

    /**
     * 获取尺寸
     *
     * @param resId
     * @return
     */
    public static float getDimen(int resId) {
        return App.getContext().getResources().getDimension(resId);
    }

    /**
     * 获取属性
     *
     * @param resId
     * @return
     */
    public static int getAttr(int resId) {
        TypedValue typedValue = new TypedValue();
        App.getContext().getTheme().resolveAttribute(resId, typedValue, true);
        return typedValue.density;
    }


}
