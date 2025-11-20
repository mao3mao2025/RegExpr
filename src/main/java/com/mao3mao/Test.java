package com.mao3mao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        String content = "任职于Sun微系统的詹姆斯·高斯林等人于(1990)年代初开发Java语言的雏形，最初被命名为(Oak)" +
                "，目标设置在家用电器等小型系统的编程语言，应用在电视机、电话、闹钟、烤面包机等家用电器的控制和通信。由于这些智能化家电的市场需求没有预期的高，Sun微系统放弃了该项计划。随着1990" +
                "年代互联网的发展，Sun微系统看见Oak在互联网上应用的前景，于是改造了Oak，于(1995)年5月以Java的名称正式发布。Java伴随着互联网的迅猛发展而发展，逐渐成为重要的网络编程语言。";
        //匹配单词:[a-zA-Z]+  匹配数字：[0-9]+
//        Pattern pattern = Pattern.compile("([a-zA-Z]{4})|([0-9]{4})");
        //多个分组 或运算   只要取到一个就会匹配成功，所有group(0)必定与后续某个分组相同，其他分组必定为null
        //Java语言中转义字符是： \\,  其他语言中转义字符是：    \
        Pattern pattern = Pattern.compile("(\\([a-zA-Z]+\\))|(\\([0-9]+\\))");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到： " + matcher.group(0));
            System.out.println("分组一： " + matcher.group(1));
            System.out.println("分组二： " + matcher.group(2));
        }

    }
}
