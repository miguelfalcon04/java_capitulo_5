import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();

        boolean primo;

        for(int i=1; i<=5; i++){
            primo=true;
            for(int j=2; j<n-1 && primo;j++){
                if(n%j==0){
                    primo=false;
                }
                else{
                    primo=true;
                }
            }
            if(primo){
                System.out.println(n+" es primo");
            }else{
                System.out.println(n+" no es primo");
            }
        n++;
        }

        sc.close();
    }
}
