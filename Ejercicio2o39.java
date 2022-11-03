import java.util.Scanner;
public class Ejercicio2o39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero entero positivo: ");
        int n = s.nextInt();
        long fact = 1;
        System.out.printf("%d!=",n);
        if(n<0){
            System.out.print("Error");
        }
        else if(n==0){
            System.out.print("1");
        }
        else{
            for(int i=n;i>1;i--){
                fact*=i;
                System.out.printf("%dx",i);
            }
        System.out.printf("1=%d",fact);
        }
        s.close();
    }
}

