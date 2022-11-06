import java.util.Scanner;
public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        int digito=0;
        int suma=0;
        int cont=0;
        int op=0;

        while(n>0){
            op=n%10;
            digito=op;
            suma=suma+digito;
            n/=10;
            cont++;
        }

        System.out.printf("La media de sus dígitos es %.2f",((float)suma/(float)cont));
    sc.close();
    }
}
