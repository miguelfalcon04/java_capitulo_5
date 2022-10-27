import java.util.Scanner;
public class Ejercicio9{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca su numero: ");
        long n = s.nextLong();
        int i=1;
        do{
            n/=10;
            i+=1;
        }while(n/10!=0);
        System.out.print("Su numero tiene " +i+ " cifras");
        s.close();
    }
}