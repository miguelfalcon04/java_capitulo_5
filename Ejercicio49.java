import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
        
        boolean primo=true;
        int i = 0;
        int max = 0;
        int min = 0;
        int aux=0;

        do{
            primo=true;
            int n = sc.nextInt();
            i=i+1;
            for(int j = 2; j < n ; j++){ //comprobamos si el número es primo
                if ((n % j) == 0) { 
                    primo = false;
                }
            }
            if(n>max){
                n=max;
            }
            if(n<min){
                n=min;
            }

            aux=aux+n;

        }while(primo);
        System.out.println("Ha introducido "+i+" números no primos");
        System.out.println("Máximo: "+min);
        System.out.println("Mínimo: "+max);
        System.out.print("Media: "+(aux/i));
        sc.close();
    }
}
