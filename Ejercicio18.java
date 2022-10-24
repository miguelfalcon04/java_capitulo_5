import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca su primer numero: ");
        int n = s.nextInt();
        System.out.print("Introduzca su segundo numero: ");
        int n2 = s.nextInt();
        if (n==n2){
            System.out.print("Los numeros deben ser distintos");
        }
        if (n>=n2){
            int aux = n;
            n = n2;
            n2=aux;
        }
        for (int i=n; i<=n2; i+=7){
            System.out.print(i+" ");
        }
        s.close();
        }
        
    }

