import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        float suma = 0;
        float valor = 0;
        int i = 0;
        do{
            System.out.print("Introduzca un número: ");
            valor = sc.nextFloat();
            if (valor>=0){
                suma= suma+ valor;
                i++;
            }
        } while(valor>=0);
            if (i>0){
                System.out.printf("La media es %f", suma/i);
            }
        sc.close();
    }
}
