import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int b = s.nextInt();
        System.out.print("Introduzca exponente: ");
        int e = s.nextInt();
        for (int i = 1; i<e+1; i++ ){
            System.out.println(b+"^"+i);
        }
        s.close();
    }
}
