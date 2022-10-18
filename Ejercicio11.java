import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long n = sc.nextLong();
        System.out.println("   n   |   n^2   |   n^3   ");
        System.out.println("---------------------------");
        for (long i=n; i<n + 5; i++  ){
        System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
        }
        sc.close();
    }    
}
