package com.epam.rd.java.basic.practice1;

public class Part7 {

    static final int RADIX = 26;

    public static void main(String[] args) {
        String[] testStrings = "A B Z AA AZ BA ZZ AAA".split(" ");
        for(String s : testStrings){
            int n = str2int(s);
            System.out.printf("%s ==> %d ==> %s%n", s, n, int2str(n));
        }
    }

    public static int str2int(String number) {
        int n = 0;
        for(char c : number.toCharArray()){
            n += (c - 'A' + 1);
            n *= RADIX;
        }
        return n/RADIX;
    }

    public static String int2str(int number) {
        String result = "";
        while(number > 0){
            char c = (char) ('A' + ((number - 1) % RADIX));
            number = (number - 1) / RADIX;
            result = String.valueOf(c).concat(result);
        }
        return result;
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }
}
