package com.yanxi.common.utils;

import java.util.UUID;

public class IdUtils {
    public static String randomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
