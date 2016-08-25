package com.chenjiarun.android.tools.app;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;


/**
 * 功能：Android App 的 Application
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/8/25
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class App extends Application {

    public static App app;

    public static App getApp() {
        if (app == null) {
            synchronized (App.class) {
                if (app == null) {
                    app = new App();
                }
            }
        }
        return app;
    }


    //上下文
    public static Context context;

    public static Context getContext() {
        return context;
    }

    // 主线程
    private static Thread mainThread;

    public static Thread getMainThread() {
        return mainThread;
    }

    private static long mainThreadId;

    public static long getMainThreadId() {
        return mainThreadId;
    }

    private static Looper mainThreadLooper;

    public static Looper getMainThreadLooper() {
        return mainThreadLooper;
    }

    // 创建主线程的handler
    private static Handler mainHandler;

    public static Handler getMainHandler() {
        return mainHandler;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //上下文
        context = getApplicationContext();
        // 主线程
        mainThread = Thread.currentThread();
        mainThreadId = android.os.Process.myTid();
        mainThreadLooper = getMainLooper();
        // 创建主线程的handler
        mainHandler = new Handler();

    }

}
