package com.duye.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JSONWriter {
    public static void writeJSON(Object data, HttpServletResponse response){
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            writer.println(JSON.toJSONStringWithDateFormat(
                    data,"yyyy-MM-dd HH:mm:ss",
                    SerializerFeature.WriteDateUseDateFormat
            ));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
