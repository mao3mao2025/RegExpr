package com.mao3mao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试元字符-定位符的使用
 */
public class RegExp02 {

    public static void main(String[] args) {
        String content = """
                aSh-123 123
                """;
//        String regexp = "^((?i)[a-z])+";    //匹配1个或多个大小字母开头的字符
        String regexp = "^(?i)[a-z]+\\-\\d+\\s+\\d+$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到： " + matcher.group(0));
        }
    }
}
