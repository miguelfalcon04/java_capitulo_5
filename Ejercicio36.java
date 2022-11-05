import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su numero para comprobar que es capicua: ");
        int n = sc.nextInt();
        int nvolteado=0;
        boolean capicua=true;

        while(n>0){
            nvolteado=nvolteado*10+(n%10);
            n=n/10;
        }
        System.out.print(nvolteado);

        do{
            if(n == nvolteado){
                capicua=true;
                n=n/10;
                nvolteado=nvolteado/10;
            }
            else{
                System.out.print("No es capicua.");
                capicua=false;
            }
        }while(capicua);
        
        if(capicua){
            System.out.printf("El numero %d es capicua.",n);
        }
    sc.close();
    }
}
