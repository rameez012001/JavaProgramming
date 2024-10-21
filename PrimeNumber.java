package practice;

public class PrimeNumber {
    static boolean checkPrime(int number, int divisor){
       if(number<=1){return false;}
       if(divisor==1){return true;}
       if(number%divisor==0){return false;}
       return checkPrime(number, divisor-1);
    }
    public static void main(String[] args) {
        int n = 100;
        for (int i = 2; i < n; i++) {
            if(checkPrime(i, i-1)){
                System.out.println(i);
            }
        }

    }
}
