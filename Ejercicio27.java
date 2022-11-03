import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n =s.nextInt();
        int aux=0;
        int i=0;

        System.out.printf("Los multiplos de 3 que hay entre 1 y %d son ",n);
        for(i=0; i<=n;i+=3){
            aux=aux+i;
            System.out.print(i+" ");
        }

        System.out.println("");
        System.out.println("Suman en total "+aux);
    s.close();
    }
}
