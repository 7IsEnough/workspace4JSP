package utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;


/**
 * @author promise
 * @date 2020/4/16 - 12:40
 */
public class DownLoadUtils {
    public static String getFilename(String agent, String filename) throws UnsupportedEncodingException {
        if(agent.contains("MSIE")){
            //IE浏览器
            filename = URLEncoder.encode(filename,"utf-8");
            filename = filename.replace("+"," ");
        }else if (agent.contains("Firefox")){
            //火狐浏览器
            Base64.Encoder encoder = Base64.getEncoder();
            filename = "=?utf-8?B?" + encoder.encode(filename.getBytes("utf-8")) +"?=";
        }else {
            //其它浏览器
            filename = URLEncoder.encode(filename,"utf-8");
        }
        return filename;
    }
}
