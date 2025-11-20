package com.mao3mao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp01 {

    public static void main(String[] args) {
        String content = "asdg123_ #@       ";
//        String regex = "\\d";   //匹配一个数字字符
        String regex = "\\D";       //匹配一个非数字字符
//        String regex = "\\w";     //大小字母，数字，下划线
//        String regex = "\\W";
//        String regex = "\\S";   //匹配任意空格,除了换行符
//        String regex = "\\s";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到一个： " + matcher.group(0));
        }
    }
}
