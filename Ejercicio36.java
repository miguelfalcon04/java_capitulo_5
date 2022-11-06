import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su numero para comprobar que es capicua: ");
        int n = sc.nextInt();
        int nvolteado=0;
        int save=n;

        while(n>0){
            nvolteado=nvolteado*10+(n%10);
            n=n/10;
        }

            if(save == nvolteado){
                System.out.print("Es capicúa");
            }
            else{
                System.out.print("No es capicua.");
            }

    sc.close();
    }
}
