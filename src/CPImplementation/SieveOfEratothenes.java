package CPImplementation;


import java.util.Scanner;

/**
 * Classic Logic for Finding Prime Numbers
 */
public class SieveOfEratothenes {
    


    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sieveOfErato(n);

    }
    public static void  sieveOfErato(int n){

        boolean[] isPrime = new boolean[n];
        for(int i=0; i<n; i++){
            isPrime[i] = true;
        }

        for (int p=0; p*p <=n; p++){
            if(isPrime[p]){
                for(int j=p*p; j<=n; j++){
                    isPrime[j] = false;
                }

            }

        }

        for(int kk = 2; kk< n; kk++){
            if(isPrime[kk]){
                System.out.println(kk);
            }
        }


    }
}
