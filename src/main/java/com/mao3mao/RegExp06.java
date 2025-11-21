package com.mao3mao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 匹配url
 */
public class RegExp06 {

    public static void main(String[] args) {
        String content = "http://docs.spring.io/spring-ai/reference/api/tools.html";
        //在字符集元字符中如果需要匹配 -   这个字符必须写在字符集的最后面
        String regexp = "^https?://([\\w]+\\.)+[\\w]+(\\/[\\w?=%#&.-]+)+$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(content);

        if (matcher.find()) {
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}
