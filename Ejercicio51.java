import java.util.Scanner;
public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero (mayor que cero): ");
        int n = sc.nextInt();

        int volteado=0;
        boolean comido=false;

        while(n>0){
            comido=false;
            if(n%10==0 || n%10==8){
                comido=true;
                n/=10;
                if(n%10==0 || n%10==8){
                    n/=10;
                }
            }
            volteado=volteado*10+(n%10);
            n/=10;
        }

        int vuelta2=0;

        while(volteado>0){
            vuelta2=vuelta2*10+(volteado%10);
            volteado/=10;
        }

        if(comido){
            System.out.print("Después de haber sido comido por el gusano numérico se queda en: "+vuelta2);
        }
        else{
            System.out.print("El gusano numérico no se ha comido ningún dígito.");
        }


        sc.close();
    }
}
