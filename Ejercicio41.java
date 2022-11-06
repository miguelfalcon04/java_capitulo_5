import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long n = sc.nextLong();
        long save=n;

        long aux=0;
        int par=0;
        int impar=0;
        
        while(n>0){
            aux=n%10;
            if(aux%2==0){
                par=par+1;
            }
            else{
                impar=impar+1;
            }
        n/=10;
        }

        System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares",save,par,impar);

        sc.close();
    }
}
