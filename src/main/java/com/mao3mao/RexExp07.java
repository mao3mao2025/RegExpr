package com.mao3mao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 分组反向引用
 */
public class RexExp07 {

    public static void main(String[] args) {
        String content = "1234-111111111";
//        String regexp = "^[\\d]{4}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}$";
        String regexp = "^[\\d]{4}-((?<gg>\\d)\\k<gg>{2}){3}$"; // \\k<组名>: Java中反向引用命名分组
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}
