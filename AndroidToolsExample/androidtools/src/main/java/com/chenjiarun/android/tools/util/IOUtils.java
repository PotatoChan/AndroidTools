package com.chenjiarun.android.tools.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * 功能：流操作工具类
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：15/11/10
 * -------------------------------------------------------------------------------------------------
 * 更新历史(日期/更新人/更新内容)
 */
public class IOUtils {

    /**
     * 关闭流
     */
    public static boolean close(Closeable io) {
        if (io != null) {

            try {
                io.close();

            } catch (IOException e) {

                LogUtils.e(e);

            }
        }
        return true;
    }

}
