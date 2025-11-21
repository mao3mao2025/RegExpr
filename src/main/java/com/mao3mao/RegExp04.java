package com.mao3mao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示非贪婪匹配
 */
public class RegExp04 {

    public static void main(String[] args) {
        String content = "hello123456";
        String regexp = "\\d{2,3}?";    //限定符后面加上一个?表示，非贪婪匹配，默认贪婪匹配
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到匹配字符：" + matcher.group(0));
        }
    }
}
