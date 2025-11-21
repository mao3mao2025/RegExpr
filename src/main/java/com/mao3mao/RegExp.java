package com.mao3mao;

/**
 * String中正则表达式的使用
 */
public class RegExp {

    public static void main(String[] args) {
        String content = "2000年5月，JDK1.3，JDK1.4相继发布";
        System.out.println(content.replaceAll("JDK1\\.[34]", "JDK"));

        String phone = "15659477169";
        if (phone.matches("1[35789]\\d{9}")) {
            System.out.println("是一个合法的手机号码");
        }else {
            System.out.println("不是一个合法的手机号码");
        }

        String split = "ada3andan4ndad$anda";
        String regexp = "\\$|\\d+";     //注意$属于元字符需要转义
        for (String s : split.split(regexp)) {
            System.out.println(s);
        }

        String email = "mao3mao2025@outlook.com";
        String emailExp = "^[\\w-]+@([\\w-]+\\.)+[\\w]+$";
        if (email.matches(emailExp)) {
            System.out.println("是一个合法的邮箱地址");
        }else {
            System.out.println("不是一个合法的邮箱地址");
        }

    }
}
