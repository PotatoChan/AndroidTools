package com.chenjiarun.android.tools.util;

/**
 * 功能：Luhn算法，信用卡等证件号码的合法性
 * -------------------------------------------------------------------------------------------------
 * 创建者：陈佳润
 * -------------------------------------------------------------------------------------------------
 * 创建日期：16/3/29
 * -------------------------------------------------------------------------------------------------
 * 更新历史
 * 编号   更新日期            更新人         更新内容
 */
public class LuhnUtils {

    /**
     * @param cardNumber 银行卡号
     * @return true-银行卡有效；false-银行卡无效
     */
    public static boolean isBankCardValid(String cardNumber) {

        if (cardNumber == null) {
            return false;
        }

        //区分奇偶位
        boolean isOdd = true;
        int oddSum = 0; //奇位总和
        int evenSum = 0;//偶位总和

        for (int i = cardNumber.length() - 1; i >= 0; i--) {

            int digit = CastUtils.castInt(cardNumber.charAt(i));
            
            if (isOdd) {

                oddSum += digit;
                isOdd = false;

            } else {

                int temp = digit * 2;

                evenSum += (temp > 9 ? temp - 9 : temp);

                isOdd = true;
            }
        }

        int result = (oddSum + evenSum) % 10;

        if (0 == result) {
            return true;
        }

        return false;
    }


}
