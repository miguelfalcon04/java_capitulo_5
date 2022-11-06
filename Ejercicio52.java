import java.util.Scanner;
public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();
        int save=n;

        int nvolteado=0;
        int longitud=0;
        int digito=0;

        while(n>0){
            nvolteado=nvolteado*10+(n%10);
            longitud++;
            n/=10;
        }
        
        if(longitud>3){
            digito=nvolteado%10;
            double op= Math.pow(10, longitud-1);
            save=save-((int)op*digito);
            System.out.println("El número resuelto es "+save+""+digito);
        }

        if(longitud==2){
            System.out.println("El número resuelto es "+nvolteado);
        }

        if(longitud==1){
            System.out.println("El número resuelto es "+save);
        }

    sc.close();
    }
}
