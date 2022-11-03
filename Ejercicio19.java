import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la piramide deseada: ");
        int a = s.nextInt();
        System.out.print("Introduzca el caracter deseado para crear la pirámide: ");
        String r = s.next();
        for(int i=1; i<=a;i++){
            for(int e=a-i;e>=0;e--){
                System.out.print(" ");
            }
            for(int c=1;c<=(i*2)-1;c++){
                System.out.print(r);
            }
        System.out.println("");
        }
        s.close();
    }
}
