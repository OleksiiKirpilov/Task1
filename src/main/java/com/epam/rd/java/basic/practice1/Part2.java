package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<2; ++i){
            sum += Integer.parseInt(args[i]);
        }
        System.out.print(sum);		
    }
	
}
