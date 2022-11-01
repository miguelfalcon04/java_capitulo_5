import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero entero positivo: ");
        int n = s.nextInt();
        int op = 1;
        for (int i=1; i<=n; i++){
            System.out.print(i+"!= ");
            for (int j =1; j<i;j++){
                op=op+op*j;
            }
            System.out.print(op);
            System.out.println("");
            op=1;
        }
        s.close();
    }
}
