package com.yanxi.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String parseTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
