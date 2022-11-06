import java.util.Scanner;
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long n = sc.nextLong();
        System.out.print("Introduzca la posición donde quiere insertar: ");
        int posicion=sc.nextInt();
        System.out.print("Introduzca el dígito que quiere insertar: ");
        int digito=sc.nextInt();

        long nvolteado=0;
        int longitud=0;
        while(n>0){
            nvolteado=nvolteado*10+(n%10);
            n/=10;
        }

        long vuelta2=0;

        while(nvolteado>0){
            vuelta2=nvolteado%10;
            longitud=longitud+1;
            System.out.print(vuelta2);
            if(longitud==posicion-1){
                System.out.print(digito);
            }
            nvolteado/=10;
        }

        sc.close();
    }
}
