package com.chenjiarun.android.tools.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 功能：反射工具类
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/3/19
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class ReflectUtil {


    /**
     * 调用静态方法
     *
     * @param cls        类
     * @param methodName 方法名
     * @param args       参数列表
     */
    public static void callStaticMethod(Class<?> cls, String methodName, Object... args) {
        Method method = null;
        try {
            method = cls.getMethod(methodName, long.class);
            method.invoke(null, args);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
