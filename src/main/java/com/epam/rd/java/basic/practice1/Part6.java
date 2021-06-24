package com.epam.rd.java.basic.practice1;

public class Part6 {


     public static void main(String []args){
         
         int limit = Integer.parseInt(args[0]);
         int[] primes = new int[limit];
         String[] primesStrings = new String[limit];
         int number = 2;

         for(int index = 0; index < limit; ++index, ++number){
             while(!isPrime(number)){
                 ++number;
             }
             primes[index] = number;
             primesStrings[index] = String.valueOf(number);
         }
         System.out.print(String.join(" ", primesStrings));
     }


     static boolean isPrime(int n){

         if (n < 4) return true;
         for (int i = 2; i * i <= n; ++i){
             if (n % i == 0) return false;
         }
         return true;
     }
	
}
