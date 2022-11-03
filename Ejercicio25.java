import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el numero para darle la vuelta: ");
        long n = s.nextLong();
        long volteado=0;
        long aux=n;
        while(n>0){
            volteado=volteado*10+n%10;
            n=n/10;
        }
    System.out.printf("El nuemro introducido %d volteado es %d",aux,volteado);
    s.close();
    }
}
