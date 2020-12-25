package me.zhongcheng.java.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartWithCapitalLetter {

    public static void main(String[] args) {

        String regex = "[A-Z](.|\\s)*\\.";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(Splitting.knights);
        boolean b = m.matches();

        System.out.println(b);

    }

}
