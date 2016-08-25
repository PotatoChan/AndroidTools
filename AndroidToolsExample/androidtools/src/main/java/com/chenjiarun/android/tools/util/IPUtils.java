package com.chenjiarun.android.tools.util;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

import com.chenjiarun.android.tools.app.App;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * 功能：读取手机的IP地址，如果有连接wifi，则读取网络地址，如无，则读取基站地址
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：15/10/30
 * -------------------------------------------------------------------------------------------------
 * 更新历史(日期/更新人/更新内容)
 */
public class IPUtils {

    /**
     * 获取IP
     *
     * @return
     */
    public static String getIP() {

        //获取wifi服务
        WifiManager wifiManager = (WifiManager) App.getContext().getSystemService(Context.WIFI_SERVICE);
        //判断wifi是否开启
        if (!wifiManager.isWifiEnabled()) {
            return getIPByWifi();
        } else {
            return getLocalIpAddress();
        }
    }

    /**
     * 根据wifi获取ip地址
     *
     * @return
     */
    public static String getIPByWifi() {
        //获取wifi服务
        WifiManager wifiManager = (WifiManager) App.getContext().getSystemService(Context.WIFI_SERVICE);
        //判断wifi是否开启
        if (!wifiManager.isWifiEnabled()) {
            wifiManager.setWifiEnabled(true);
        }

        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        int ipAddress = wifiInfo.getIpAddress();
        return intToIp(ipAddress);

    }

    /**
     * 将ip地址转化成 XXX.XXX.XXX.XXX格式
     *
     * @param i
     * @return
     */
    private static String intToIp(int i) {
        return (i & 0xFF) + "." +
                ((i >> 8) & 0xFF) + "." +
                ((i >> 16) & 0xFF) + "." +
                (i >> 24 & 0xFF);
    }

    /**
     * 获取本机的IP地址
     *
     * @return
     */
    public static String getLocalIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements(); ) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress()) {
                        return inetAddress.getHostAddress().toString();
                    }
                }
            }
        } catch (SocketException ex) {
            LogUtils.e("WifiPreference IpAddress " + ex.toString());
        }
        return null;
    }


}
