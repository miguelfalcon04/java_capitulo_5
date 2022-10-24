import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la piramide deseada: ");
        int a = s.nextInt();
        System.out.print("Introduzca el caracter deseado para crear la pirámide: ");
        String r = System.console().readLine();
        int base = 1;
        int l = 1;
        int espacio = a-1;
        while (base<=a){
            for (int i =1; i<= espacio; i++){
                System.out.print(" ");
            }
            for (int i = 1; i<= l; i++){
                System.out.print(r);
            }
        System.out.println();
        base++;
        espacio--;
        l+=2;
        }
        s.close();
    }
}
