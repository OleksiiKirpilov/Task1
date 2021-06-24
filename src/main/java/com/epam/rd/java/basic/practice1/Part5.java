package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        int sum = 0;
        for(char c : args[0].toCharArray()){
            sum += Integer.parseInt(String.valueOf(c));
        }
        System.out.print(sum);
        
    }
	
}
