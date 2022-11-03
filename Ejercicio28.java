import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un numero entero: ");
        int n = s.nextInt();
        int fact=n;
        for (int i=1; i<n;i++){
            if(n<0){
                System.out.print("No existe el factorial negativo");
            }
            if(n==0){
                System.out.print("0!=1");
            }
            if(n>0){
                fact=fact*i;
                }
            }
        System.out.println(n+"!="+fact);
        s.close();
    }
}
