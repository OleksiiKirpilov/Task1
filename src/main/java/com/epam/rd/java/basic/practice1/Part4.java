package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        System.out.print(gcd(number1, number2));
    }

    static int gcd(int a, int b) {
        int t;
        while(b != 0){
            t = a;
            a = b;
            b = t % b;
        }
        return a;
    }
}
