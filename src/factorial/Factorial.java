package factorial;

import java.util.Scanner;

public class Factorial {
    public static void fac(int n){
        int producto=1;
        for(int i=1; i<=n; n--){ 
            producto*=n;
        }
        System.out.println("El factorial del numero introducido es: "+producto); 
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int  n;
        
        System.out.println("Digite un entero");
        n=in.nextInt();
        
        fac(n);
    }
    
}