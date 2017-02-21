package com.trs.controller;

/**
 * Title:
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: GetExcel
 * Create User: TRS-李超-pc
 * Create Time:2017/2/21 18:08
 */
public class mergeRightValue {


    public String mergeRightValue(String... values) {
        String point = values[0];
        for (int i = 1; i < values.length; i++) {
            point = String.valueOf(this.compare(point, values[i]));
        }

       return point;
    }

    public StringBuilder compare(String a, String b) {
//    String b = values[1];
//    String a = values[0];
        int d = 0;
        if (a.length() >= b.length()) {
            d = a.length() - b.length();
            for (int i = 0; i < d; i++) {
                b = b + "0";
            }
        } else {
            d = b.length() - a.length();
            for (int i = 0; i < d; i++) {

                a = a + "0";
            }
        }
        char[] strChar = a.toCharArray();
        char[] Char = b.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strChar.length; i++) {
            String e = String.valueOf((Integer.parseInt(String.valueOf(strChar[i])) | Integer.parseInt(String.valueOf(Char[i]))));
            result.append(e);
        }
        return result;
    }

    public static void main(String[] args) {
        mergeRightValue m = new mergeRightValue();
        System.out.println( m.mergeRightValue("100001", "0100000","00100","00010","00001"));
    }
}

