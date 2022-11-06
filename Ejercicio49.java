import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
        
        boolean primo=false;
        int cont = 0;
        int max = 0;
        int min = 999999999;
        int aux=0;

        do{
            int n = sc.nextInt();
            primo=true;
            for(int i = 2; i < n ; i++){ //comprobamos si el número es primo
                if ((n % i) == 0) { 
                    primo = false;
                }
            }
            if(!primo){
                cont++;

            if(n>max){
                max=n;
            }

            if(n<min){
                min=n;
            }

            aux=aux+n;
            }

        }while(!primo);
        System.out.println("Ha introducido "+cont+" números no primos");
        System.out.println("Máximo: "+max);
        System.out.println("Mínimo: "+min);
        System.out.printf("Media: %.2f ",((float)aux/(float)cont));
        sc.close();
    }
}
