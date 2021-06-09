package com.duye.utils;

public class URLUtil {
    public static String parseUrl(String url,String prefix) {
        return url.replace(prefix,"");
    }
}
