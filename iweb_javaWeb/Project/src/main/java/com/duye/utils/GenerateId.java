package com.duye.utils;

import java.util.Locale;
import java.util.UUID;

/**
 * 生成主键 uuid
 */
public class GenerateId {
    public static String id(){
        return UUID.randomUUID().toString().toUpperCase().replace("-","");
    }
}
