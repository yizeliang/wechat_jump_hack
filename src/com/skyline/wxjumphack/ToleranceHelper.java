package com.skyline.wxjumphack;

/**
 * Created by chenliang on 2017/12/31.
 */
public class ToleranceHelper {

    /**
     * 查找像素,以颜色作为判断方式
     * @param r
     * @param g
     * @param b
     * @param rt
     * @param gt
     * @param bt
     * @param t 容错率
     * @return
     */
    public static boolean match(int r, int g, int b, int rt, int gt, int bt, int t) {
        return r > rt - t &&
                r < rt+ t &&
                g > gt - t &&
                g < gt + t &&
                b > bt - t &&
                b < bt + t;
    }
}
