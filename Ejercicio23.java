import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float suma=0;
        float total=0;
        System.out.println("Introduzca numeros hasta que la suma de ellos sobrepase 10000:");
        do{
            int n =s.nextInt();
            suma=suma+n;
            total=total+1;
        }while(suma<=10000);
        System.out.println("El valor acumulado es: "+(int)suma);
        System.out.println("El total de los numeros introducidos es de: "+(int)total);
        System.out.printf("La media de los numeros introducidos es de: %.2f\n",(suma/total));
    s.close();
    }
}
