import java.util.Scanner;

public class Ejercicio24 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("Dime la altura: ");
            int n = sc.nextInt();
            
    
            for (int i = 1 ; i<=n ; i++){
                for(int espacios=n-i ; espacios>=0 ; espacios--)
                System.out.print(" ");
                for (int asteriscos=1; asteriscos< i; asteriscos++){
                    System.out.print(asteriscos);
                }
                for (int asteriscos=i; asteriscos> 0; asteriscos--){
                    System.out.print(asteriscos);
                }
                System.out.println("");
            }
        sc.close();
        }
    }