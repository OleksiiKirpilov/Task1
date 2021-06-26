package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        System.out.print(gcd(number1, number2));
    }

    static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

}
