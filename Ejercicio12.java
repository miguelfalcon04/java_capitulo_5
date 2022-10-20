import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numeros de la sucesión deseados: ");
        int n = sc.nextInt();
        int n2 =0;
        int n3 = 1;
        int r = 0;
        for (int i=0; i<=n-1; i++){
        r=n3;
        System.out.println(n3);
        n2 = n2+n3;
        n3 = n2+n3;
        sc.close();
        }
    }
}
