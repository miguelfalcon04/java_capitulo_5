import java.util.Scanner;
public class Ejercicio43{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int partir = sc.nextInt();

        int volteado=0;

        while(n>0){
			volteado=volteado*10+(n%10);
			n=n/10;
		}
        System.out.print("Los números partidos son el ");

        int longitud=1;

        while(volteado>0){

            if(longitud==partir){
                System.out.print(" y el ");
            }
            System.out.print((volteado%10));
            volteado=volteado/10;
            longitud++;
        }

    sc.close();
    }
}