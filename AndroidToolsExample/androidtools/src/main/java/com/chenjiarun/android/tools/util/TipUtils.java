package com.chenjiarun.android.tools.util;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

import com.chenjiarun.android.tools.app.App;

/**
 * 功能：提示工具类,提供了两种提示的方式，第一种是toast，封装了常用的Toast方法，第二种是Android 5.0新增的snackbar提示
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：15/10/15
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class TipUtils {


    /**
     * 进行Toast提示
     *
     * @param msg
     */
    public static void toast(String msg) {
        Toast.makeText(App.getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 进行Snackbar提示,并提供点击按钮，前提是实现SnackListener
     *
     * @param view
     * @param msg
     */
    public static void snackBar(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
    }

    public static void snackBar(View view, String msg, SnackListener listener) {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).setAction(msg, new OnSnackBarActionClickListener(listener)
        ).show();
    }

    /**
     * Snackbar的监听类
     */
    public static class OnSnackBarActionClickListener implements View.OnClickListener {

        private SnackListener listener;

        public OnSnackBarActionClickListener(SnackListener listener) {
            this.listener = listener;
        }

        @Override
        public void onClick(View v) {
            listener.snackBarAction();
        }

    }

    /**
     * Snackbar处理action的接口
     */
    public interface SnackListener {
        public void snackBarAction();
    }


}
