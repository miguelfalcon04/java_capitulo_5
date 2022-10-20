import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1234;
        int intentos = 4;
        System.out.print("Introduzca la contraseña: ");
        do{ 
            c= sc.nextInt();
            if (c!=1234 && intentos>0){
                System.out.print("Lo siento, esa no es la combinación. Vuelva a intentarlo: ");
                intentos=intentos-1;
            }
            if (c==1234){
                System.out.print("La caja fuerte se ha abierto satisfactoriamente");
                intentos=0;
            }
        } while(intentos>0 || c==1234);
        sc.close();
    }
}
