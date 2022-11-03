import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = s.nextInt();
        System.out.print("Introduzca un digito: ");
        int dig = s.nextInt();
        int posicion=0;
        int i=0;
        long nvolteado=0;

        while(n>0){
            nvolteado=(nvolteado*10)+(n%10);
            n=n/10;
        }
        
        System.out.print(nvolteado);
        System.out.println("");
        
        System.out.print(dig+" esta en las posiciones ");
        while(nvolteado>=1){
            posicion=posicion+1;
            if(nvolteado%10==dig){
                i=i+1;
                System.out.print(posicion+" ");
            }
        nvolteado=nvolteado/10;
        }
    System.out.println("");
    System.out.print("El digito "+dig+" se repite "+i+" veces");
    s.close();
    }
}
