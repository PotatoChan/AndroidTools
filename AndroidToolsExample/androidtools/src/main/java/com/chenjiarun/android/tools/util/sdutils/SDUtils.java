package com.chenjiarun.android.tools.util.sdutils;

import android.os.Environment;

/**
 * 功能：
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/8/26
 * -------------------------------------------------------------------------------------------------
 * 更新历史(日期/更新人/更新内容)
 */
public class SDUtils {


    /**
     * @return
     */
    public static boolean isExist() {
        return Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED);
    }

    /**
     * 获取SD卡路径,如SD卡不存在,则抛出SDCardNotExistException异常
     *
     * @return
     * @throws SDCardNotExistException
     */
    public static String getSDCardPath() throws SDCardNotExistException {

        boolean exist = isExist();

        String sdpath = "";

        if (exist) {

            sdpath = Environment.getExternalStorageDirectory()
                    .getAbsolutePath();
        } else {
            //SD卡不存在

            throw new SDCardNotExistException();
        }

        return sdpath;

    }


}

