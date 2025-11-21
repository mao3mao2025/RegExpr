package com.mao3mao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp05 {

    public static void main(String[] args) {
        //匹配中文汉字
//        //U+3400~U+4DBF + U+4E00~U+9FA5
//        String content = "我是中国人";
////        String regexp = "^[\u4E00-\u9FA5]+$";
//        String regexp = "(?:^[\u3400-\u4DBF]+$)|(?:^[\u4E00-\u9FA5]+$)";    //不捕获分组

        //邮政编码：[1-9]开头的6位数
//        String content = "123456";
//        String regexp = "^[1-9]\\d{5}$";    //加了^$定位符，那么就需要所有的内容都匹配

        //QQ号：1-9开头的5-10位数字
//        String content = "2441704001";
//        String regexp = "[1-9]\\d{4,9}";

        //手机号：13，14，15，18开头的11为数字
        String content = "13074999536";
//        String regexp = "^1(?:3|4|5|8)\\d{9}$";
        String regexp = "^1[345789]\\d{9}$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("匹配成功");
//            System.out.println("分组一：" + matcher.group(1));
//            System.out.println("分组二：" + matcher.group(2));
        }else {
            System.out.println("匹配失败");
        }
    }
}
