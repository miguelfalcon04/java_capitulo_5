import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int cant=0;
        float cantimp=0;
        int mpar=0;
        float sumaimp=0;
        do{
            System.out.print("Introduzca un numero: ");
            n=s.nextInt();
            if(n>0){
                if(n%2!=0){
                    cant=cant+1;
                    cantimp=cantimp+1;
                    sumaimp=sumaimp+n;
                }
                else
                if(n%2==0 && n>mpar){
                    mpar=n;
                    cant=cant+1;
                }
            }
        }while(n>=0);
        System.out.println("Se han introducido "+cant+" numeros");
        System.out.printf("La media de los numeros impares es: %.2f\n",sumaimp/cantimp);
        System.out.println("El mayor de los numeros pares es: "+mpar);
    s.close();
    }
}

