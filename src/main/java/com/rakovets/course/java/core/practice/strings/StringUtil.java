package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String glue(String str1, String str2) {
        return (str1 == null || str2 == null) ? "" : str1.concat(str2);
    }


}
