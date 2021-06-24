package com.epam.rd.java.basic.practice1;

public class Part7 {

    static final int RADIX = 26;

    public static void main(String[] args) {
    	System.out.print(rightColumn("AA"));
    }

    public static int str2int(String number) {
        return Integer.parseInt(number, RADIX);
    }

    public static String int2str(int number) {
        return Integer.toString(number, RADIX);
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }
}
