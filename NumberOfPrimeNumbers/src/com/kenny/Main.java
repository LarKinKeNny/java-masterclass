package com.kenny;

public class Main {
    private static final int NUMBER_OF_PRIMES_TO_DISPLAY = 150;
    private static final int CHECK_PRIME_FROM = 1;
    private static final int CHECK_PRIME_TO = 1000;
    public static void main(String[] args) {
        int count = 0;
        for (int i = CHECK_PRIME_FROM ; i <= CHECK_PRIME_TO ; i++){
            if (count == NUMBER_OF_PRIMES_TO_DISPLAY){
                break;
            }
            if (isPrime(i)){
                count++;
                if (count == NUMBER_OF_PRIMES_TO_DISPLAY){
                    System.out.print(i);
                }else {
                    System.out.print(i + ", ");
                }
            }
        }
    }


    public static boolean isPrime (int n){
        if(n == 1){
            return false;
        }
        for(int i=2;i <= (long) Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}
