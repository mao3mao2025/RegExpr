package com.mao3mao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexExp08 {

    public static void main(String[] args) {
        String content = "我..我......要学学学学学学编程Java";
        String regexp = "(.)\\1+";

        Pattern pattern = Pattern.compile("[.]+");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            content = matcher.replaceAll("");
        }

        pattern = Pattern.compile(regexp);
        matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println(matcher.replaceAll("$1"));
//            String s1 = matcher.group(1);
//            content = matcher.replaceAll(s1);
//            String s2 = matcher.group(2);
//            content = matcher.replaceAll(s2);
//            System.out.println(content);
        }
//        System.out.println(content);
    }
}
