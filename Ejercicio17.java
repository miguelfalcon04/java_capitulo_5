import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número positivo: ");
        int n = s.nextInt();
        int i = 1;
        int suma =0 ;
        if (n<0){
            System.out.print("El numero debe ser positivo");
        }
        if (n>0){
            for(i=1; i<101; i++){
                suma = suma+i;
            }
            System.out.println(suma);
        }
    s.close();
    }
}
