package me.zhongcheng.java.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharSequence {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("a");
        StringBuilder s = new StringBuilder("a");
        Matcher m = p.matcher(s);
        boolean b = m.matches();

        System.out.println(b);

    }

}
