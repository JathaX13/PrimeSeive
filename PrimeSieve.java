import java.util.Arrays;
import java.util.Scanner;
public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    
       
     public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        primeFactorization (14112, collectPrimes());
        
        
        
         for(int i=2; i<=999;i++){
           for(int k=2*i;k<=999;k+=i){
               sieve[k] = false;
           }
        }
    
        for(int z = 0; z<999; z++){
           if(sieve[z] == true){
              
               //System.out.print(", " + z);
            }
        }
        int[] oof = collectPrimes();
        //System.out.print(Arrays.toString(oof));
     }
  
    public static int[] collectPrimes() {
       int count=0;
       for(int ree = 0;ree<=999;ree++) {
         if(sieve[ree] == true) {
           count++;
         }
       }
        int dab = 0;
        int[] jake = new int[count];
       for(int ree = 0;ree<=999;ree++) {
           if(sieve[ree] == true) {
               jake[dab] = ree;
               dab++;
           }
        }   
           return jake; 
    }
   
    
    public static void primeFactorization(int yes, int[]boo){
        System.out.println ("Prime factorization of " + yes);
        for(int u = 2; u < yes; u++) {
            int judas = 0;
            while (yes % boo [u] == 0) {
                yes = yes/boo[u];
                judas ++;
            }
            
            if (judas > 0) { 
            System.out.println(boo [u] + ":" + judas);
            }
       }
    }
}

       
        
        
        
        
        
        
        
        
        
        
        
        
            
        