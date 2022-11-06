import java.util.Scanner;
public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        int save=n;

        int op=0;
        int suerte=1;
        int malasuerte=1;

        while(n>0){
            op=n%10;
            if(op==3 || op==7 || op==8 || op ==9){
                suerte+=suerte;
            }
            if(op==0 || op==1 || op==2 || op ==4 || op==5 || op==6){
                malasuerte+=malasuerte;
            }
            n/=10;
        }
        
        if(suerte>malasuerte){
            System.out.printf("El %d es un número afortunado",save);
        }
        else{
            System.out.printf("El %d no es un número afortunado",save);
        }

        sc.close();
    }
}
