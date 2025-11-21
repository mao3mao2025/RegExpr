package com.mao3mao;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp03 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String content = "industries is the complex of industry";
//        String regexp = "industr(?:y|ies)"; //不捕获分组
//        String regexp = "industr(y|ies)"; //捕获分组
//        String regexp = "industr(?=y)";     //只匹配industr字符，根据y来匹配industr字符
        String regexp = "industr(?!y)";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到匹配字符：" + matcher.group(0));
            showFullStr(matcher,content);
            System.out.println("找到匹配分组：" + matcher.group(1));
        }
    }

    private static void showFullStr(Matcher matcher,String content) throws NoSuchFieldException, IllegalAccessException {
//        Class<? extends Matcher> clazz = matcher.getClass();
//        Field groups = clazz.getDeclaredField("groups");
//        groups.setAccessible(true);
//        int[] o = (int[]) groups.get(matcher);
        System.out.println(content.substring(matcher.start(), matcher.end()).trim());
    }
}
