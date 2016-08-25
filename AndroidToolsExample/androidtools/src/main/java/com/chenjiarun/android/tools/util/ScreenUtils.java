package com.chenjiarun.android.tools.util;

import android.content.Context;
import android.view.WindowManager;

import com.chenjiarun.android.tools.app.App;

/**
 * 功能：屏幕工具类
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/3/19
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class ScreenUtils {

    /**
     * 获取屏幕宽度
     *
     * @return
     */
    public static int getWidthByPx() {
        WindowManager wm = (WindowManager) App.getContext()
                .getSystemService(Context.WINDOW_SERVICE);

        int height = wm.getDefaultDisplay().getHeight();
        return wm.getDefaultDisplay().getWidth();
    }

    /**
     * 获取屏幕高度
     *
     * @return
     */
    public static int getHeightPx() {
        WindowManager wm = (WindowManager) App.getContext()
                .getSystemService(Context.WINDOW_SERVICE);
        return wm.getDefaultDisplay().getHeight();
    }

    /**
     * dp转px
     *
     * @param dp
     * @return
     */
    public static int dp2Px(double dp) {
        final float scale = App.getContext().getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    /**
     * px转dp
     *
     * @param px
     * @return
     */
    public static int px2Dp(int px) {
        final float scale = App.getContext().getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }


}
