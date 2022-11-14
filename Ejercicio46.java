/* Ejercicio 46
Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.
 */

import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        int anchura= sc.nextInt();

        System.out.print("Ahora introduzca la altura (como mínimo 2): ");
        int altura= sc.nextInt();

        for(int i=1;i<=anchura;i++){
            System.out.print("*");
        }
        System.out.println("");
        
        for(int i=1;i<=altura-2;i++){
            System.out.print("*");
            for(int j=1;j<anchura-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
            
        }
        for(int i=1;i<=anchura;i++){
            System.out.print("*");
        }
        sc.close();
        
    }
}
