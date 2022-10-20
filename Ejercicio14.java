import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Número de la base: ");
        int b = s.nextInt();
        System.out.print("Número del exponente: ");
        int e = s.nextInt();
        int o=b;
        for (int i =1; i<e; i++){
        o =o*b;
        }
        System.out.print("La potencia es: "+o );
        s.close();
    }
}
