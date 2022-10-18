import java.util.Scanner;
public class Ejercicio9{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        long numLeido = sc.nextLong();
        long num = numLeido;
        int i = 0;
        do{
            i++;
            num/=10;
        } while (num!=0);
        System.out.printf("El número %d tine %d digitos", numLeido, i);
        sc.close();
    }
}