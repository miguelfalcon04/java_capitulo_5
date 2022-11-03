import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        long n = sc.nextLong();
        int par=0;
        int sumapar=0;

        int nvolteado=0;
        while(n>0){
            nvolteado=nvolteado*10+((int)n%10);
            n=n/10;
        }

        System.out.print("Dígitos pares: ");
        do{
            par = nvolteado%10;
            if(par%2==0){
                System.out.print(par+" ");
                sumapar=sumapar+par;
            }
            nvolteado=nvolteado/10;
        }while(nvolteado>0);
        System.out.println(" ");
        System.out.print("Suma de los dígitos pares: "+sumapar);

        sc.close();
    }
}
